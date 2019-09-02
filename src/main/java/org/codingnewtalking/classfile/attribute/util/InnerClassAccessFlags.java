package org.codingnewtalking.classfile.attribute.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.codingnewtalking.unsigned.U2;

/**
 * @author lixinjie
 * @since 2019-07-19
 */
public class InnerClassAccessFlags {

	private U2 u2;
	
	public InnerClassAccessFlags(byte[] bytes, int offset) {
		this.u2 = new U2(bytes, offset);
	}
	
	public int getByteOffset() {
		return u2.getByteOffset();
	}

	public int getByteLength() {
		return u2.getByteLength();
	}
	
	public int getAccessFlags() {
		return u2.getValue();
	}
	
	public String[] getAccessFlagsString() {
		List<String> flagsString = new ArrayList<>();
		int flags = getAccessFlags();
		if ((flags & ACC_PUBLIC) != 0) {
			flagsString.add("ACC_PUBLIC");
		}
		if ((flags & ACC_PRIVATE) != 0) {
			flagsString.add("ACC_PRIVATE");
		}
		if ((flags & ACC_PROTECTED) != 0) {
			flagsString.add("ACC_PROTECTED");
		}
		if ((flags & ACC_STATIC) != 0) {
			flagsString.add("ACC_STATIC");
		}
		if ((flags & ACC_FINAL) != 0) {
			flagsString.add("ACC_FINAL");
		}
		if ((flags & ACC_INTERFACE) != 0) {
			flagsString.add("ACC_INTERFACE");
		}
		if ((flags & ACC_ABSTRACT) != 0) {
			flagsString.add("ACC_ABSTRACT");
		}
		if ((flags & ACC_SYNTHETIC) != 0) {
			flagsString.add("ACC_SYNTHETIC");
		}
		if ((flags & ACC_ANNOTATION) != 0) {
			flagsString.add("ACC_ANNOTATION");
		}
		if ((flags & ACC_ENUM) != 0) {
			flagsString.add("ACC_ENUM");
		}
		return flagsString.toArray(new String[0]);
	}
	
	@Override
	public String toString() {
		return "InnerClassAccessFlags [getAccessFlags()=0x" + Integer.toHexString(getAccessFlags())
				+ ", getAccessFlagsString()=" + Arrays.toString(getAccessFlagsString()) + "]";
	}

	public static final int ACC_PUBLIC = 0x0001;
	public static final int ACC_PRIVATE = 0x0002;
	public static final int ACC_PROTECTED = 0x0004;
	public static final int ACC_STATIC = 0x0008;
	public static final int ACC_FINAL = 0x0010;
	public static final int ACC_INTERFACE = 0x0200;
	public static final int ACC_ABSTRACT = 0x0400;
	public static final int ACC_SYNTHETIC = 0x1000;
	public static final int ACC_ANNOTATION = 0x2080;
	public static final int ACC_ENUM = 0x4000;
}
