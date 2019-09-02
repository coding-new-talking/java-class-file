package org.codingnewtalking.test;

/**
 * <p>蔬菜
 * @author lixinjie
 * @since 2019-07-09
 */
public abstract class Vegetable implements Green {

	protected int ptint;
	public int pbint;
	
	@Override
	public int getColor() {
		return 0;
	}

	public final String sprout() {
		return "ok";
	}
	
	public String sprout1() {
		return "ok";
	}
	
	public abstract void grow();
	
	
}
