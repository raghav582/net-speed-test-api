package com.net.speed.test.api.service;

import org.springframework.stereotype.Service;

@Service
public class SpeedServiceImpl implements SpeedService {

	private static String BYTE_STRING = "total bytes in this string is 32";
	
	@Override
	public String downloadOneKb() {
		String str = BYTE_STRING;
		//1KB string
		for(int i=0; i<5; i++) {
			str += str;
		}
		return str;
	}

	@Override
	public void upload() {
		// TODO Auto-generated method stub
	}

	@Override
	public String downloadFiveKb() {
		String str = BYTE_STRING;
		//1KB string
		for(int i=0; i<5; i++) {
			str += str;
		}
		
		String str5kb = "";
		//5KB string
		for(int i=0; i<5; i++) {
			str5kb += str;
		}
		return str5kb;
	}

	@Override
	public String downloadHundredKb() {
		String str = BYTE_STRING;
		//1KB string
		for(int i=0; i<5; i++) {
			str += str;
		}
		
		//100KB string
		String str100kb = "";
		for(int i=0; i<100; i++) {
			str100kb += str;
		}
		return str100kb;
	}

	@Override
	public String downloadFiveHundredKb() {
		String str = BYTE_STRING;
		//1KB string
		for(int i=0; i<5; i++) {
			str += str;
		}
		
		//500KB string
		String str500kb = "";
		for(int i=0; i<500; i++) {
			str500kb += str;
		}
		return str500kb;
	}

	@Override
	public String downloadOneMb() {
		String str = BYTE_STRING;
		//1KB string
		for(int i=0; i<5; i++) {
			str += str;
		}
		
		//1MB string
		String str1mb = str;
		for(int i=0; i<10; i++) {
			str1mb += str1mb;
		}

		return str1mb;
	}

	@Override
	public String downloadFiveMb() {
		String str = BYTE_STRING;
		//1KB string
		for(int i=0; i<5; i++) {
			str += str;
		}
		
		//1MB string
		String str1mb = str;
		for(int i=0; i<10; i++) {
			str1mb += str1mb;
		}

		//5MB string
		String str5mb = "";
		for(int i=0; i<5; i++) {
			str5mb += str1mb;
		}
		return str5mb;
	}

}
