package org.codingnewtalking.classfile.attribute;

import java.util.Arrays;

import org.codingnewtalking.classfile.ConstantPool;
import org.codingnewtalking.classfile.attribute.util.ExceptionTable;
import org.codingnewtalking.classfile.attribute.util.JvmCode;
import org.codingnewtalking.classfile.util.Count2;
import org.codingnewtalking.classfile.util.Length2;
import org.codingnewtalking.classfile.util.Length4;
import org.codingnewtalking.classfile.util.Num2;
import org.codingnewtalking.util.ForUtils;

/**
 * @author lixinjie
 * @since 2019-07-19
 */
public class Code extends AttributeInfo {
	
	private Num2 maxStack;
	private Num2 maxLocals;
	private Length4 codeLength;
	private JvmCode jvmCode;
	private Length2 exceptionTableLength;
	private ExceptionTable[] exceptionTables;
	private Count2 attributesCount;
	private AttributeInfo[] attributes;
	
	public Code(byte[] bytes, int offset, ConstantPool constantPool) {
		super(bytes, offset, constantPool);
	}
	
	public int getMaxStack() {
		if (maxStack == null) {
			maxStack = new Num2(bytes, offset + 6);
		}
		return maxStack.getNum();
	}
	
	public int getMaxLocals() {
		if (maxLocals == null) {
			maxLocals = new Num2(bytes, offset + 8);
		}
		return maxLocals.getNum();
	}
	
	public int getCodeLength() {
		if (codeLength == null) {
			codeLength = new Length4(bytes, offset + 10);
		}
		return (int) codeLength.getLength();
	}
	
	public JvmCode getJvmCode() {
		if (jvmCode == null) {
			jvmCode = new JvmCode(bytes, offset + 14, getCodeLength());
		}
		return jvmCode;
	}
	
	public int getExceptionTableLength() {
		if (exceptionTableLength == null) {
			exceptionTableLength = new Length2(bytes, offset + 14 + getCodeLength());
		}
		return exceptionTableLength.getLength();
	}
	
	public ExceptionTable[] getExceptionTables() {
		if (exceptionTables == null) {
			int length = 16 + getCodeLength();
			exceptionTables = new ExceptionTable[getExceptionTableLength()];
			for (int i = 0, len = exceptionTables.length; i < len; i++) {
				exceptionTables[i] = new ExceptionTable(bytes, offset + length + i * 8);
			}
		}
		return exceptionTables;
	}
	
	public int getAttributesCount() {
		if (attributesCount == null) {
			int length = 16 + getCodeLength() + getExceptionTableLength() * 8;
			attributesCount = new Count2(bytes, offset + length);
		}
		return attributesCount.getCount();
	}
	
	public AttributeInfo[] getAttributes() {
		if (attributes == null) {
			attributes = new AttributeInfo[getAttributesCount()];
			AttributeInfoBuilder builder = AttributeInfoBuilder.newBuilder(bytes, constantPool);
			int length = 18 + getCodeLength() + getExceptionTableLength() * 8;
			for (int i = 0, len = attributes.length; i < len; i++) {
				attributes[i] = builder.build(offset + length);
				length += attributes[i].getByteLength();
			}
		}
		return attributes;
	}

	@Override
	public String toString(String baseBlank, String blankUnit, String blank4) {
		return baseBlank
				+ "Code [getMaxStack()=" + getMaxStack() + ", getMaxLocals()=" + getMaxLocals() + ", getCodeLength()="
				+ getCodeLength()+ ", \r\n"
				+ baseBlank + blank4 + "getJvmCode()=" + getJvmCode()+ ", \r\n"
				+ baseBlank + blank4 + "getExceptionTableLength()=" + getExceptionTableLength()
				+ ", getExceptionTables()=" + Arrays.toString(getExceptionTables()) + ", \r\n"
				+ baseBlank + blank4 + "getAttributesCount()=" + getAttributesCount() + ", getAttributes()=[\r\n"
				+ toString(getAttributes(), baseBlank + blankUnit + blank4, blankUnit, blank4)
				+ baseBlank + blank4 + "]\r\n"
				+ baseBlank + "]";
	}
	
	private String toString(AttributeInfo[] attributes, String baseBlank, String blankUnit, String blank4) {
		StringBuilder builder = new StringBuilder();
		ForUtils.each(attributes.length, (index) -> {
			builder.append(attributes[index].toString(baseBlank, blankUnit, blank4))
					.append("\r\n");
		});
		return builder.toString();
	}
}
