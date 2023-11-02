package com.jitendra.practice;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	public void drive() {
		System.out.println("I am a Bike...");
	}

}
