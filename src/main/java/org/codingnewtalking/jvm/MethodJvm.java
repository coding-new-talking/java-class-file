package org.codingnewtalking.jvm;

import org.codingnewtalking.classfile.ConstantPool;
import org.codingnewtalking.classfile.attribute.AttributeInfoBuilder;
import org.codingnewtalking.classfile.attribute.MethodParameters;
import org.codingnewtalking.classfile.method.MethodInfo;
import org.codingnewtalking.util.ArrayUtils;
import org.codingnewtalking.util.JJTypeUtils;
import org.codingnewtalking.util.MethodAccessFlagsUtils;
import org.codingnewtalking.util.StringUtils;

/**
 * @author lixinjie
 * @since 2019-08-31
 */
public class MethodJvm {

	private MethodInfo methodInfo;
	
	public MethodJvm(MethodInfo methodInfo) {
		this.methodInfo = methodInfo;
	}
	
	public MethodInfo getMethodInfo() {
		return methodInfo;
	}
	
	public ConstantPool getConstantPool() {
		return getMethodInfo().getConstantPool();
	}
	
	public int getAccessFlags() {
		return getMethodInfo().getAccessFlags().getAccessFlags();
	}
	
	public String getAccessFlagsHexString() {
		return MethodAccessFlagsUtils.getHexString(getAccessFlags());
	}
	
	public String[] getAccessFlagsJvmString() {
		return MethodAccessFlagsUtils.getJvmString(getAccessFlags());
	}
	
	public String getName() {
		return getConstantPool().getConstantUtf8String(getMethodInfo().getNameIndex());
	}
	
	public String getReturnType() {
		String descriptor = getDescriptor();
		String returnType = StringUtils.tailString(descriptor, descriptor.lastIndexOf(')') + 1);
		return returnType;
	}
	
	public String[] getParametersType() {
		String descriptor = getDescriptor();
		String parametersType = StringUtils.subString(descriptor, 1, descriptor.lastIndexOf(')'));
		return JJTypeUtils.splitJvmTypes(parametersType);
	}
	
	public String[] getParametersName() {
		ParameterJvm[] pjs = getParameters();
		String[] pns = new String[pjs.length];
		ArrayUtils.map(pjs, pns, (pj) -> {
			return pj.getName();
		});
		return pns;
	}
	
	public ParameterJvm[] getParameters() {
		MethodParameters mps = (MethodParameters)ArrayUtils.filter(methodInfo.getAttributes(), (attributeInfo) -> {
			return attributeInfo.getAttributeName().equals(AttributeInfoBuilder.MethodParameters_Attribute);
		});
		if (mps == null) {
			return new ParameterJvm[0];
		}
		ParameterJvm[] pjs = new ParameterJvm[mps.getParametersCount()];
		ArrayUtils.map(mps.getParameters(), pjs, (parameter) -> {
			return new ParameterJvm(parameter, getConstantPool());
		});
		return pjs;
	}
	
	public String getDescriptor() {
		return getConstantPool().getConstantUtf8String(getMethodInfo().getDescriptorIndex());
	}
	
	public int getAttributesCount() {
		return getMethodInfo().getAttributesCount();
	}
}
