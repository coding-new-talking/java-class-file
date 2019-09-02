package org.codingnewtalking.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lixinjie
 * @since 2019-08-31
 */
public class AccessFlagsUtils {
	
	public static final int ACC_PUBLIC = 0x0001;
	public static final int ACC_FINAL = 0x0010;
	public static final int ACC_SUPER = 0x0020;
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
	
	public static boolean isFinal(int accessFlags) {
		return (accessFlags & ACC_FINAL) != 0;
	}
	public static boolean isSuper(int accessFlags) {
		return (accessFlags & ACC_SUPER) != 0;
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
		if (isFinal(accessFlags)) {
			flagsString.add("ACC_FINAL");
		}
		if (isSuper(accessFlags)) {
			flagsString.add("ACC_SUPER");
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
		if (isSynthetic(accessFlags)) {
			flagsString.add("synthetic");
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
