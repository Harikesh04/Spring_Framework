package com.saswat.spring.springcore.referenceType;

public class Score {
	private double math;
	private double chemisty;
	private double physics;

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getChemisty() {
		return chemisty;
	}

	public void setChemisty(double chemisty) {
		this.chemisty = chemisty;
	}

	public double getPhysics() {
		return physics;
	}

	public void setPhysics(double physics) {
		this.physics = physics;
	}

	@Override
	public String toString() {
		return "Score [math=" + math + ", chemisty=" + chemisty + ", physics=" + physics + "]";
	}
}
