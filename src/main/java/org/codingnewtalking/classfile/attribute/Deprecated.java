package org.codingnewtalking.classfile.attribute;

import org.codingnewtalking.classfile.ConstantPool;

/**
 * @author lixinjie
 * @since 2019-07-15
 */
public class Deprecated extends AttributeInfo {

	public Deprecated(byte[] bytes, int offset, ConstantPool constantPool) {
		super(bytes, offset, constantPool);
	}

}
