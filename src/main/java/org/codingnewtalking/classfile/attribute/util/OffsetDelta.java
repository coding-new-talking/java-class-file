package org.codingnewtalking.classfile.attribute.util;

import org.codingnewtalking.unsigned.U2;

/**
 * @author lixinjie
 * @since 2019-08-09
 */
public class OffsetDelta {
	
	private U2 u2;
	
	public OffsetDelta(byte[] bytes, int offset) {
		this.u2 = new U2(bytes, offset);
	}
	
	public int getOffsetDelta() {
		return u2.getValue();
	}

	@Override
	public String toString() {
		return "OffsetDeltaDelta [getOffsetDelta()=" + getOffsetDelta() + "]";
	}
}
