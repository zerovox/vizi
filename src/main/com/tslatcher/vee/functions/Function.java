package com.tslatcher.vee.functions;

import com.tslatcher.vee.Argument;

public abstract class Function<A extends Argument<?>, B extends Argument<?>> implements Argument<B> {
	private B b = null;

	private A a = null;

	public void input(A a) {
		this.a = a;
	}

	public String typeString() {
		return "";
	}

	@Override
	public synchronized B getValue() throws UnwiredException {
		if (b == null) {
			b = compute(a);
		}
		return b;
	}

	public abstract B compute(A a) throws UnwiredException;
}
