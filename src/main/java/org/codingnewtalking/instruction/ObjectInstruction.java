package org.codingnewtalking.instruction;

import org.codingnewtalking.unsigned.U1;

/**
 * @author lixinjie
 * @since 2019-09-04
 */
public class ObjectInstruction {
	
	public static class aconst_null extends Instruction {

		public aconst_null(U1[] codes, int offset) {
			super(Mnemonic.aconst_null, Opcode.aconst_null, codes, offset, 0, 0);
		}

		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class aload extends Instruction {
		
		public aload(U1[] codes, int offset) {
			super(Mnemonic.aload, Opcode.aload, codes, offset, 1, 0);
		}
		
		@Override
		public int getLength() {
			return 2;
		}
	}
	
	public static class aload_0 extends Instruction {
		
		public aload_0(U1[] codes, int offset) {
			super(Mnemonic.aload_0, Opcode.aload_0, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class aload_1 extends Instruction {
		
		public aload_1(U1[] codes, int offset) {
			super(Mnemonic.aload_1, Opcode.aload_1, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class aload_2 extends Instruction {
		
		public aload_2(U1[] codes, int offset) {
			super(Mnemonic.aload_2, Opcode.aload_2, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class aload_3 extends Instruction {
		
		public aload_3(U1[] codes, int offset) {
			super(Mnemonic.aload_3, Opcode.aload_3, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class areturn extends Instruction {
		
		public areturn(U1[] codes, int offset) {
			super(Mnemonic.areturn, Opcode.areturn, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class astore extends Instruction {
		
		public astore(U1[] codes, int offset) {
			super(Mnemonic.astore, Opcode.astore, codes, offset, 1, 1);
		}
		
		@Override
		public int getLength() {
			return 2;
		}
	}
	
	public static class astore_0 extends Instruction {
		
		public astore_0(U1[] codes, int offset) {
			super(Mnemonic.astore_0, Opcode.astore_0, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class astore_1 extends Instruction {
		
		public astore_1(U1[] codes, int offset) {
			super(Mnemonic.astore_1, Opcode.astore_1, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class astore_2 extends Instruction {
		
		public astore_2(U1[] codes, int offset) {
			super(Mnemonic.astore_2, Opcode.astore_2, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class astore_3 extends Instruction {
		
		public astore_3(U1[] codes, int offset) {
			super(Mnemonic.astore_3, Opcode.astore_3, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class athrow extends Instruction {
		
		public athrow(U1[] codes, int offset) {
			super(Mnemonic.athrow, Opcode.athrow, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class checkcast extends Instruction {
		
		public checkcast(U1[] codes, int offset) {
			super(Mnemonic.checkcast, Opcode.checkcast, codes, offset, 1, 1);
		}
		
		@Override
		public int getLength() {
			return 3;
		}
	}
	
	public static class getfield extends Instruction {
		
		public getfield(U1[] codes, int offset) {
			super(Mnemonic.getfield, Opcode.getfield, codes, offset, 1, 1);
		}
		
		@Override
		public int getLength() {
			return 3;
		}
	}
	
	public static class getstatic extends Instruction {
		
		public getstatic(U1[] codes, int offset) {
			super(Mnemonic.getstatic, Opcode.getstatic, codes, offset, 1, 0);
		}
		
		@Override
		public int getLength() {
			return 3;
		}
	}
}
