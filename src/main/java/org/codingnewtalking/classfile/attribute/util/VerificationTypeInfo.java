package org.codingnewtalking.classfile.attribute.util;

/**
 * @author lixinjie
 * @since 2019-08-09
 */
public class VerificationTypeInfo {

	private byte[] bytes;
	private int offset;
	
	private VariableInfo variableInfo;

	public VerificationTypeInfo(byte[] bytes, int offset) {
		this.bytes = bytes;
		this.offset = offset;
	}
	
	public int getByteOffset() {
		return offset;
	}
	
	public int getByteLength() {
		return VariableInfoBuilder.getByteLength(bytes, offset);
	}

	public VariableInfo getVariableInfo() {
		if (variableInfo == null) {
			variableInfo = VariableInfoBuilder.build(bytes, offset);
		}
		return variableInfo;
	}

	@Override
	public String toString() {
		return "VerificationTypeInfo [getVariableInfo()=" + getVariableInfo() + "]";
	}
	
	public static int getByteLength(byte[] bytes, int offset) {
		return VariableInfoBuilder.getByteLength(bytes, offset);
	}
}
