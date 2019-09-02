package org.codingnewtalking.jvm;

import org.codingnewtalking.classfile.ConstantPool;
import org.codingnewtalking.classfile.attribute.util.Parameter;
import org.codingnewtalking.util.ParameterAccessFlagsUtils;

/**
 * @author lixinjie
 * @since 2019-09-02
 */
public class ParameterJvm {

	private Parameter parameter;
	private ConstantPool constantPool;
	
	public ParameterJvm(Parameter parameter, ConstantPool constantPool) {
		this.parameter = parameter;
		this.constantPool = constantPool;
	}

	public Parameter getParameter() {
		return parameter;
	}
	
	public ConstantPool getConstantPool() {
		return constantPool;
	}
	
	public int getAccessFlags() {
		return getParameter().getAccessFlags();
	}
	
	public String getAccessFlagsHexString() {
		return ParameterAccessFlagsUtils.getHexString(getAccessFlags());
	}
	
	public String[] getAccessFlagsJvmString() {
		return ParameterAccessFlagsUtils.getJvmString(getAccessFlags());
	}
	
	public String getName() {
		return getConstantPool().getConstantUtf8String(getParameter().getNameIndex());
	}
}
