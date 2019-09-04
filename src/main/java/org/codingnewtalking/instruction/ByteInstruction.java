package org.codingnewtalking.instruction;

import org.codingnewtalking.unsigned.U1;

/**
 * @author lixinjie
 * @since 2019-09-04
 */
public class ByteInstruction {
	
	public static class bipush extends Instruction {
		
		public bipush(U1[] codes, int offset) {
			super(Mnemonic.bipush, Opcode.bipush, codes, offset, 1, 0);
		}
		
		@Override
		public int getLength() {
			return 2;
		}
	}
}
