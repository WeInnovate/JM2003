package com.atuldwivedi.learn.ann;

@Preamble(author = "Atul", trainee = { "Gayathri", "Anisha", "Mounika" }, version = 10.45)
public class Lion implements Animal {

	@Override
	public void eat() {
		System.out.println(this.getClass().getSimpleName() + " is eating.");
	}

	@Override
	public void sleep() {
		System.out.println(this.getClass().getSimpleName() + " is sleeping.");
	}

	/*
	 * @Override public void ate() {
	 * System.out.println(this.getClass().getSimpleName() + " is eating."); }
	 */

}
