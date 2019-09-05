package org.codingnewtalking.instruction;

import org.codingnewtalking.unsigned.U1;

/**
 * @author lixinjie
 * @since 2019-09-05
 */
public class ExtendedInstruction {
	
	public static class wide extends Instruction {
		
		public wide(U1[] codes, int offset) {
			super(Mnemonic.wide, Opcode.wide, codes, offset, -1, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
}
