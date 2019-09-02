package org.codingnewtalking.util;

/**
 * @author lixinjie
 * @since 2019-09-01
 */
public class ForLoopUtils {
	
	public static void each(int length, IndexMapper indexMapper) {
		for (int index = 0; index < length; index++) {
			indexMapper.map(index);
		}
	}
	
	@FunctionalInterface
	public static interface IndexMapper {
		void map(int index);
	}
}
