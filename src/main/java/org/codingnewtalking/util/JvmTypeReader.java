package org.codingnewtalking.util;

/**
 * @author lixinjie
 * @since 2019-09-01
 */
public class JvmTypeReader {

	public static final char EOF = '\0';
	
	private String jvmTypes;
	private int length;
	private int index;
	
	public JvmTypeReader(String jvmTypes) {
		this.jvmTypes = jvmTypes;
		this.length = jvmTypes.length();
		this.index = 0;
	}
	
	public char read() {
		if (index < length) {
			return jvmTypes.charAt(index++);
		}
		return EOF;
	}
	
	public String readUntil(char ch) {
		StringBuilder chars = new StringBuilder();
		char _char;
		while ((_char = read()) != ch && _char != EOF) {
			chars.append(_char);
		}
		if (_char == ch) {
			chars.append(_char);
		}
		return chars.toString();
	}
	
	public String readUntilNot(char ch) {
		StringBuilder chars = new StringBuilder();
		char _char;
		while ((_char = read()) == ch && _char != EOF) {
			chars.append(_char);
		}
		if (_char != EOF) {
			chars.append(_char);
		}
		return chars.toString();
	}
}
