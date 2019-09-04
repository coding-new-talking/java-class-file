package org.codingnewtalking.instruction;

import org.codingnewtalking.unsigned.U1;

/**
 * @author lixinjie
 * @since 2019-09-04
 */
public class ArrayInstruction {

	public static class aaload extends Instruction {

		public aaload(U1[] codes, int offset) {
			super(Mnemonic.aaload, Opcode.aaload, codes, offset, 0, 2);
		}

		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class aastore extends Instruction {
		
		public aastore(U1[] codes, int offset) {
			super(Mnemonic.aastore, Opcode.aastore, codes, offset, 0, 3);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class anewarray extends Instruction {
		
		public anewarray(U1[] codes, int offset) {
			super(Mnemonic.anewarray, Opcode.anewarray, codes, offset, 2, 1);
		}
		
		@Override
		public int getLength() {
			return 3;
		}
	}
	
	public static class arraylength extends Instruction {
		
		public arraylength(U1[] codes, int offset) {
			super(Mnemonic.arraylength, Opcode.arraylength, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class baload extends Instruction {
		
		public baload(U1[] codes, int offset) {
			super(Mnemonic.baload, Opcode.baload, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class bastore extends Instruction {
		
		public bastore(U1[] codes, int offset) {
			super(Mnemonic.bastore, Opcode.bastore, codes, offset, 0, 3);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class caload extends Instruction {
		
		public caload(U1[] codes, int offset) {
			super(Mnemonic.caload, Opcode.caload, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class castore extends Instruction {
		
		public castore(U1[] codes, int offset) {
			super(Mnemonic.castore, Opcode.castore, codes, offset, 0, 3);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class daload extends Instruction {
		
		public daload(U1[] codes, int offset) {
			super(Mnemonic.daload, Opcode.daload, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class dastore extends Instruction {
		
		public dastore(U1[] codes, int offset) {
			super(Mnemonic.dastore, Opcode.dastore, codes, offset, 0, 3);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class faload extends Instruction {
		
		public faload(U1[] codes, int offset) {
			super(Mnemonic.faload, Opcode.faload, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class fastore extends Instruction {
		
		public fastore(U1[] codes, int offset) {
			super(Mnemonic.fastore, Opcode.fastore, codes, offset, 0, 3);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class iaload extends Instruction {
		
		public iaload(U1[] codes, int offset) {
			super(Mnemonic.iaload, Opcode.iaload, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class iastore extends Instruction {
		
		public iastore(U1[] codes, int offset) {
			super(Mnemonic.iastore, Opcode.iastore, codes, offset, 0, 3);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
}
