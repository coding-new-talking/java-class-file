package org.codingnewtalking.classfile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.codingnewtalking.unsigned.U2;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class AccessFlags {
	
	private U2 u2;
	
	public AccessFlags(byte[] bytes, int offset) {
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
		if ((flags & ACC_FINAL) != 0) {
			flagsString.add("ACC_FINAL");
		}
		if ((flags & ACC_SUPER) != 0) {
			flagsString.add("ACC_SUPER");
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
		return "AccessFlags [getAccessFlags()=0x" + Integer.toHexString(getAccessFlags()) + ", getAccessFlagsString()="
				+ Arrays.toString(getAccessFlagsString()) + "]";
	}

	public static final int ACC_PUBLIC = 0x0001;
	public static final int ACC_FINAL = 0x0010;
	public static final int ACC_SUPER = 0x0020;
	public static final int ACC_INTERFACE = 0x0200;
	public static final int ACC_ABSTRACT = 0x0400;
	public static final int ACC_SYNTHETIC = 0x1000;
	public static final int ACC_ANNOTATION = 0x2000;
	public static final int ACC_ENUM = 0x4000;
}
