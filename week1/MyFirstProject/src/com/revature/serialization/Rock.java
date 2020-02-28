package com.revature.serialization;

import java.io.Serializable;
import java.util.Objects;

public class Rock implements Serializable {
	
	private static final long serialVersionUID = -9199352049075008719L;
	
	private int size;
	private String type;
	private double weight;
	private Color color;
	private String texture;

	public Rock() {
		super();
	}

	public Rock(int size, String type, double weight, Color color, String texture) {
		super();
		this.size = size;
		this.type = type;
		this.weight = weight;
		this.color = color;
		this.texture = texture;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, size, texture, type, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Rock)) {
			return false;
		}
		Rock other = (Rock) obj;
		return color == other.color && size == other.size && Objects.equals(texture, other.texture)
				&& Objects.equals(type, other.type)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

	@Override
	public String toString() {
		return "Rock [size=" + size + ", type=" + type + ", weight=" + weight + ", color=" + color + ", texture="
				+ texture + "]";
	}
}
