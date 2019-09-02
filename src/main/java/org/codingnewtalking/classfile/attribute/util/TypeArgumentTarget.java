package org.codingnewtalking.classfile.attribute.util;

import org.codingnewtalking.unsigned.U1;
import org.codingnewtalking.unsigned.U2;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class TypeArgumentTarget {
	
	private U2 offset;
	private U1 typeArgumentIndex;
	
	public TypeArgumentTarget(byte[] bytes, int offset) {
		this.offset = new U2(bytes, offset);
		this.typeArgumentIndex = new U1(bytes, offset + 2);
	}
	
	public int getOffset() {
		return offset.getValue();
	}
	
	public int getTypeArgumentIndex() {
		return typeArgumentIndex.getValue();
	}

	@Override
	public String toString() {
		return "TypeArgumentTarget [getOffset()=" + getOffset() + ", getTypeArgumentIndex()=" + getTypeArgumentIndex()+ "]";
	}
}
