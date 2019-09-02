package org.codingnewtalking.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lixinjie
 * @since 2019-09-01
 */
public class ParameterAccessFlagsUtils {

	public static final int ACC_FINAL = 0x0010;
	public static final int ACC_SYNTHETIC = 0x1000;
	public static final int ACC_MANDATED = 0x8000;
	
	public static String getHexString(int accessFlags) {
		return HexUtils.toHexString(accessFlags);
	}
	
	public static boolean isFinal(int accessFlags) {
		return (accessFlags & ACC_FINAL) != 0;
	}
	
	public static boolean isSynthetic(int accessFlags) {
		return (accessFlags & ACC_SYNTHETIC) != 0;
	}
	
	public static boolean isMandated(int accessFlags) {
		return (accessFlags & ACC_MANDATED) != 0;
	}
	
	public static String[] getJvmString(int accessFlags) {
		List<String> flagsString = new ArrayList<>();
		if (isFinal(accessFlags)) {
			flagsString.add("ACC_FINAL");
		}
		if (isSynthetic(accessFlags)) {
			flagsString.add("ACC_SYNTHETIC");
		}
		if (isMandated(accessFlags)) {
			flagsString.add("ACC_MANDATED");
		}
		return CollectionUtils.toArray(flagsString, String.class);
	}
	
	public static String[] getJavaString(int accessFlags) {
		List<String> flagsString = new ArrayList<>();
		if (isFinal(accessFlags)) {
			flagsString.add("final");
		}
		if (isSynthetic(accessFlags)) {
			flagsString.add("synthetic");
		}
		return CollectionUtils.toArray(flagsString, String.class);
	}
}
