package com.tslatcher.vee.data.num;

public class Double extends Num {
	private final double d;

	public Double(double _double) {
		d = _double;
	}

	@Override
	public String typeString() {
		return "double";
	}

	@Override
	public Num plus(Num num) {
		return new Double(d + num.getNumber().doubleValue());
	}

	@Override
	public Number getNumber() {
		return d;
	}

}
