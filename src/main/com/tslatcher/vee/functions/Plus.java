package com.tslatcher.vee.functions;

import com.tslatcher.vee.FunctionInterface;
import com.tslatcher.vee.Value;
import com.tslatcher.vee.data.num.Num;

public class Plus implements FunctionInterface {
	Value a;
	Value b;

	@Override
	public Value getValue() throws UnwiredException, TypeException {
		if (a == null || b == null)
			throw new UnwiredException();
		try {
			return ((Num) a.getValue()).plus((Num) b.getValue());
		} catch (Exception e) {
			e.printStackTrace();
			throw new TypeException();
		}

	}

	@Override
	public void wire(String parameterName, Value parameter) {
		if (parameterName.equals("a"))
			a = parameter;
		if (parameterName.equals("b"))
			b = parameter;
	}

}
