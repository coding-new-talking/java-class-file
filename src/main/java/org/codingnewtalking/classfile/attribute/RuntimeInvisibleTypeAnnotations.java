package org.codingnewtalking.classfile.attribute;

import org.codingnewtalking.classfile.ConstantPool;
import org.codingnewtalking.classfile.attribute.annotation.TypeAnnotation;
import org.codingnewtalking.classfile.util.Num2;

/**
 * @author lixinjie
 * @since 2019-07-15
 */
public class RuntimeInvisibleTypeAnnotations extends AttributeInfo {

	private Num2 numAnnotations;
	private TypeAnnotation[] annotations;
	
	public RuntimeInvisibleTypeAnnotations(byte[] bytes, int offset, ConstantPool constantPool) {
		super(bytes, offset, constantPool);
	}

	public int getNumAnnotations() {
		if (numAnnotations == null) {
			numAnnotations = new Num2(bytes, offset + 6);
		}
		return numAnnotations.getNum();
	}

	public TypeAnnotation[] getAnnotations() {
		if (annotations == null) {
			annotations = new TypeAnnotation[numAnnotations.getNum()];
			int length = 8;
			for (int i = 0, len = annotations.length; i < len; i++) {
				annotations[i] = new TypeAnnotation(bytes, offset + length);
				length += annotations[i].getByteLength();
			}
		}
		return annotations;
	}
}
