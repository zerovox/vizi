package com.tslatcher.vee.data.num;

public class Float extends Num {
	private final float a;

	public Float(float a) {
		this.a = a;
	}

	public String typeString() {
		return "float";
	}

	public java.lang.Number getValue() {
		return a;
	}

	@Override
	public Num plus(Num num) {
		return new Double(a + num.getValue().doubleValue());
	}
}
