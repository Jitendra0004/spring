package com.jitendra.practice;

public interface Vehicle {
	public default void drive() {
		System.out.println("I am a Bike...");
	}

}
