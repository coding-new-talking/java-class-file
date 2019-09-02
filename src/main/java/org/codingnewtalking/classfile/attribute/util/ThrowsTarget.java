package org.codingnewtalking.classfile.attribute.util;

import org.codingnewtalking.unsigned.U2;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class ThrowsTarget {
	
	private U2 throwsTypeIndex;
	
	public ThrowsTarget(byte[] bytes, int offset) {
		this.throwsTypeIndex = new U2(bytes, offset);
	}
	
	public int getThrowsTypeIndex() {
		return throwsTypeIndex.getValue();
	}

	@Override
	public String toString() {
		return "ThrowsTarget [getThrowsTypeIndex()=" + getThrowsTypeIndex() + "]";
	}
}
