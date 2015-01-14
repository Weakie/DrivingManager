package com.weakie.driving.web.controller.car;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.weakie.driving.model.car.CarArea;
import com.weakie.driving.utils.LogUtil;


@Controller
@RequestMapping("/car/area")
public class CarAreaController {

	@RequestMapping(method = RequestMethod.GET)
	public String newCarArea(ModelMap model) {
		model.addAttribute("title", "添加新工作区域");
		model.addAttribute("method", "post");
		return "/car/carAreaCreate";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String newCarArea(ModelMap model,CarArea area) {
		model.addAttribute("title", "编辑工作区域");
		model.addAttribute("method", "put");
		model.addAttribute("area", area);
		LogUtil.debug("CarAreaController create area:"+area);
		return "/car/carAreaCreate";
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public String updateCarArea(ModelMap model,CarArea area) {
		model.addAttribute("title", "编辑工作区域");
		model.addAttribute("method", "put");
		model.addAttribute("area", area);
		LogUtil.debug("CarAreaController update area:"+area);
		return "/car/carAreaCreate";
	}
}
