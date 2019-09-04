package org.codingnewtalking.instruction;

import org.codingnewtalking.unsigned.U1;

/**
 * @author lixinjie
 * @since 2019-09-04
 */
public class StackInstruction {
	
	public static class dup extends Instruction {
		
		public dup(U1[] codes, int offset) {
			super(Mnemonic.dup, Opcode.dup, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class dup_x1 extends Instruction {
		
		public dup_x1(U1[] codes, int offset) {
			super(Mnemonic.dup_x1, Opcode.dup_x1, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class dup_x2 extends Instruction {
		
		public dup_x2(U1[] codes, int offset) {
			super(Mnemonic.dup_x2, Opcode.dup_x2, codes, offset, 0, 3);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class dup2 extends Instruction {
		
		public dup2(U1[] codes, int offset) {
			super(Mnemonic.dup2, Opcode.dup2, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class dup2_x1 extends Instruction {
		
		public dup2_x1(U1[] codes, int offset) {
			super(Mnemonic.dup2_x1, Opcode.dup2_x1, codes, offset, 0, 3);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class dup2_x2 extends Instruction {
		
		public dup2_x2(U1[] codes, int offset) {
			super(Mnemonic.dup2_x2, Opcode.dup2_x2, codes, offset, 0, 4);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class pop extends Instruction {
		
		public pop(U1[] codes, int offset) {
			super(Mnemonic.pop, Opcode.pop, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class pop2 extends Instruction {
		
		public pop2(U1[] codes, int offset) {
			super(Mnemonic.pop2, Opcode.pop2, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class swap extends Instruction {
		
		public swap(U1[] codes, int offset) {
			super(Mnemonic.swap, Opcode.swap, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
}
