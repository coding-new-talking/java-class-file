package org.codingnewtalking.java;

import org.codingnewtalking.jvm.MethodJvm;
import org.codingnewtalking.jvm.ParameterJvm;
import org.codingnewtalking.util.ArrayUtils;
import org.codingnewtalking.util.JJTypeUtils;
import org.codingnewtalking.util.MethodAccessFlagsUtils;

/**
 * @author lixinjie
 * @since 2019-08-31
 */
public class MethodJava {
	
	private MethodJvm methodJvm;
	
	public MethodJava(MethodJvm methodJvm) {
		this.methodJvm = methodJvm;
	}
	
	public MethodJvm getMethodJvm() {
		return methodJvm;
	}
	
	public int getAccessFlags() {
		return getMethodJvm().getAccessFlags();
	}
	
	public String[] getAccessFlagsJavaString() {
		return MethodAccessFlagsUtils.getJavaString(getAccessFlags());
	}
	
	public String getName() {
		return getMethodJvm().getName();
	}
	
	public String getReturnType() {
		return JJTypeUtils.jvmTypeToJava(getMethodJvm().getReturnType());
	}
	
	public String[] getParametersType() {
		return JJTypeUtils.jvmTypeToJava(getMethodJvm().getParametersType());
	}
	
	public String[] getParametersName() {
		return getMethodJvm().getParametersName();
	}
	
	public ParameterJava[] getParameters() {
		ParameterJvm[] pjvms = getMethodJvm().getParameters();
		 ParameterJava[] pjavas = new ParameterJava[pjvms.length];
		 ArrayUtils.map(pjvms, pjavas, (pjvm) -> {
			 return new ParameterJava(pjvm);
		 });
		return pjavas;
	}
}
