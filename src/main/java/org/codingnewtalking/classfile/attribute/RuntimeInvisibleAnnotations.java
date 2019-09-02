package org.codingnewtalking.classfile.attribute;

import java.util.Arrays;

import org.codingnewtalking.classfile.ConstantPool;
import org.codingnewtalking.classfile.attribute.annotation.Annotation;
import org.codingnewtalking.classfile.util.Num2;

/**
 * @author lixinjie
 * @since 2019-07-15
 */
public class RuntimeInvisibleAnnotations extends AttributeInfo {

	private Num2 numAnnotations;
	private Annotation[] annotations;
	
	public RuntimeInvisibleAnnotations(byte[] bytes, int offset, ConstantPool constantPool) {
		super(bytes, offset, constantPool);
	}

	public int getNumAnnotations() {
		if (numAnnotations == null) {
			numAnnotations = new Num2(bytes, offset + 6);
		}
		return numAnnotations.getNum();
	}

	public Annotation[] getAnnotations() {
		if (annotations == null) {
			annotations = new Annotation[getNumAnnotations()];
			int length = 8;
			for (int i = 0, len = annotations.length; i < len; i++) {
				annotations[i] = new Annotation(bytes, offset + length);
				length += annotations[i].getByteLength();
			}
		}
		return annotations;
	}

	@Override
	public String toString() {
		return "RuntimeInvisibleAnnotations [getNumAnnotations()=" + getNumAnnotations() + ", getAnnotations()="
				+ Arrays.toString(getAnnotations()) + "]";
	}
}
