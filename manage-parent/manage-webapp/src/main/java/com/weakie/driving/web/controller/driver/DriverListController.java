package com.weakie.driving.web.controller.driver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/drivers")
public class DriverListController {

	@RequestMapping(method = RequestMethod.GET, params = { "!type", "!q" })
	public String driverIndex() {
		return "/driver/driverIndex";
	}
}
