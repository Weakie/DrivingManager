package com.weakie.driving.web.controller.car;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/car/area")
public class CarAreaController {


	@RequestMapping(method = RequestMethod.GET)
	public String newCarDetail() {
		return "/car/carAreaCreate";
	}
	
}
