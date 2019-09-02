package org.codingnewtalking.classfile.attribute;

import org.codingnewtalking.classfile.ConstantPool;
import org.codingnewtalking.classfile.attribute.util.LocalVarTypeTable;
import org.codingnewtalking.classfile.util.Length2;

/**
 * @author lixinjie
 * @since 2019-07-19
 */
public class LocalVariableTypeTable extends AttributeInfo {
	
	private Length2 localVarTypeTableLength;
	private LocalVarTypeTable[] localVarTypeTables;
	
	public LocalVariableTypeTable(byte[] bytes, int offset, ConstantPool constantPool) {
		super(bytes, offset, constantPool);
	}

	public int getLocalVarTypeTableLength() {
		if (localVarTypeTableLength == null) {
			localVarTypeTableLength = new Length2(bytes, offset + 6);
		}
		return localVarTypeTableLength.getLength();
	}

	public LocalVarTypeTable[] getLocalVarTypeTables() {
		if (localVarTypeTables == null) {
			localVarTypeTables = new LocalVarTypeTable[getLocalVarTypeTableLength()];
			for (int i = 0, len = localVarTypeTables.length; i < len; i++) {
				localVarTypeTables[i] = new LocalVarTypeTable(bytes, offset + 8 + i * 10);
			}
		}
		return localVarTypeTables;
	}
}
