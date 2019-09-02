package org.codingnewtalking.classfile.attribute.util;

import org.codingnewtalking.classfile.util.Index2;
import org.codingnewtalking.classfile.util.Length2;

/**
 * @author lixinjie
 * @since 2019-07-19
 */
public class LocalVarTable {
	
	private byte[] bytes;
	private int offset;
	
	private StartPc startPc;
	private Length2 length;
	private Index2 nameIndex;
	private Index2 descriptorIndex;
	private Index2 index;
	
	public LocalVarTable(byte[] bytes, int offset) {
		this.bytes = bytes;
		this.offset = offset;
	}
	
	public int getStartPc() {
		if (startPc == null) {
			startPc = new StartPc(bytes, offset);
		}
		return startPc.getStartPc();
	}
	
	public int getLength() {
		if (length == null) {
			length = new Length2(bytes, offset + 2);
		}
		return length.getLength();
	}
	
	public int getNameIndex() {
		if (nameIndex == null) {
			nameIndex = new Index2(bytes, offset + 4);
		}
		return nameIndex.getIndex();
	}
	
	public int getDescriptorIndex() {
		if (descriptorIndex == null) {
			descriptorIndex = new Index2(bytes, offset + 6);
		}
		return descriptorIndex.getIndex();
	}
	
	public int getIndex() {
		if (index == null) {
			index = new Index2(bytes, offset + 8);
		}
		return index.getIndex();
	}

	@Override
	public String toString() {
		return "LocalVarTable [getStartPc()=" + getStartPc() + ", getLength()=" + getLength() + ", getNameIndex()="
				+ getNameIndex() + ", getDescriptorIndex()=" + getDescriptorIndex() + ", getIndex()=" + getIndex()
				+ "]";
	}
}
