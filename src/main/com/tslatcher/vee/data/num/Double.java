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
	public java.lang.Number getValue() {
		// TODO Auto-generated method stub
		return d;
	}

	@Override
	public Num plus(Num num) {
		return new Double(d + num.getValue().doubleValue());
	}

}
