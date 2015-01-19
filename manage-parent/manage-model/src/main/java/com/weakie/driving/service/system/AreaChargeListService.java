package com.weakie.driving.service.system;

import java.util.List;

import com.weakie.driving.model.system.arc.AreaCharge;
import com.weakie.driving.utils.PageControl;

public interface AreaChargeListService {

	public List<AreaCharge> getAreaChargeList(PageControl p);

	public List<AreaCharge> searchAreaChargeList(PageControl p, String q);
}
