package com.tslatcher.vee.functions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.tslatcher.vee.Value;
import com.tslatcher.vee.data.num.Int;
import com.tslatcher.vee.data.num.Num;

public class FunctionTests {

	@Test
	public void test() throws UnwiredException, TypeException {
		Plus p = new Plus();
		Value six = new Int(6);
		Value five = new Int(5);
		p.wire("a", six);
		p.wire("b", five);
		Value num = p.getValue();
		assertTrue(num instanceof Num);

		assertEquals(((Num) num).getNumber(), 11.0);
	}

}
