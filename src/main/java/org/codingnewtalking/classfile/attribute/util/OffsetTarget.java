package org.codingnewtalking.classfile.attribute.util;

import org.codingnewtalking.unsigned.U2;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class OffsetTarget {
	
	private U2 offset;
	
	public OffsetTarget(byte[] bytes, int offset) {
		this.offset = new U2(bytes, offset);
	}
	
	public int getOffset() {
		return offset.getValue();
	}

	@Override
	public String toString() {
		return "OffsetTarget [getOffset()=" + getOffset() + "]";
	}
}
