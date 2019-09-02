package org.codingnewtalking.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lixinjie
 * @since 2019-09-01
 */
public class JJTypeUtils {

	public static final char JVM_BYTE = 'B';
	public static final char JVM_CHAR = 'C'; 
	public static final char JVM_DOUBLE = 'D';
	public static final char JVM_FLOAT = 'F';
	public static final char JVM_INT = 'I';
	public static final char JVM_LONG = 'J';
	public static final char JVM_CLASS = 'L';
	public static final char JVM_SHORT = 'S';
	public static final char JVM_BOOLEAN = 'Z';
	public static final char JVM_ARRAY = '[';
	public static final char JVM_VOID = 'V';
	
	public static final String JAVA_BYTE = "byte";
	public static final String JAVA_CHAR = "char";
	public static final String JAVA_DOUBLE = "double";
	public static final String JAVA_FLOAT = "float";
	public static final String JAVA_INT = "int";
	public static final String JAVA_LONG = "long";
	public static final String JAVA_CLASS = "";
	public static final String JAVA_SHORT = "short";
	public static final String JAVA_BOOLEAN = "boolean";
	public static final String JAVA_ARRAY = "[]";
	public static final String JAVA_VOID = "void";
	
	public static final char JVM_CLASS_TAILER = ';';
	public static final char JVM_CLASS_DELIMITER = '/';
	public static final char JAVA_CLASS_DELIMITER = '.';
	
	public static String jvmClassNameToJava(String jvmClassName) {
		return StringUtils.replaceChar(jvmClassName, JVM_CLASS_DELIMITER, JAVA_CLASS_DELIMITER);
	}
	
	public static String[] jvmClassNameToJava(String[] jvmClassNames) {
		String[] javaClassNames = new String[jvmClassNames.length];
		ArrayUtils.map(jvmClassNames, javaClassNames, (jvmClassName) -> {
			return jvmClassNameToJava(jvmClassName);
		});
		return javaClassNames;
	}
	
	public static String[] splitJvmTypes(String jvmTypes) {
		List<String> types = new ArrayList<>(8);
		JvmTypeReader reader = new JvmTypeReader(jvmTypes);
		char jvmType;
		while (true) {
			jvmType = reader.read();
			if (isJvmPrimitive(jvmType)) {
				types.add(String.valueOf(jvmType));
				continue;
			}
			if (isJvmClass(jvmType)) {
				String remainderPart = reader.readUntil(JVM_CLASS_TAILER);
				types.add(jvmType + remainderPart);
				continue;
			}
			if (isJvmArray(jvmType)) {
				String remainderPart = reader.readUntilNot(JVM_ARRAY);
				char jt = remainderPart.charAt(remainderPart.length() - 1);
				if (isJvmPrimitive(jt)) {
					types.add(jvmType + remainderPart);
				} else if (isJvmClass(jt)) {
					String remainderPart1 = reader.readUntil(JVM_CLASS_TAILER);
					types.add(jvmType + remainderPart + remainderPart1);
				}
				continue;
			}
			if (jvmType == JvmTypeReader.EOF) {
				break;
			}
		}
		return CollectionUtils.toArray(types, String.class);
	}
	
	public static String[] jvmTypeToJava(String[] jvmTypes) {
		String[] javaTypes = new String[jvmTypes.length];
		int index = 0;
		for (String jvmType : jvmTypes) {
			javaTypes[index++] = jvmTypeToJava(jvmType);
		}
		return javaTypes;
	}
	
	public static String jvmTypeToJava(String jvmType) {
		if (jvmType.length() == 1) {
			return jvmToJavaForPrimitive(jvmType);
		}
		if (jvmType.charAt(0) == JVM_CLASS) {
			return jvmToJavaForClass(jvmType);
		}
		if (jvmType.charAt(0) == JVM_ARRAY) {
			return jvmToJavaForArray(jvmType);
		}
		throw new IllegalArgumentException(jvmType);
	}
	
	public static String jvmToJavaForPrimitive(String jvmType) {
		switch (jvmType.charAt(0)) {
			case JVM_BYTE:
				return JAVA_BYTE;
			case JVM_CHAR: 
				return JAVA_CHAR;
			case JVM_DOUBLE:
				return JAVA_DOUBLE;
			case JVM_FLOAT:
				return JAVA_FLOAT;
			case JVM_INT:
				return JAVA_INT;
			case JVM_LONG:
				return JAVA_LONG;
			case JVM_SHORT:
				return JAVA_SHORT;
			case JVM_BOOLEAN:
				return JAVA_BOOLEAN;
			case JVM_VOID:
				return JAVA_VOID;
		}
		throw new IllegalArgumentException(jvmType);
	}
	
	public static String jvmToJavaForClass(String jvmType) {
		String classType = StringUtils.subString(jvmType, 1, -1);
		classType = StringUtils.replaceChar(classType, JVM_CLASS_DELIMITER, JAVA_CLASS_DELIMITER);
		return classType;
	}
	
	public static String jvmToJavaForArray(String jvmType) {
		int index = jvmType.lastIndexOf(JVM_ARRAY);
		String array = StringUtils.headString(jvmType, index + 1);
		String type = StringUtils.tailString(jvmType, index + 1);
		array = array.replace(String.valueOf(JVM_ARRAY), JAVA_ARRAY);
		type = jvmTypeToJava(type);
		return type + array;
	}
	
	public static boolean isJvmPrimitive(char jvmType) {
		return jvmType == JVM_BYTE
			|| jvmType == JVM_CHAR 
			|| jvmType == JVM_DOUBLE
			|| jvmType == JVM_FLOAT
			|| jvmType == JVM_INT
			|| jvmType == JVM_LONG
			|| jvmType == JVM_SHORT
			|| jvmType == JVM_BOOLEAN
			|| jvmType == JVM_VOID;
	}
	
	public static boolean isJvmClass(char jvmType) {
		return jvmType == JVM_CLASS;
	}
	
	public static boolean isJvmArray(char jvmType) {
		return jvmType == JVM_ARRAY;
	}
}
