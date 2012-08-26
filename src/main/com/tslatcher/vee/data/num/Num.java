package com.tslatcher.vee.data.num;

import com.tslatcher.vee.data.Data;

public abstract class Num implements Data {
	public abstract java.lang.Number getValue();

	@Override
	public String typeString() {
		return "num";
	}

	public abstract Num plus(Num num);
}
