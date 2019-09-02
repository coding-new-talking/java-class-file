package org.codingnewtalking.classfile.attribute;

import org.codingnewtalking.classfile.ConstantPool;

/**
 * @author lixinjie
 * @since 2019-07-15
 */
public class Synthetic extends AttributeInfo {

	public Synthetic(byte[] bytes, int offset, ConstantPool constantPool) {
		super(bytes, offset, constantPool);
	}

}
