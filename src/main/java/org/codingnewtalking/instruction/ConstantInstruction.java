package org.codingnewtalking.instruction;

import org.codingnewtalking.unsigned.U1;

/**
 * @author lixinjie
 * @since 2019-09-04
 */
public class ConstantInstruction {
	
	public static class ldc extends Instruction {
		
		public ldc(U1[] codes, int offset) {
			super(Mnemonic.ldc, Opcode.ldc, codes, offset, 1, 0);
		}
		
		@Override
		public int getLength() {
			return 2;
		}
	}
	
	public static class ldc_w extends Instruction {
		
		public ldc_w(U1[] codes, int offset) {
			super(Mnemonic.ldc_w, Opcode.ldc_w, codes, offset, 1, 0);
		}
		
		@Override
		public int getLength() {
			return 3;
		}
	}
	
	public static class ldc2_w extends Instruction {
		
		public ldc2_w(U1[] codes, int offset) {
			super(Mnemonic.ldc2_w, Opcode.ldc2_w, codes, offset, 1, 0);
		}
		
		@Override
		public int getLength() {
			return 3;
		}
	}
	
	public static class nop extends Instruction {
		
		public nop(U1[] codes, int offset) {
			super(Mnemonic.nop, Opcode.nop, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
}
