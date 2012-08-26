package com.tslatcher.vee;

public interface FunctionInterface extends Value {

	public abstract void wire(String parameterName, Value parameter);

}