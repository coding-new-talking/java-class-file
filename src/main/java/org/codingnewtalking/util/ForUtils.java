package org.codingnewtalking.util;

/**
 * @author lixinjie
 * @since 2019-09-01
 */
public class ForUtils {
	
	public static void each(int length, IndexAction1 indexAction) {
		for (int index = 0; index < length; index++) {
			indexAction.action(index);
		}
	}
	
	@FunctionalInterface
	public static interface IndexAction1 {
		void action(int index);
	}
}
