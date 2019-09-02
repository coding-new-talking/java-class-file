package org.codingnewtalking.classfile.attribute;

import org.codingnewtalking.classfile.ConstantPool;
import org.codingnewtalking.classfile.util.Index2;

/**
 * @author lixinjie
 * @since 2019-07-15
 */
public class ConstantValue extends AttributeInfo {

	private Index2 constantValueIndex;
	
	public ConstantValue(byte[] bytes, int offset, ConstantPool constantPool) {
		super(bytes, offset, constantPool);
	}

	public int getConstantValueIndex() {
		if (constantValueIndex == null) {
			constantValueIndex = new Index2(bytes, offset + 6);
		}
		return constantValueIndex.getIndex();
	}
}
