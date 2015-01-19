package com.weakie.driving.service.impl.system;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.weakie.driving.model.system.arc.AreaCharge;
import com.weakie.driving.service.system.AreaChargeListService;
import com.weakie.driving.utils.PageControl;

@Service
public class AreaChargeListServiceImpl implements AreaChargeListService{

	@Override
	public List<AreaCharge> getAreaChargeList(PageControl p) {
		p.setTotalNum(100);
		return Collections.emptyList();
	}

	@Override
	public List<AreaCharge> searchAreaChargeList(PageControl p, String q) {
		p.setTotalNum(100);
		return Collections.emptyList();
	}

}
