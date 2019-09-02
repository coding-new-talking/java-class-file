package org.codingnewtalking.classfile.attribute;

import org.codingnewtalking.classfile.ConstantPool;
import org.codingnewtalking.classfile.attribute.annotation.ElementValue;

/**
 * @author lixinjie
 * @since 2019-08-09
 */
public class AnnotationDefault extends AttributeInfo {
	
	private ElementValue defaultValue;

	public AnnotationDefault(byte[] bytes, int offset, ConstantPool constantPool) {
		super(bytes, offset, constantPool);
	}

	public ElementValue getDefaultValue() {
		if (defaultValue == null) {
			defaultValue = new ElementValue(bytes, offset + 6);
		}
		return defaultValue;
	}
}
