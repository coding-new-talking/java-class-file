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
	
	public static class laload extends Instruction {
		
		public laload(U1[] codes, int offset) {
			super(Mnemonic.laload, Opcode.laload, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class lastore extends Instruction {
		
		public lastore(U1[] codes, int offset) {
			super(Mnemonic.lastore, Opcode.lastore, codes, offset, 0, 3);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class multianewarray extends Instruction {
		
		public multianewarray(U1[] codes, int offset) {
			super(Mnemonic.multianewarray, Opcode.multianewarray, codes, offset, 2, -1);
		}
		
		@Override
		public int getLength() {
			return 4;
		}
	}
	
	public static class newarray extends Instruction {
		
		public newarray(U1[] codes, int offset) {
			super(Mnemonic.newarray, Opcode.newarray, codes, offset, 1, 1);
		}
		
		@Override
		public int getLength() {
			return 2;
		}
	}
	
	public static class saload extends Instruction {
		
		public saload(U1[] codes, int offset) {
			super(Mnemonic.saload, Opcode.saload, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class sastore extends Instruction {
		
		public sastore(U1[] codes, int offset) {
			super(Mnemonic.sastore, Opcode.sastore, codes, offset, 0, 3);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
}
