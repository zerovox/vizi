package com.tslatcher.vee.data;

import com.tslatcher.vee.Value;
import com.tslatcher.vee.functions.UnwiredException;

public abstract class Data implements Value {
	public abstract String typeString();

	@Override
	public Value getValue() throws UnwiredException {
		return this;
	}

}
