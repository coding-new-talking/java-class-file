package org.codingnewtalking.classfile.attribute.util;

import org.codingnewtalking.classfile.ConstantPool;
import org.codingnewtalking.classfile.util.Index2;
import org.codingnewtalking.classfile.util.Length2;

/**
 * @author lixinjie
 * @since 2019-07-19
 */
public class LocalVarTable {
	
	private byte[] bytes;
	private int offset;
	private ConstantPool constantPool;
	
	private StartPc startPc;
	private Length2 length;
	private Index2 nameIndex;
	private Index2 descriptorIndex;
	private Index2 index;
	
	public LocalVarTable(byte[] bytes, int offset, ConstantPool constantPool) {
		this.bytes = bytes;
		this.offset = offset;
		this.constantPool = constantPool;
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
	
	public String getName() {
		return constantPool.getConstantUtf8String(getNameIndex());
	}
	
	public int getDescriptorIndex() {
		if (descriptorIndex == null) {
			descriptorIndex = new Index2(bytes, offset + 6);
		}
		return descriptorIndex.getIndex();
	}
	
	public String getDescriptor() {
		return constantPool.getConstantUtf8String(getDescriptorIndex());
	}
	
	public int getIndex() {
		if (index == null) {
			index = new Index2(bytes, offset + 8);
		}
		return index.getIndex();
	}

	public String toString(String baseBlank) {
		String blank15 = "               ";
		return baseBlank
				+ "LocalVarTable [getStartPc()=" + getStartPc() + ", getLength()=" + getLength()
				+ ", getNameIndex()=" + getNameIndex() + ", getName()=" + getName() + ", \r\n"
				+ baseBlank + blank15 + "getDescriptorIndex()=" + getDescriptorIndex() + ", getDescriptor()=" + getDescriptor() + ", \r\n"
				+ baseBlank + blank15 + "getIndex()=" + getIndex() + "\r\n"
				+ baseBlank + blank15 + "]";
	}
}
