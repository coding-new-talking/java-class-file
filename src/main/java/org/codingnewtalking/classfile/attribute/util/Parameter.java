package org.codingnewtalking.classfile.attribute.util;

import org.codingnewtalking.classfile.util.Index2;

/**
 * @author lixinjie
 * @since 2019-07-19
 */
public class Parameter {
	
	private byte[] bytes;
	private int offset;
	
	private Index2 nameIndex;
	private ParameterAccessFlags accessFlags;
	
	public Parameter(byte[] bytes, int offset) {
		this.bytes = bytes;
		this.offset = offset;
	}
	
	public int getNameIndex() {
		if (nameIndex == null) {
			nameIndex = new Index2(bytes, offset);
		}
		return nameIndex.getIndex();
	}
	
	public int getAccessFlags() {
		if (accessFlags == null) {
			accessFlags = new ParameterAccessFlags(bytes, offset + 2);
		}
		return accessFlags.getAccessFlags();
	}

	@Override
	public String toString() {
		return "Parameter [getNameIndex()=" + getNameIndex() + ", getAccessFlags()=0x" + Integer.toHexString(getAccessFlags()) + "]";
	}
}
