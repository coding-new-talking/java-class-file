package org.codingnewtalking.classfile.constantpool;

import org.codingnewtalking.classfile.constantpool.util.ConstantEntryTag;
import org.codingnewtalking.util.ByteUtils;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class ConstantEntryBuilder {

	private byte[] bytes;
	private int indexDelta;
	
	private ConstantEntryBuilder(byte[] bytes) {
		this.bytes = bytes;
	}
	
	public static ConstantEntryBuilder newBuilder(byte[] bytes) {
		return new ConstantEntryBuilder(bytes);
	}
	
	public ConstantEntry build(int offset) {
		int tag = ByteUtils.toUnsigned(bytes[offset]);
		switch (tag) {
			case ConstantEntryTag.ConstantClass_Tag:
				indexDelta = 0;
				return new ConstantClass(bytes, offset);
			case ConstantEntryTag.ConstantFieldRef_Tag:
				indexDelta = 0;
				return new ConstantFieldRef(bytes, offset);
			case ConstantEntryTag.ConstantMethodRef_Tag:
				indexDelta = 0;
				return new ConstantMethodRef(bytes, offset);
			case ConstantEntryTag.ConstantInterfaceMethodRef_Tag:
				indexDelta = 0;
				return new ConstantInterfaceMethodRef(bytes, offset);
			case ConstantEntryTag.ConstantString_Tag:
				indexDelta = 0;
				return new ConstantString(bytes, offset);
			case ConstantEntryTag.ConstantInteger_Tag:
				indexDelta = 0;
				return new ConstantInteger(bytes, offset);
			case ConstantEntryTag.ConstantFloat_Tag:
				indexDelta = 0;
				return new ConstantFloat(bytes, offset);
			case ConstantEntryTag.ConstantLong_Tag:
				indexDelta = 1;
				return new ConstantLong(bytes, offset);
			case ConstantEntryTag.ConstantDouble_Tag:
				indexDelta = 1;
				return new ConstantDouble(bytes, offset);
			case ConstantEntryTag.ConstantNameAndType_Tag:
				indexDelta = 0;
				return new ConstantNameAndType(bytes, offset);
			case ConstantEntryTag.ConstantUtf8_Tag:
				indexDelta = 0;
				return new ConstantUtf8(bytes, offset);
			case ConstantEntryTag.ConstantMethodHandle_Tag:
				indexDelta = 0;
				return new ConstantMethodHandle(bytes, offset);
			case ConstantEntryTag.ConstantMethodType_Tag:
				indexDelta = 0;
				return new ConstantMethodType(bytes, offset);
			case ConstantEntryTag.ConstantInvokeDynamic_Tag:
				indexDelta = 0;
				return new ConstantInvokeDynamic(bytes, offset);
		}
		throw new IllegalArgumentException("tag=" + tag);
	}
	
	public int getIndexDelta() {
		return indexDelta;
	}

	public int getByteLength(int offset) {
		int tag = ByteUtils.toUnsigned(bytes[offset]);
		switch (tag) {
			case ConstantEntryTag.ConstantClass_Tag:
				indexDelta = 0;
				return 3;
			case ConstantEntryTag.ConstantFieldRef_Tag:
				indexDelta = 0;
				return 5;
			case ConstantEntryTag.ConstantMethodRef_Tag:
				indexDelta = 0;
				return 5;
			case ConstantEntryTag.ConstantInterfaceMethodRef_Tag:
				indexDelta = 0;
				return 5;
			case ConstantEntryTag.ConstantString_Tag:
				indexDelta = 0;
				return 3;
			case ConstantEntryTag.ConstantInteger_Tag:
				indexDelta = 0;
				return 5;
			case ConstantEntryTag.ConstantFloat_Tag:
				indexDelta = 0;
				return 5;
			case ConstantEntryTag.ConstantLong_Tag:
				indexDelta = 1;
				return 9;
			case ConstantEntryTag.ConstantDouble_Tag:
				indexDelta = 1;
				return 9;
			case ConstantEntryTag.ConstantNameAndType_Tag:
				indexDelta = 0;
				return 5;
			case ConstantEntryTag.ConstantUtf8_Tag:
				indexDelta = 0;
				return 3 + ByteUtils.toUnsigned(bytes, offset + 1, 2);
			case ConstantEntryTag.ConstantMethodHandle_Tag:
				indexDelta = 0;
				return 4;
			case ConstantEntryTag.ConstantMethodType_Tag:
				indexDelta = 0;
				return 3;
			case ConstantEntryTag.ConstantInvokeDynamic_Tag:
				indexDelta = 0;
				return 5;
		}
		throw new IllegalArgumentException("tag=" + tag);
	}
}
