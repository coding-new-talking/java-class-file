package org.codingnewtalking.classfile.attribute;

import org.codingnewtalking.classfile.ConstantPool;
import org.codingnewtalking.classfile.util.ByteString;

/**
 * @author lixinjie
 * @since 2019-07-19
 */
public class SourceDebugExtension extends AttributeInfo {

	private ByteString debugExtension;
	
	public SourceDebugExtension(byte[] bytes, int offset, ConstantPool constantPool) {
		super(bytes, offset, constantPool);
	}
	
	public String getDebugExtension() {
		if (debugExtension == null) {
			debugExtension = new ByteString(bytes, offset + 6, (int)getAttributeLength());
		}
		return debugExtension.getString();
	}
}
