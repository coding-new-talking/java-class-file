package org.codingnewtalking.classfile.constantpool;

import org.codingnewtalking.classfile.constantpool.util.ConstantEntryTag;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public abstract class ConstantEntry {
	
	protected byte[] bytes;
	protected int offset;
	
	protected ConstantEntryTag tag;
	
	public ConstantEntry(byte[] bytes, int offset) {
		this.bytes = bytes;
		this.offset = offset;
	}
	
	public abstract int getByteOffset();
	
	public abstract int getByteLength();
	
	public int getTag() {
		if (tag == null) {
			tag = new ConstantEntryTag(bytes, offset);
		}
		return tag.getTag();
	}
}
