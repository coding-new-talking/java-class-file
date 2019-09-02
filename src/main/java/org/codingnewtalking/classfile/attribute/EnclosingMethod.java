package org.codingnewtalking.classfile.attribute;

import org.codingnewtalking.classfile.ConstantPool;
import org.codingnewtalking.classfile.util.Index2;

/**
 * @author lixinjie
 * @since 2019-07-19
 */
public class EnclosingMethod extends AttributeInfo {

	private Index2 classIndex;
	private Index2 methodIndex;
	
	public EnclosingMethod(byte[] bytes, int offset, ConstantPool constantPool) {
		super(bytes, offset, constantPool);
	}
	
	public int getClassIndex() {
		if (classIndex == null) {
			classIndex = new Index2(bytes, offset + 6);
		}
		return classIndex.getIndex();
	}
	
	public int getMethodIndex() {
		if (methodIndex == null) {
			methodIndex = new Index2(bytes, offset + 8);
		}
		return methodIndex.getIndex();
	}
}
