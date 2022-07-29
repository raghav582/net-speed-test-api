package com.net.speed.test.api.service;

public interface SpeedService {

	String downloadOneKb();
	String downloadFiveKb();
	String downloadHundredKb();
	String downloadFiveHundredKb();
	String downloadOneMb();
	String downloadFiveMb();
	void upload();
}
