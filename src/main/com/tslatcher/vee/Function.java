package com.tslatcher.vee;

import java.util.Map;
import java.util.Set;

import com.tslatcher.vee.functions.TypeException;
import com.tslatcher.vee.functions.UnwiredException;

public class Function implements FunctionInterface {
	Map<String, Input> inputs;
	Value out;

	public void setOut(Value output) {
		out = output;
	}

	@Override
	public Value getValue() throws UnwiredException, TypeException {
		return out.getValue();
	}

	@Override
	public void wire(String parameterName, Value parameter) throws IllegalParameterNameException {
		Input in = new Input();
		in.setIn(parameter);
		inputs.put(parameterName, in);
	}

	@Override
	public boolean mutableParameters() {
		return true;
	}

	@Override
	public Set<String> getParameterNames() {
		return inputs.keySet();
	}

}
