package com.tslatcher.vee;

import com.tslatcher.vee.functions.TypeException;
import com.tslatcher.vee.functions.UnwiredException;

public interface Value {
	public Value getValue() throws UnwiredException, TypeException;

}
