package org.codingnewtalking.classfile.attribute;

import org.codingnewtalking.classfile.ConstantPool;
import org.codingnewtalking.classfile.attribute.util.LocalVarTable;
import org.codingnewtalking.classfile.util.Length2;
import org.codingnewtalking.util.ForUtils;

/**
 * @author lixinjie
 * @since 2019-07-19
 */
public class LocalVariableTable extends AttributeInfo {
	
	private Length2 localVarTableLength;
	private LocalVarTable[] localVarTables;
	
	public LocalVariableTable(byte[] bytes, int offset, ConstantPool constantPool) {
		super(bytes, offset, constantPool);
	}

	public int getLocalVarTableLength() {
		if (localVarTableLength == null) {
			localVarTableLength = new Length2(bytes, offset + 6);
		}
		return localVarTableLength.getLength();
	}

	public LocalVarTable[] getLocalVarTables() {
		if (localVarTables == null) {
			localVarTables = new LocalVarTable[getLocalVarTableLength()];
			for (int i = 0, len = localVarTables.length; i < len; i++) {
				localVarTables[i] = new LocalVarTable(bytes, offset + 8 + i * 10, constantPool);
			}
		}
		return localVarTables;
	}

	@Override
	public String toString(String baseBlank, String blankUnit, String blank4) {
		return baseBlank
				+ "LocalVariableTable [getLocalVarTableLength()=" + getLocalVarTableLength() + ", getLocalVarTables()=[\r\n"
				+ toString(getLocalVarTables(), baseBlank + blankUnit + blank4, blankUnit, blank4)
				+ baseBlank + blankUnit + blank4 + "]\r\n"
				+ baseBlank + blankUnit + "]";
	}
	
	private String toString(LocalVarTable[] localVarTables, String baseBlank, String blankUnit, String blank4) {
		StringBuilder builder = new StringBuilder();
		ForUtils.each(localVarTables.length, (index) -> {
			builder.append(localVarTables[index].toString(baseBlank))
					.append("\r\n");
		});
		return builder.toString();
	}
}
