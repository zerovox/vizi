package com.tslatcher.vee.data.num;

public class Int extends Num {
	private final Integer a;

	public Int(Integer a) {
		this.a = a;
	}

	public String typeString() {
		return "int";
	}

	@Override
	public Num plus(Num num) {
		return new Double(a + num.getNumber().doubleValue());
	}

	@Override
	public Number getNumber() {
		return a;
	}
}
