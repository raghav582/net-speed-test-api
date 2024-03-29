package com.net.speed.test.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "v1/ping")
public class PingController {

	@RequestMapping(path = "",
			method = RequestMethod.GET)
	@ResponseBody
	public String ping() {
		return "successful";
	}
}
