package com.tslatcher.vee;

import com.tslatcher.vee.data.Data;

public class Value<T extends Data> implements Argument<T> {
	private T value;

	public Value(T t) {
		value = t;
	}

	@Override
	public T getValue() {
		return value;
	}

}
