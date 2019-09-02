package org.codingnewtalking.classfile.constantpool.util;

import org.codingnewtalking.unsigned.U1;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class ConstantEntryTag {
	
	private U1 u1;
	
	public ConstantEntryTag(byte[] bytes, int offset) {
		this.u1 = new U1(bytes, offset);
	}
	
	public int getByteOffset() {
		return u1.getByteOffset();
	}

	public int getByteLength() {
		return u1.getByteLength();
	}
	
	public int getTag() {
		return u1.getValue();
	}

	@Override
	public String toString() {
		return "ConstantEntryTag [getTag()=" + getTag() + "]";
	}
	
	public static final int ConstantClass_Tag = 7;
	public static final int ConstantFieldRef_Tag = 9;
	public static final int ConstantMethodRef_Tag = 10;
	public static final int ConstantInterfaceMethodRef_Tag = 11;
	public static final int ConstantString_Tag = 8;
	public static final int ConstantInteger_Tag = 3;
	public static final int ConstantFloat_Tag = 4;
	public static final int ConstantLong_Tag = 5;
	public static final int ConstantDouble_Tag = 6;
	public static final int ConstantNameAndType_Tag = 12;
	public static final int ConstantUtf8_Tag = 1;
	public static final int ConstantMethodHandle_Tag = 15;
	public static final int ConstantMethodType_Tag = 16;
	public static final int ConstantInvokeDynamic_Tag = 18;
}
