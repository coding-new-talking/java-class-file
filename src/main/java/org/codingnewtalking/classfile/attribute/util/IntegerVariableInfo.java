package org.codingnewtalking.classfile.attribute.util;

/**
 * @author lixinjie
 * @since 2019-08-09
 */
public class IntegerVariableInfo extends VariableInfo {

	public IntegerVariableInfo(byte[] bytes, int offset) {
		super(bytes, offset);
	}
	
	public int getByteOffset() {
		return offset;
	}
	
	public int getByteLength() {
		return 1;
	}
}
