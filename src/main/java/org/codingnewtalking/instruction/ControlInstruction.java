package org.codingnewtalking.instruction;

import org.codingnewtalking.unsigned.U1;

/**
 * @author lixinjie
 * @since 2019-09-04
 */
public class ControlInstruction {
	
	public static class _goto extends Instruction {
		
		public _goto(U1[] codes, int offset) {
			super(Mnemonic._goto, Opcode._goto, codes, offset, 1, 0);
		}
		
		@Override
		public int getLength() {
			return 3;
		}
	}
	
	public static class goto_w extends Instruction {
		
		public goto_w(U1[] codes, int offset) {
			super(Mnemonic.goto_w, Opcode.goto_w, codes, offset, 1, 0);
		}
		
		@Override
		public int getLength() {
			return 5;
		}
	}
	
	public static class jsr extends Instruction {
		
		public jsr(U1[] codes, int offset) {
			super(Mnemonic.jsr, Opcode.jsr, codes, offset, 1, 0);
		}
		
		@Override
		public int getLength() {
			return 3;
		}
	}
	
	public static class jsr_w extends Instruction {
		
		public jsr_w(U1[] codes, int offset) {
			super(Mnemonic.jsr_w, Opcode.jsr_w, codes, offset, 1, 0);
		}
		
		@Override
		public int getLength() {
			return 5;
		}
	}
	
	public static class ret extends Instruction {
		
		public ret(U1[] codes, int offset) {
			super(Mnemonic.ret, Opcode.ret, codes, offset, 1, 0);
		}
		
		@Override
		public int getLength() {
			return 2;
		}
	}
	
	public static class _return extends Instruction {
		
		public _return(U1[] codes, int offset) {
			super(Mnemonic._return, Opcode._return, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
}
