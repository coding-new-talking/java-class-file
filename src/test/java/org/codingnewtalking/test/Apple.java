package org.codingnewtalking.test;

/**
 * @author lixinjie
 * @since 2019-08-14
 */
@Health(name = "健康水果")
public class Apple implements Fruit {

	private String name;
	private int color;
	private double weight = 0.5;
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getColor() {
		return color;
	}

	@Override
	public void setColor(int color) {
		this.color = color;
	}

	public double weight() {
		return weight;
	}
	
	public void weight(double weight) {
		this.weight = weight;
	}
}
