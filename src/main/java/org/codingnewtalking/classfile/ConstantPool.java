package org.codingnewtalking.classfile;

import org.codingnewtalking.classfile.constantpool.ConstantClass;
import org.codingnewtalking.classfile.constantpool.ConstantEntry;
import org.codingnewtalking.classfile.constantpool.ConstantEntryBuilder;
import org.codingnewtalking.classfile.constantpool.ConstantUtf8;

/**
 * @author lixinjie
 * @since 2019-07-10
 */
public class ConstantPool {
	
	private byte[] bytes;
	private int offset;
	private int length;
	
	private int constantPoolCount;
	private ConstantEntry[] constantEntries;
	
	public ConstantPool(byte[] bytes, int offset, int constantPoolCount) {
		this.bytes = bytes;
		this.offset = offset;
		this.constantPoolCount = constantPoolCount;
	}
	
	public int getByteOffset() {
		return offset;
	}
	
	public int getByteLength() {
		if (length == 0) {
			ConstantEntryBuilder builder = ConstantEntryBuilder.newBuilder(bytes);
			//第0个位置不使用，从第1个位置开始
			for (int i = 1; i < constantPoolCount; i++) {
				length += builder.getByteLength(offset + length);
				//对于long和double类型
				//一个entry占两个索引
				//这是历史遗留问题
				if (builder.getIndexDelta() == 1) {
					++i;
				}
			}
		}
		return length;
	}
	
	public ConstantEntry[] getConstantEntries() {
		if (constantEntries == null) {
			constantEntries = new ConstantEntry[constantPoolCount];
			//第0个位置不使用，从第1个位置开始
			constantEntries[0] = null;
			ConstantEntryBuilder builder = ConstantEntryBuilder.newBuilder(bytes);
			int length = 0;
			for (int i = 1; i < constantPoolCount; i++) {
				constantEntries[i] = builder.build(offset + length);
				length += constantEntries[i].getByteLength();
				//对于long和double类型
				//一个entry占两个索引
				//这是历史遗留问题
				if (builder.getIndexDelta() == 1) {
					constantEntries[++i] = null;
				}
			}
		}
		return constantEntries;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("ConstantPool [\r\n");
		for (int i = 0; i < constantPoolCount; i++) {
			sb.append("#" + i + " = ").append(getConstantEntries()[i]).append("\r\n");
		}
		sb.append("]");
		return sb.toString();
	}
	
	public ConstantEntry getConstantEntry(int index) {
		return getConstantEntries()[index];
	}
	
	public ConstantClass getConstantClass(int index) {
		return (ConstantClass)getConstantEntry(index);
	}
	
	public String getConstantClassName(int index) {
		return getConstantUtf8String(getConstantClass(index).getNameIndex());
	}
	
	public ConstantUtf8 getConstantUtf8(int index) {
		return (ConstantUtf8)getConstantEntry(index);
	}
	
	public String getConstantUtf8String(int index) {
		return getConstantUtf8(index).getString();
	}
}
