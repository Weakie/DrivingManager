package com.weakie.driving.web.controller.driver;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.weakie.driving.model.driver.DriverDetail;
import com.weakie.driving.service.company.CompanyListService;
import com.weakie.driving.service.driver.DriverService;
import com.weakie.driving.service.system.PaymentService;
import com.weakie.driving.utils.InvokeResult;
import com.weakie.driving.utils.LogUtil;
import com.weakie.driving.utils.PageControl;
import com.weakie.driving.web.json.OpeResult;

@Controller
@RequestMapping("/driver")
public class DriverController {

	private CompanyListService companyService;
	private PaymentService paymentService;
	private DriverService driverService;

	@Autowired
	public void setCompanyService(CompanyListService companyService) {
		this.companyService = companyService;
	}

	@Autowired
	public void setPaymentService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	@Autowired
	public void setDriverService(DriverService driverService) {
		this.driverService = driverService;
	}

	private Map<String, String> getCompanys() {
		Map<String, String> company = this.companyService.getCompanyIDNameMapping();
		return company;
	}

	private Map<String, String> getPayments() {
		Map<String, String> payment = this.paymentService.getPaymentIDNameMapping();
		return payment;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String newDriver(ModelMap model) {
		model.addAttribute("title", "添加新司机");
		model.addAttribute("method", "post");
		model.addAttribute("company", this.getCompanys());
		model.addAttribute("payment", this.getPayments());
		return "/driver/driverCreate";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String newDriver(ModelMap model, DriverDetail driver) {
		// TODO 跳转到指定页面
		this.driverService.createDriver(driver);
		LogUtil.debug("DriverController create Driver:" + driver);
		return "/driver/driverCreate";
	}

	@RequestMapping(value = "/{driverID}", method = RequestMethod.GET)
	public String updateDriver(ModelMap model, @PathVariable("driverID") String driverID) {
		model.addAttribute("title", "编辑司机");
		model.addAttribute("method", "put");
		model.addAttribute("company", this.getCompanys());
		model.addAttribute("payment", this.getPayments());
		model.addAttribute("driverID", driverID);
		model.addAttribute("driver", this.driverService.getDriverInfo(driverID));
		return "/driver/driverCreate";
	}

	@RequestMapping(value = "/{driverID}", method = RequestMethod.PUT)
	public String updateDriver(ModelMap model, @PathVariable("driverID") String driverID, DriverDetail driver) {
		// TODO 跳转到指定页面
		this.driverService.updateDriver(driver);
		LogUtil.debug("DriverController create Driver:" + driver);
		return "/driver/driverCreate";
	}
	
	/**
	 * 验证注册信息合法性
	 * @param field=ID,PID,TEL
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/check", method = RequestMethod.GET, params={"field","value"})
	public OpeResult checkValidate(@RequestParam("field") String field, @RequestParam("value") String value) {
		LogUtil.info("checkValidate :" + field+", "+value);
		if(StringUtils.equalsIgnoreCase("ID", field)
				||StringUtils.equalsIgnoreCase("PID", field)
				||StringUtils.equalsIgnoreCase("TEL", field)){
			InvokeResult ir = this.driverService.checkValidate(field, value);
			return new OpeResult(ir, "验证信息:" + value);
		}
		return new OpeResult(OpeResult.RES_FAIL, "错误,请输入正确的查询域");
	}

	/**
	 * 获取司机消费记录
	 * @param driverID
	 * @param pc
	 * @return
	 */
	@RequestMapping(value = "/{driverID}/consume_history", method = RequestMethod.GET)
	public ModelAndView getConsumeHistory(@PathVariable("driverID") String driverID, @ModelAttribute("pc") PageControl pc) {
		pc.setPagePath("/driver/"+driverID+"/consume_history");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/driver/pages/consumeList");
		mav.addObject("consumeList", this.driverService.getConsmeHistory(driverID, pc));
		LogUtil.debug("DriverController getConsumeHistory:" + driverID);
		return mav;
	}
	
	/**
	 * 删除司机
	 * @param driverID
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/{driverID}", method = RequestMethod.DELETE)
	public OpeResult deleteDriver(@PathVariable("driverID") String driverID) {
		LogUtil.info("deleteDriver :" + driverID);
		InvokeResult ir = this.driverService.deleteDriver(driverID);
		return new OpeResult(ir, "删除-司机号:" + driverID);
	}

	/**
	 * 冻结/解冻 司机
	 * @param driverID
	 * @param block
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/{driverID}", method = RequestMethod.PUT, params = "block")
	public OpeResult blockDriver(@PathVariable("driverID") String driverID, @RequestParam("block") boolean block) {
		LogUtil.info("blockDriver :" + driverID + " ,block:" + block);
		InvokeResult ir = this.driverService.blockDriver(driverID, block);
		return new OpeResult(ir, (block?"冻结":"解冻")+"-司机号:" + driverID);
	}
	
	/**
	 * 修改密码
	 * @param driverID
	 * @param pwd
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/{driverID}", method = RequestMethod.PUT, params = "pwd")
	public OpeResult changeDriverPwd(@PathVariable("driverID") String driverID, @RequestParam("pwd") String pwd) {
		LogUtil.info("changeDriverPwd :" + driverID);
		//TODO 检查密码是否符合要求,不为空
		InvokeResult ir = this.driverService.changeDriverPwd(driverID, pwd);
		return new OpeResult(ir, "修改密码-司机号:" + driverID);
	}

	/**
	 * 充值
	 * 
	 * @param driverID
	 * @param comment
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/{driverID}", method = RequestMethod.PUT, params = "amount")
	public OpeResult rechargeDriverAmount(@PathVariable("driverID") String driverID,
			@RequestParam("amount") String amount) {
		LogUtil.info("rechargeDriverAmount :" + driverID + " ,amt:" + amount);
		try {
			double amt = Double.parseDouble(amount);
			InvokeResult ir = this.driverService.rechargeDriver(driverID, amt);
			return new OpeResult(ir, "充值-司机号:" + driverID+",金额"+amount);
		} catch (NumberFormatException e) {
			return new OpeResult(OpeResult.RES_FAIL, "司机号:" + driverID, "请输入一个数字");
		}
	}
	
	/**
	 * 解绑司机电话
	 * @param driverID
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/{driverID}/unbind", method = RequestMethod.PUT)
	public OpeResult unbindDriverTel(@PathVariable("driverID") String driverID) {
		LogUtil.info("unbindDriverTel :" + driverID);
		InvokeResult ir = this.driverService.unbindDriverTel(driverID);
		return new OpeResult(ir, "解绑-司机号:" + driverID);
	}

	/**
	 * 强制下线
	 * @param driverID
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/{driverID}/offline", method = RequestMethod.PUT)
	public OpeResult offlineDriver(@PathVariable("driverID") String driverID) {
		LogUtil.info("offlineDriver :" + driverID);
		InvokeResult ir = this.driverService.offlineDriver(driverID);
		return new OpeResult(ir, "强制下线-司机号:" + driverID);
	}
	
	/**
	 * 审核司机信息
	 * @param driverID
	 * @param accept
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/{driverID}", method = RequestMethod.PUT, params = "accept")
	public OpeResult verifyDriver(@PathVariable("driverID") String driverID, @RequestParam("accept") boolean accept) {
		LogUtil.info("verifyDriver :" + driverID + " ,accept:" + accept);
		InvokeResult ir = this.driverService.verifyDriver(driverID, accept);
		return new OpeResult(ir, "审核-司机号:" + driverID + ", 审核" + (accept ? "通过" : "未通过"));
	}
}
