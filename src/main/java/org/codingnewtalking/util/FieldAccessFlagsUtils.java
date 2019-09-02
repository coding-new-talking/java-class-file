package org.codingnewtalking.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lixinjie
 * @since 2019-08-31
 */
public class FieldAccessFlagsUtils {
	
	public static final int ACC_PUBLIC = 0x0001;
	public static final int ACC_PRIVATE = 0x0002;
	public static final int ACC_PROTECTED = 0x0004;
	public static final int ACC_STATIC = 0x0008;
	public static final int ACC_FINAL = 0x0010;
	public static final int ACC_VOLATILE = 0x0040;
	public static final int ACC_TRANSIENT = 0x0080;
	public static final int ACC_SYNTHETIC = 0x1000;
	public static final int ACC_ENUM = 0x4000;
	
	public static String getHexString(int accessFlags) {
		return HexUtils.toHexString(accessFlags);
	}
	
	public static boolean isPublic(int accessFlags) {
		return (accessFlags & ACC_PUBLIC) != 0;
	}
	
	public static boolean isPrivate(int accessFlags) {
		return (accessFlags & ACC_PRIVATE) != 0;
	}
	
	public static boolean isProtected(int accessFlags) {
		return (accessFlags & ACC_PROTECTED) != 0;
	}
	
	public static boolean isStatic(int accessFlags) {
		return (accessFlags & ACC_STATIC) != 0;
	}
	
	public static boolean isFinal(int accessFlags) {
		return (accessFlags & ACC_FINAL) != 0;
	}
	
	public static boolean isVolatile(int accessFlags) {
		return (accessFlags & ACC_VOLATILE) != 0;
	}
	
	public static boolean isTransient(int accessFlags) {
		return (accessFlags & ACC_TRANSIENT) != 0;
	}
	
	public static boolean isSynthetic(int accessFlags) {
		return (accessFlags & ACC_SYNTHETIC) != 0;
	}
	
	public static boolean isEnum(int accessFlags) {
		return (accessFlags & ACC_ENUM) != 0;
	}

	public static String[] getJvmString(int accessFlags) {
		List<String> flagsString = new ArrayList<>();
		if (isPublic(accessFlags)) {
			flagsString.add("ACC_PUBLIC");
		}
		if (isPrivate(accessFlags)) {
			flagsString.add("ACC_PRIVATE");
		}
		if (isProtected(accessFlags)) {
			flagsString.add("ACC_PROTECTED");
		}
		if (isStatic(accessFlags)) {
			flagsString.add("ACC_STATIC");
		}
		if (isFinal(accessFlags)) {
			flagsString.add("ACC_FINAL");
		}
		if (isVolatile(accessFlags)) {
			flagsString.add("ACC_VOLATILE");
		}
		if (isTransient(accessFlags)) {
			flagsString.add("ACC_TRANSIENT");
		}
		if (isSynthetic(accessFlags)) {
			flagsString.add("ACC_SYNTHETIC");
		}
		if (isEnum(accessFlags)) {
			flagsString.add("ACC_ENUM");
		}
		return CollectionUtils.toArray(flagsString, String.class);
	}
	
	public static String[] getJavaString(int accessFlags) {
		List<String> flagsString = new ArrayList<>();
		if (isPublic(accessFlags)) {
			flagsString.add("public");
		}
		if (isPrivate(accessFlags)) {
			flagsString.add("private");
		}
		if (isProtected(accessFlags)) {
			flagsString.add("protected");
		}
		if (isStatic(accessFlags)) {
			flagsString.add("static");
		}
		if (isFinal(accessFlags)) {
			flagsString.add("final");
		}
		if (isVolatile(accessFlags)) {
			flagsString.add("volatile");
		}
		if (isTransient(accessFlags)) {
			flagsString.add("transient");
		}
		if (isSynthetic(accessFlags)) {
			flagsString.add("synthetic");
		}
		return CollectionUtils.toArray(flagsString, String.class);
	}
}
