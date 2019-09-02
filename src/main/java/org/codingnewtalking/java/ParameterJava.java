package org.codingnewtalking.java;

import org.codingnewtalking.jvm.ParameterJvm;
import org.codingnewtalking.util.ParameterAccessFlagsUtils;

/**
 * @author lixinjie
 * @since 2019-09-02
 */
public class ParameterJava {

	private ParameterJvm parameterJvm;
	
	public ParameterJava(ParameterJvm parameterJvm) {
		this.parameterJvm = parameterJvm;
	}
	
	public ParameterJvm getParameterJvm() {
		return parameterJvm;
	}
	
	public String[] getAccessFlagsJavaString() {
		return ParameterAccessFlagsUtils.getJavaString(getParameterJvm().getAccessFlags());
	}
	
	public String getName() {
		return getParameterJvm().getName();
	}
}
