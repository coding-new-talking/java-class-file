package org.codingnewtalking.classfile.attribute.util;

/**
 * @author lixinjie
 * @since 2019-08-09
 */
public abstract class VariableInfo {

	protected byte[] bytes;
	protected int offset;
	
	private VariableInfoTag tag;
	
	public VariableInfo(byte[] bytes, int offset) {
		this.bytes = bytes;
		this.offset = offset;
	}
	
	public abstract int getByteOffset();
	
	public abstract int getByteLength();
	
	public VariableInfoTag getTag() {
		if (tag == null) {
			tag = new VariableInfoTag(bytes, offset);
		}
		return tag;
	}
}
