package org.codingnewtalking.classfile.attribute;

import org.codingnewtalking.classfile.ConstantPool;
import org.codingnewtalking.classfile.attribute.util.StackMapFrame;
import org.codingnewtalking.classfile.util.Num2;

/**
 * @author lixinjie
 * @since 2019-08-09
 */
public class StackMapTable extends AttributeInfo {
	
	private Num2 numberOfEntries;
	private StackMapFrame[] entries;
	
	public StackMapTable(byte[] bytes, int offset, ConstantPool constantPool) {
		super(bytes, offset, constantPool);
	}

	public int getNumberOfEntries() {
		if (numberOfEntries == null) {
			numberOfEntries = new Num2(bytes, offset + 6);
		}
		return numberOfEntries.getNum();
	}

	public StackMapFrame[] getEntries() {
		if (entries == null) {
			entries = new StackMapFrame[getNumberOfEntries()];
			int length = 8;
			for (int i = 0, len = entries.length; i < len; i++) {
				entries[i] = new StackMapFrame(bytes, offset + length);
				length += entries[i].getByteLength();
			}
		}
		return entries;
	}
}
