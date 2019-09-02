package org.codingnewtalking.classfile.attribute.annotation;

import org.codingnewtalking.classfile.util.Num2;

/**
 * @author lixinjie
 * @since 2019-07-19
 */
public class ParameterAnnotation {

	private byte[] bytes;
	private int offset;
	private int length;

	private Num2 numAnnotations;
	private Annotation[] annotations;
	
	public ParameterAnnotation(byte[] bytes, int offset) {
		this.bytes = bytes;
		this.offset = offset;
	}
	
	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		if (length == 0) {
			getAnnotations();
		}
		return length;
	}
	
	public int getNumAnnotations() {
		if (numAnnotations == null) {
			numAnnotations = new Num2(bytes, offset);
		}
		return numAnnotations.getNum();
	}

	public Annotation[] getAnnotations() {
		if (annotations == null) {
			annotations = new Annotation[getNumAnnotations()];
			length += 2;
			for (int i = 0, len = annotations.length; i < len; i++) {
				annotations[i] = new Annotation(bytes, offset + length);
				length += annotations[i].getByteLength();
			}
		}
		return annotations;
	}
}
