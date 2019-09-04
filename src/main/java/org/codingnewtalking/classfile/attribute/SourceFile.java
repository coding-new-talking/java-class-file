package org.codingnewtalking.classfile.attribute;

import org.codingnewtalking.classfile.ConstantPool;
import org.codingnewtalking.classfile.util.Index2;

/**
 * @author lixinjie
 * @since 2019-07-19
 */
public class SourceFile extends AttributeInfo {

	private Index2 sourceFileIndex;
	
	public SourceFile(byte[] bytes, int offset, ConstantPool constantPool) {
		super(bytes, offset, constantPool);
	}
	
	public int getSourceFileIndex() {
		if (sourceFileIndex == null) {
			sourceFileIndex = new Index2(bytes, offset + 6);
		}
		return sourceFileIndex.getIndex();
	}
	
	public String getSourceFile() {
		return constantPool.getConstantUtf8String(getSourceFileIndex());
	}

	@Override
	public String toString() {
		return "SourceFile [getSourceFileIndex()=" + getSourceFileIndex() + ", getSourceFile()=" + getSourceFile() + "]";
	}
}
