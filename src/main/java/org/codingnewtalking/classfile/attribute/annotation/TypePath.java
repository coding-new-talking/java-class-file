package org.codingnewtalking.classfile.attribute.annotation;

import org.codingnewtalking.classfile.util.Length1;

/**
 * @author lixinjie
 * @since 2019-07-15
 */
public class TypePath {

	private byte[] bytes;
	private int offset;
	
	private Length1 pathLength;
	private Path[] paths;
	
	public TypePath(byte[] bytes, int offset) {
		this.bytes = bytes;
		this.offset = offset;
	}
	
	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		return 1 + getPathLength() * 2;
	}
	
	public int getPathLength() {
		if (pathLength == null) {
			pathLength = new Length1(bytes, offset);
		}
		return pathLength.getLength();
	}

	public Path[] getPaths() {
		if (paths == null) {
			paths = new Path[getPathLength()];
			for (int i = 0, len = paths.length; i < len; i++) {
				paths[i] = new Path(bytes, offset + 1 + i * 2);
			}
		}
		return paths;
	}
}
