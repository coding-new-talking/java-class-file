package org.codingnewtalking.classfile.attribute;

import java.util.Arrays;

import org.codingnewtalking.classfile.ConstantPool;
import org.codingnewtalking.classfile.attribute.util.Parameter;
import org.codingnewtalking.classfile.util.Count1;

/**
 * @author lixinjie
 * @since 2019-07-19
 */
public class MethodParameters extends AttributeInfo {
	
	private Count1 parametersCount;
	private Parameter[] parameters;
	
	public MethodParameters(byte[] bytes, int offset, ConstantPool constantPool) {
		super(bytes, offset, constantPool);
	}
	
	public int getParametersCount() {
		if (parametersCount == null) {
			parametersCount = new Count1(bytes, offset + 6);
		}
		return parametersCount.getCount();
	}
	
	public Parameter[] getParameters() {
		if (parameters == null) {
			parameters = new Parameter[getParametersCount()];
			for (int i = 0, len = parameters.length; i < len; i++) {
				parameters[i] = new Parameter(bytes, offset + 7 + i * 4);
			}
		}
		return parameters;
	}

	@Override
	public String toString(String baseBlank, String blankUnit, String blank4) {
		return baseBlank
				+ "MethodParameters [getParametersCount()=" + getParametersCount() + ", getParameters()="
				+ Arrays.toString(getParameters()) + "\r\n"
				+ baseBlank + "]";
	}
}
