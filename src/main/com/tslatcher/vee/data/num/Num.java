package com.tslatcher.vee.data.num;

import com.tslatcher.vee.data.Data;

public abstract class Num extends Data {

	@Override
	public String typeString() {
		return "num";
	}

	public abstract Number getNumber();

	public abstract Num plus(Num num);
}
