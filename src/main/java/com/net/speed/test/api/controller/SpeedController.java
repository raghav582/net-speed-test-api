package com.net.speed.test.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.net.speed.test.api.model.ModelResponse;
import com.net.speed.test.api.service.SpeedService;

@RestController
@RequestMapping(path = "v1/speed/")
public class SpeedController {
	
	@Autowired private SpeedService speedService;
	private static Logger LOGGER = LoggerFactory.getLogger(SpeedController.class);
	
	@RequestMapping(path = "download-one-kb",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ModelResponse downloadOneKb(@RequestParam(name = "random") int random) {
		try {
			String response = speedService.downloadOneKb();
			return ModelResponse.ok(response);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			return ModelResponse.failed();
		}
	}
	
	@RequestMapping(path = "download-five-kb",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ModelResponse downloadFiveKb() {
		try {
			String response = speedService.downloadFiveKb();
			return ModelResponse.ok(response);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			return ModelResponse.failed();
		}
	}
	
	@RequestMapping(path = "download-hundred-kb",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ModelResponse downloadHundredKb() {
		try {
			String response = speedService.downloadHundredKb();
			return ModelResponse.ok(response);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			return ModelResponse.failed();
		}
	}
	
	@RequestMapping(path = "download-five-hundred-kb",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ModelResponse downloadFiveHundredKb() {
		try {
			String response = speedService.downloadFiveHundredKb();
			return ModelResponse.ok(response);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			return ModelResponse.failed();
		}
	}
	
	@RequestMapping(path = "download-one-mb",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ModelResponse downloadOneMb() {
		try {
			String response = speedService.downloadOneMb();
			return ModelResponse.ok(response);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			return ModelResponse.failed();
		}
	}
	
	@RequestMapping(path = "download-five-mb",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ModelResponse downloadFiveMb() {
		try {
			String response = speedService.downloadFiveMb();
			return ModelResponse.ok(response);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			return ModelResponse.failed();
		}
	}
	
	@RequestMapping(path = "upload",
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ModelResponse upload() {
		try {
			speedService.upload();
			return ModelResponse.ok();
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			return ModelResponse.failed();
		}
	}
}
