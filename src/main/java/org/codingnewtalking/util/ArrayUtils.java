package org.codingnewtalking.util;

import java.util.StringJoiner;

/**
 * @author lixinjie
 * @since 2019-09-01
 */
public class ArrayUtils {
	
	public static String join(String[] strs, String delimiter) {
		return join(strs, delimiter, "", "");
	}

	public static String join(String[] strs, String delimiter, String prefix, String suffix) {
		StringJoiner joiner = new StringJoiner(delimiter, prefix, suffix);
		ArrayUtils.action(strs, (str) -> {
			joiner.add(str);
		});
		return joiner.toString();
	}
	
	public static <S, T> void map(S[] src, T[] dest, ArrayMapper1<S, T> elementMapper) {
		int index = 0;
		for (S s : src) {
			dest[index++] = elementMapper.map(s);
		}
	}
	
	public static <S, T> void map(S[] src, T[] dest, ArrayMapper2<S, T> elementMapper) {
		int index = 0;
		for (S s : src) {
			dest[index] = elementMapper.map(index, s);
			index++;
		}
	}

	public static <S, T> void map(S[] src, T[] dest, ArrayMapper3<S, T> elementMapper) {
		int length = src.length;
		int index = 0;
		for (S s : src) {
			dest[index] = elementMapper.map(index, length, s);
			index++;
		}
	}
	
	@FunctionalInterface
	public static interface ArrayMapper1<S, T> {
		T map(S element);
	}
	
	@FunctionalInterface
	public static interface ArrayMapper2<S, T> {
		T map(int index, S element);
	}
	
	@FunctionalInterface
	public static interface ArrayMapper3<S, T> {
		T map(int index, int length, S element);
	}
	
	public static <S> void action(S[] src, ArrayAction1<S> elementAction) {
		for (S s : src) {
			elementAction.action(s);
		}
	}
	
	public static <S> void action(S[] src, ArrayAction2<S> elementAction) {
		int index = 0;
		for (S s : src) {
			elementAction.action(index++, s);
		}
	}
	
	public static <S> void action(S[] src, ArrayAction3<S> elementAction) {
		int length = src.length;
		int index = 0;
		for (S s : src) {
			elementAction.action(index++, length, s);
		}
	}
	
	@FunctionalInterface
	public static interface ArrayAction1<S> {
		void action(S element);
	}
	
	@FunctionalInterface
	public static interface ArrayAction2<S> {
		void action(int index, S element);
	}
	
	@FunctionalInterface
	public static interface ArrayAction3<S> {
		void action(int index, int length, S element);
	}
	
	public static <S> S filter(S[] src, ArrayFilter1<S> elementFilter) {
		for (S s : src) {
			if (elementFilter.filter(s)) {
				return s;
			}
		}
		return null;
	}
	
	@FunctionalInterface
	public static interface ArrayFilter1<S> {
		boolean filter(S element);
	}
}
