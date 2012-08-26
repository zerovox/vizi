package com.tslatcher.vee;

import com.tslatcher.vee.functions.TypeException;
import com.tslatcher.vee.functions.UnwiredException;

public class Input implements Value {

	Value in;

	public void setIn(Value _in) {
		in = _in;
	}

	@Override
	public Value getValue() throws UnwiredException, TypeException {
		return in.getValue();
	}

}
