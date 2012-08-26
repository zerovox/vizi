package com.tslatcher.vee;

import com.tslatcher.vee.functions.UnwiredException;

public interface Argument<Return> {
	public Return getValue() throws UnwiredException;
}
