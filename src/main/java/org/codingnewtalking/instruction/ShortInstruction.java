package org.codingnewtalking.instruction;

import org.codingnewtalking.unsigned.U1;

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
	}
}
