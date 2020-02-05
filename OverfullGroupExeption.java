package com.gmail.ps.allllll;

public class OverfullGroupExeption extends Exception {

	@Override
	public String getMessage() {
		return "The group should have no more than 10 students!";
	}

}
