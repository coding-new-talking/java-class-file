package org.codingnewtalking.classfile.attribute.util;

import org.codingnewtalking.instruction.Instruction;
import org.codingnewtalking.instruction.InstructionBuilder;
import org.codingnewtalking.unsigned.U1;
import org.codingnewtalking.util.ForUtils;

/**
 * @author lixinjie
 * @since 2019-07-22
 */
public class JvmCode {
	
	private byte[] bytes;
	private int offset;
	
	private int codeLength;
	private U1[] u1s;
	private Instruction[] instructions;
	
	public JvmCode(byte[] bytes, int offset, int codeLength) {
		this.bytes = bytes;
		this.offset = offset;
		this.codeLength = codeLength;
	}

	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		return codeLength;
	}
	
	public int getCodeLength() {
		return codeLength;
	}
	
	public U1[] getCodes() {
		if (u1s == null) {
			u1s = new U1[codeLength];
			for (int i = 0; i < codeLength; i++) {
				u1s[i] = new U1(bytes, offset + i);
			}
		}
		return u1s;
	}
	
	public int getInstructionCount() {
		return getInstructions().length;
	}

	public Instruction[] getInstructions() {
		if (instructions == null) {
			instructions = InstructionBuilder.newBuilder(getCodes()).buildAll();
		}
		return instructions;
	}

	public String toString(String baseBlank, String blank4) {
		return "JvmCode [\r\n"
				+ baseBlank + blank4 + "getInstructionCount()=" + getInstructionCount() + ", \r\n"
				+ baseBlank + blank4 + "getInstructions()=[\r\n"
				+ toString(getInstructions(), baseBlank + blank4 + blank4, blank4)
				+ baseBlank + blank4 + "]\r\n"
				+ baseBlank + "]";
	}
	
	private String toString(Instruction[] instructions, String baseBlank, String blank4) {
		StringBuilder builder = new StringBuilder();
		ForUtils.each(instructions.length, (index) -> {
			builder.append(baseBlank)
					.append(instructions[index])
					.append("\r\n");
		});
		return builder.toString();
	}
}
