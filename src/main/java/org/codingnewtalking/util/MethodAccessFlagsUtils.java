package org.codingnewtalking.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lixinjie
 * @since 2019-08-31
 */
public class MethodAccessFlagsUtils {
	
	public static final int ACC_PUBLIC = 0x0001;
	public static final int ACC_PRIVATE = 0x0002;
	public static final int ACC_PROTECTED = 0x0004;
	public static final int ACC_STATIC = 0x0008;
	public static final int ACC_FINAL = 0x0010;
	public static final int ACC_SYNCHRONIZED = 0x0020;
	public static final int ACC_BRIDGE = 0x0040;
	public static final int ACC_VARARGS = 0x0080;
	public static final int ACC_NATIVE = 0x0100;
	public static final int ACC_ABSTRACT = 0x0400;
	public static final int ACC_STRICT = 0x0800;
	public static final int ACC_SYNTHETIC = 0x1000;
	
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
	
	public static boolean isSynchronized(int accessFlags) {
		return (accessFlags & ACC_SYNCHRONIZED) != 0;
	}
	
	public static boolean isBridge(int accessFlags) {
		return (accessFlags & ACC_BRIDGE) != 0;
	}
	
	public static boolean isVarargs(int accessFlags) {
		return (accessFlags & ACC_VARARGS) != 0;
	}
	
	public static boolean isNative(int accessFlags) {
		return (accessFlags & ACC_NATIVE) != 0;
	}
	
	public static boolean isAbstract(int accessFlags) {
		return (accessFlags & ACC_ABSTRACT) != 0;
	}
	
	public static boolean isStrict(int accessFlags) {
		return (accessFlags & ACC_STRICT) != 0;
	}
	
	public static boolean isSynthetic(int accessFlags) {
		return (accessFlags & ACC_SYNTHETIC) != 0;
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
		if (isSynchronized(accessFlags)) {
			flagsString.add("ACC_SYNCHRONIZED");
		}
		if (isBridge(accessFlags)) {
			flagsString.add("ACC_BRIDGE");
		}
		if (isVarargs(accessFlags)) {
			flagsString.add("ACC_VARARGS");
		}
		if (isNative(accessFlags)) {
			flagsString.add("ACC_NATIVE");
		}
		if (isAbstract(accessFlags)) {
			flagsString.add("ACC_ABSTRACT");
		}
		if (isStrict(accessFlags)) {
			flagsString.add("ACC_STRICT");
		}
		if (isSynthetic(accessFlags)) {
			flagsString.add("ACC_SYNTHETIC");
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
		if (isSynchronized(accessFlags)) {
			flagsString.add("synchronized");
		}
		if (isNative(accessFlags)) {
			flagsString.add("native");
		}
		if (isAbstract(accessFlags)) {
			flagsString.add("abstract");
		}
		if (isBridge(accessFlags)) {
			flagsString.add("bridge");
		}
		if (isSynthetic(accessFlags)) {
			flagsString.add("synthetic");
		}
		return CollectionUtils.toArray(flagsString, String.class);
	}
}
