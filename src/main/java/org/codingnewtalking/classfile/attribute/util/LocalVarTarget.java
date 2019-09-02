package org.codingnewtalking.classfile.attribute.util;

import org.codingnewtalking.classfile.util.Length2;

/**
 * @author lixinjie
 * @since 2019-07-16
 */
public class LocalVarTarget {

	private byte[] bytes;
	private int offset;
	
	private Length2 tableLength;
	private Table[] tables;
	
	public LocalVarTarget(byte[] bytes, int offset) {
		this.bytes = bytes;
		this.offset = offset;
	}

	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		return 2 + getTableLength() * 6;
	}
	
	public int getTableLength() {
		if (tableLength == null) {
			tableLength = new Length2(bytes, offset);
		}
		return tableLength.getLength();
	}

	public Table[] getTables() {
		if (tables == null) {
			tables = new Table[getTableLength()];
			for (int i = 0, len = tables.length; i < len; i++) {
				tables[i] = new Table(bytes, offset + 2 + i * 6);
			}
		}
		return tables;
	}
}
