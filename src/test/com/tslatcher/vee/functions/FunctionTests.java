package com.tslatcher.vee.functions;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tslatcher.vee.Argument;
import com.tslatcher.vee.Value;
import com.tslatcher.vee.data.num.Int;
import com.tslatcher.vee.data.num.Num;
import com.tslatcher.vee.functions.Function;
import com.tslatcher.vee.functions.Plus;
import com.tslatcher.vee.functions.UnwiredException;

public class FunctionTests {

	@Test
	public void test() throws UnwiredException {
		Plus p = new Plus();
		Value<Num> six = new Value<Num>(new Int(6));
		Value<Num> five = new Value<Num>(new Int(5));
		p.input(six);
		p.getValue().input(five);
		Value<Num> num = p.getValue().getValue();
		assertEquals(num.getValue().getValue(), 11.0);
	}

	/**
	 * In this test, we creat an instance of Lazyboy (a -> b -> b) which ignores it's first parameter entirely. This means we don't even need to give it a first
	 * parameter, we simply grab it's value. In this sense, it is just a Value<Function<A,A>>. However, if we attempt to get the value of b without inputing
	 * one, it throws an error.
	 * 
	 * @throws UnwiredException
	 */
	@Test
	public void arewelazyenough() throws UnwiredException {
		Lazyboy l = new Lazyboy();
		Value<Num> six = new Value<Num>(new Int(6));
		l.getValue().input(six);
		assertEquals(l.getValue().getValue(), six);

		boolean exceptional = false;
		Lazyboy m = new Lazyboy();
		try {
			m.getValue().getValue();
		} catch (UnwiredException e) {
			exceptional = true;
		}
		assertTrue("Unwired Exception should have been thrown", exceptional);
	}

	public class Lazyboy extends Function<Argument<?>, Function<Argument<?>, Argument<?>>> {

		@Override
		public Function<Argument<?>, Argument<?>> compute(Argument<?> a) throws UnwiredException {
			return new Function<Argument<?>, Argument<?>>() {

				@Override
				public Argument<?> compute(Argument<?> a) throws UnwiredException {
					if (a == null)
						throw new UnwiredException();
					return a;
				}
			};
		}

	}

}
