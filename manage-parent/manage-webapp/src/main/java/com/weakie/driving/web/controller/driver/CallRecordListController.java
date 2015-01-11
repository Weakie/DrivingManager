package com.weakie.driving.web.controller.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.weakie.driving.service.driver.CallRecordService;
import com.weakie.driving.utils.PageControl;

@Controller
@RequestMapping("/call")
public class CallRecordListController {
	
	@ModelAttribute("pc")
	public PageControl getPageControl(){
		return new PageControl("/call");
	}
	
	private CallRecordService callRecordService;
	
	@Autowired
	public void setCallRecordService(CallRecordService callRecordService) {
		this.callRecordService = callRecordService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getDriverCallRecords(@ModelAttribute("pc") PageControl p) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/driver/pages/callRecords");
		mav.addObject("callRecords", this.callRecordService.getCallRecords(p));
		return mav;
	}
}
