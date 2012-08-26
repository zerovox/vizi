package com.tslatcher.vee.functions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.tslatcher.vee.FunctionWrapper;
import com.tslatcher.vee.Value;
import com.tslatcher.vee.data.num.Num;

public class Plus extends FunctionWrapper {
	public static final Set<String> parameters = new HashSet<String>(Arrays.asList(new String[] { "a", "b" }));

	@Override
	public Set<String> getParameterNames() {
		return parameters;
	}

	@Override
	public Value getValue() throws UnwiredException, TypeException {
		try {
			return ((Num) get("a").getValue()).plus((Num) get("b").getValue());
		} catch (Exception e) {
			e.printStackTrace();
			throw new TypeException();
		}
	}

}
