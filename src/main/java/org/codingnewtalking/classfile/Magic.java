package org.codingnewtalking.classfile;

import org.codingnewtalking.unsigned.U4;

/**
 * @author lixinjie
 * @since 2019-07-10
 */
public class Magic {

	private U4 u4;
	
	public Magic(byte[] bytes, int offset) {
		this.u4 = new U4(bytes, offset);
	}
	
	public int getByteOffset() {
		return u4.getByteOffset();
	}

	public int getByteLength() {
		return u4.getByteLength();
	}

	public long getMagic() {
		return u4.getValue();
	}

	@Override
	public String toString() {
		return "Magic [getMagic()=0x" + Long.toHexString(getMagic()) + "]";
	}
}
