package com.tslatcher.vee.functions;

import com.tslatcher.vee.Argument;
import com.tslatcher.vee.Value;
import com.tslatcher.vee.data.num.Num;

public class Plus extends Function<Value<Num>, Function<Argument<Num>, Value<Num>>> {

	@Override
	public Function<Argument<Num>, Value<Num>> compute(Value<Num> a) throws UnwiredException {
		if (a == null)
			throw new UnwiredException();
		final Value<Num> c = a;
		return new Function<Argument<Num>, Value<Num>>() {

			@Override
			public Value<Num> compute(Argument<Num> a) throws UnwiredException {
				return new Value<Num>(a.getValue().plus(c.getValue()));
			}
		};
	}
}
