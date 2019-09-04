package org.codingnewtalking.classfile.attribute;

import org.codingnewtalking.classfile.ConstantPool;
import org.codingnewtalking.classfile.attribute.util.LineNumTable;
import org.codingnewtalking.classfile.util.Length2;
import org.codingnewtalking.util.ForUtils;

/**
 * @author lixinjie
 * @since 2019-07-19
 */
public class LineNumberTable extends AttributeInfo {
	
	private Length2 lineNumTableLength;
	private LineNumTable[] lineNumTables;
	
	public LineNumberTable(byte[] bytes, int offset, ConstantPool constantPool) {
		super(bytes, offset, constantPool);
	}

	public int getLineNumTableLength() {
		if (lineNumTableLength == null) {
			lineNumTableLength = new Length2(bytes, offset + 6);
		}
		return lineNumTableLength.getLength();
	}

	public LineNumTable[] getLineNumTables() {
		lineNumTables = new LineNumTable[getLineNumTableLength()];
		for (int i = 0, len = lineNumTables.length; i < len; i++) {
			lineNumTables[i] = new LineNumTable(bytes, offset + 8 + i * 4);
		}
		return lineNumTables;
	}

	@Override
	public String toString(String baseBlank, String blankUnit, String blank4) {
		return baseBlank
				+ "LineNumberTable [getLineNumTableLength()=" + getLineNumTableLength() + ", getLineNumTables()=[\r\n"
				+ toString(getLineNumTables(), baseBlank + blankUnit + blank4, blankUnit, blank4)
				+ baseBlank + blankUnit + blank4 + "]\r\n"
				+ baseBlank + blankUnit + "]";
	}
	
	private String toString(LineNumTable[] lineNumTables, String baseBlank, String blankUnit, String blank4) {
		StringBuilder builder = new StringBuilder();
		ForUtils.each(lineNumTables.length, (index) -> {
			builder.append(baseBlank)
					.append(lineNumTables[index])
					.append("\r\n");
		});
		return builder.toString();
	}
}
