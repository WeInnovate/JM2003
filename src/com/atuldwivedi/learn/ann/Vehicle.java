package com.atuldwivedi.learn.ann;

public class Vehicle {
	
	@Deprecated
	public void startUsingKick() {
		System.out.println(this.getClass().getSimpleName() + " is statrted using Kick");
	}

	public void move() {
		System.out.println(this.getClass().getSimpleName() + " is moving");
	}

	public void stop() {
		System.out.println(this.getClass().getSimpleName() + " is stopped");
	}
}
