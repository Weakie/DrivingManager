package com.weakie.driving.web.controller.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.weakie.driving.model.car.CarDetail;
import com.weakie.driving.service.car.CarListService;
import com.weakie.driving.utils.LogUtil;

@Controller
@RequestMapping("/car/detail")
public class CarDetailController {

	private CarListService carListService;

	@Autowired
	public void setCarListService(CarListService carListService) {
		this.carListService = carListService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String newCarDetail(ModelMap model) {
		model.addAttribute("title", "添加新工作车");
		model.addAttribute("method", "post");
		model.addAttribute("areas", this.carListService.getCarAreaList());
		return "/car/carDetailCreate";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String newCarDetail(ModelMap model, CarDetail detail) {
		model.addAttribute("title", "编辑工作车");
		model.addAttribute("method", "put");
		model.addAttribute("detail", detail);
		LogUtil.debug("CarDetailController create area:" + detail);
		return "/car/carDetailCreate";
	}

	@RequestMapping(method = RequestMethod.PUT)
	public String updateCarDetail(ModelMap model, CarDetail detail) {
		model.addAttribute("title", "编辑工作车");
		model.addAttribute("method", "put");
		model.addAttribute("detail", detail);
		LogUtil.debug("CarDetailController create detail:" + detail);
		return "/car/carDetailCreate";
	}
}
