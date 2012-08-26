package com.tslatcher.vee;

import java.util.Set;

public interface FunctionInterface extends Value {
	public abstract boolean mutableParameters();

	public Set<String> getParameterNames();

	public abstract void wire(String parameterName, Value parameter) throws IllegalParameterNameException;

}