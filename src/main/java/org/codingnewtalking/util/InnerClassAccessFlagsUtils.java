package org.codingnewtalking.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lixinjie
 * @since 2019-08-31
 */
public class InnerClassAccessFlagsUtils {

	public static final int ACC_PUBLIC = 0x0001;
	public static final int ACC_PRIVATE = 0x0002;
	public static final int ACC_PROTECTED = 0x0004;
	public static final int ACC_STATIC = 0x0008;
	public static final int ACC_FINAL = 0x0010;
	public static final int ACC_INTERFACE = 0x0200;
	public static final int ACC_ABSTRACT = 0x0400;
	public static final int ACC_SYNTHETIC = 0x1000;
	public static final int ACC_ANNOTATION = 0x2000;
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
	
	public static boolean isInterface(int accessFlags) {
		return (accessFlags & ACC_INTERFACE) != 0;
	}
	
	public static boolean isAbstract(int accessFlags) {
		return (accessFlags & ACC_ABSTRACT) != 0;
	}
	
	public static boolean isSynthetic(int accessFlags) {
		return (accessFlags & ACC_SYNTHETIC) != 0;
	}
	
	public static boolean isAnnotation(int accessFlags) {
		return (accessFlags & ACC_ANNOTATION) != 0;
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
		if (isInterface(accessFlags)) {
			flagsString.add("ACC_INTERFACE");
		}
		if (isAbstract(accessFlags)) {
			flagsString.add("ACC_ABSTRACT");
		}
		if (isSynthetic(accessFlags)) {
			flagsString.add("ACC_SYNTHETIC");
		}
		if (isAnnotation(accessFlags)) {
			flagsString.add("ACC_ANNOTATION");
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
		if (isAnnotation(accessFlags)) {
			flagsString.add("@interface");
			return CollectionUtils.toArray(flagsString, String.class);
		}
		if (isInterface(accessFlags)) {
			flagsString.add("interface");
			return CollectionUtils.toArray(flagsString, String.class);
		}
		if (isEnum(accessFlags)) {
			//只有父类是java.lang.Enum时才用enum
			flagsString.add("enum");
			//如果父类不是则用class
			//flagsString.add("class");
			return CollectionUtils.toArray(flagsString, String.class);
		}
		if (isFinal(accessFlags)) {
			flagsString.add("final");
		}
		if (isAbstract(accessFlags)) {
			flagsString.add("abstract");
		}
		flagsString.add("class");
		return CollectionUtils.toArray(flagsString, String.class);
	}
}
