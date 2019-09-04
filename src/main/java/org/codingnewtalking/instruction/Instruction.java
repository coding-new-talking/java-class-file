package org.codingnewtalking.instruction;

import org.codingnewtalking.unsigned.U1;

/**
 * @author lixinjie
 * @since 2019-09-04
 */
public abstract class Instruction {

	protected String mnemonic;
	protected int opcode;
	protected U1[] codes;
	protected int offset;
	protected int embeddedOperands;
	protected int stackedOperands;
	
	public Instruction(String mnemonic, int opcode, U1[] codes, int offset, int embeddedOperands, int stackedOperands) {
		this.mnemonic = mnemonic;
		this.opcode = opcode;
		this.codes = codes;
		this.offset = offset;
		this.embeddedOperands = embeddedOperands;
		this.stackedOperands = stackedOperands;
	}
	
	public abstract int getLength();
	
}
