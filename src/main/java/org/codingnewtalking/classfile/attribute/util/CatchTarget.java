package org.codingnewtalking.classfile.attribute.util;

import org.codingnewtalking.unsigned.U2;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class CatchTarget {
	
	private U2 exceptionTableIndex;
	
	public CatchTarget(byte[] bytes, int offset) {
		this.exceptionTableIndex = new U2(bytes, offset);
	}
	
	public int getExceptionTableIndex() {
		return exceptionTableIndex.getValue();
	}

	@Override
	public String toString() {
		return "CatchTarget [getExceptionTableIndex()=" + getExceptionTableIndex() + "]";
	}
}
