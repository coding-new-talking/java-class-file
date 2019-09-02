package org.codingnewtalking.classfile.attribute;

import org.codingnewtalking.classfile.ConstantPool;
import org.codingnewtalking.classfile.attribute.annotation.ParameterAnnotation;
import org.codingnewtalking.classfile.util.Num1;

/**
 * @author lixinjie
 * @since 2019-07-15
 */
public class RuntimeInvisibleParameterAnnotations extends AttributeInfo {

	private Num1 numParameters;
	private ParameterAnnotation[] parameterAnnotations;
	
	public RuntimeInvisibleParameterAnnotations(byte[] bytes, int offset, ConstantPool constantPool) {
		super(bytes, offset, constantPool);
	}

	public int getNumParameters() {
		if (numParameters == null) {
			numParameters = new Num1(bytes, offset + 6);
		}
		return numParameters.getNum();
	}

	public ParameterAnnotation[] getParameterAnnotations() {
		if (parameterAnnotations == null) {
			parameterAnnotations = new ParameterAnnotation[getNumParameters()];
			int length = 7;
			for (int i = 0, len = parameterAnnotations.length; i < len; i++) {
				parameterAnnotations[i] = new ParameterAnnotation(bytes, offset + length);
				length += parameterAnnotations[i].getByteLength();
			}
		}
		return parameterAnnotations;
	}
}
