package org.codingnewtalking.instruction;

import org.codingnewtalking.unsigned.U1;
import org.codingnewtalking.util.ByteUtils;

/**
 * @author lixinjie
 * @since 2019-09-04
 */
public class ShortInstruction {
	
	public static class sipush extends Instruction {
		
		public sipush(U1[] codes, int offset) {
			super(Mnemonic.sipush, Opcode.sipush, codes, offset, 1, 0);
		}
		
		@Override
		public int getLength() {
			return 3;
		}
		
		public int getIntermediateValue() {
			return ByteUtils.toSigned(codes[offset + 1].getByte(), codes[offset + 2].getByte());
		}
		
		@Override
		protected String embeddedOperandsToString() {
			return getIntermediateValue() + "	// int类型数值，两个字节的有符号数";
		}
	}
}
