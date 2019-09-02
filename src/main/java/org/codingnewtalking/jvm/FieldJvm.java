package org.codingnewtalking.jvm;

import org.codingnewtalking.classfile.ConstantPool;
import org.codingnewtalking.classfile.field.FieldInfo;
import org.codingnewtalking.util.FieldAccessFlagsUtils;

/**
 * @author lixinjie
 * @since 2019-08-31
 */
public class FieldJvm {

	private FieldInfo fieldInfo;
	
	public FieldJvm(FieldInfo fieldInfo) {
		this.fieldInfo = fieldInfo;
	}
	
	public FieldInfo getFieldInfo() {
		return fieldInfo;
	}
	
	public ConstantPool getConstantPool() {
		return getFieldInfo().getConstantPool();
	}
	
	public int getAccessFlags() {
		return getFieldInfo().getAccessFlags().getAccessFlags();
	}
	
	public String getAccessFlagsHexString() {
		return FieldAccessFlagsUtils.getHexString(getAccessFlags());
	}
	
	public String[] getAccessFlagsJvmString() {
		return FieldAccessFlagsUtils.getJvmString(getAccessFlags());
	}
	
	public String getName() {
		return getConstantPool().getConstantUtf8String(getFieldInfo().getNameIndex());
	}
	
	public String getDescriptor() {
		return getConstantPool().getConstantUtf8String(getFieldInfo().getDescriptorIndex());
	}
	
	public int getAttributesCount() {
		return getFieldInfo().getAttributesCount();
	}
}
