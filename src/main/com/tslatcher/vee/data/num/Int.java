package com.tslatcher.vee.data.num;

public class Int extends Num {
	private final Integer a;

	public Int(Integer a) {
		this.a = a;
	}

	public String typeString() {
		return "int";
	}

	public java.lang.Number getValue() {
		return a;
	}

	@Override
	public Num plus(Num num) {
		return new Double(a + num.getValue().doubleValue());
	}
}
