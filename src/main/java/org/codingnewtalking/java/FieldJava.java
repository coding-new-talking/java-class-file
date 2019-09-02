package org.codingnewtalking.java;

import org.codingnewtalking.jvm.FieldJvm;
import org.codingnewtalking.util.FieldAccessFlagsUtils;
import org.codingnewtalking.util.JJTypeUtils;

/**
 * @author lixinjie
 * @since 2019-08-31
 */
public class FieldJava {

	private FieldJvm fieldJvm;
	
	public FieldJava(FieldJvm fieldJvm) {
		this.fieldJvm = fieldJvm;
	}
	
	public FieldJvm getFieldJvm() {
		return fieldJvm;
	}
	
	public int getAccessFlags() {
		return getFieldJvm().getAccessFlags();
	}
	
	public String[] getAccessFlagsJavaString() {
		return FieldAccessFlagsUtils.getJavaString(getAccessFlags());
	}
	
	public String getName() {
		return getFieldJvm().getName();
	}
	
	public String getType() {
		return JJTypeUtils.jvmTypeToJava(getFieldJvm().getDescriptor());
	}
}
