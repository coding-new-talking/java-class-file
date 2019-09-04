package org.codingnewtalking.instruction;

import java.util.ArrayList;
import java.util.List;

import org.codingnewtalking.unsigned.U1;
import org.codingnewtalking.util.CollectionUtils;

/**
 * @author lixinjie
 * @since 2019-09-04
 */
public class InstructionBuilder {

	private U1[] codes;
	private int offset;
	
	private InstructionBuilder(U1[] codes) {
		this.codes = codes;
		this.offset = 0;
	}
	
	public static InstructionBuilder newBuilder(U1[] codes) {
		return new InstructionBuilder(codes);
	}
	
	public Instruction[] buildAll() {
		List<Instruction> instructions = new ArrayList<>();
		Instruction instruction;
		while ((instruction = buildNext()) != null) {
			instructions.add(instruction);
		}
		return CollectionUtils.toArray(instructions, Instruction.class);
	}
	
	public Instruction buildNext() {
		Instruction instruction = buildInternal();
		if (instruction != null) {
			offset += instruction.getLength();
		}
		return instruction;
	}
	
	private Instruction buildInternal() {
		U1 opcode = codes[offset];
		switch (opcode.getValue()) {
		case 1:
			return null;
		}
		return null;
	}
}
