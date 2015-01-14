package com.weakie.driving.service.impl.car;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.weakie.driving.model.car.CarArea;
import com.weakie.driving.model.car.CarDetail;
import com.weakie.driving.model.car.CarShuttle;
import com.weakie.driving.service.car.CarListService;
import com.weakie.driving.utils.PageControl;

@Service
public class CarListServiceImpl implements CarListService {

	@Override
	public List<CarShuttle> getCarShuttleList(PageControl p) {
		// TODO Auto-generated method stub
		p.setTotalNum(100);
		return Collections.emptyList();
	}

	@Override
	public List<CarShuttle> searchCarShuttleList(PageControl p, String q) {
		// TODO Auto-generated method stub
		p.setTotalNum(100);
		return Collections.emptyList();
	}

	@Override
	public List<CarArea> getCarAreaList(PageControl p) {
		// TODO Auto-generated method stub
		p.setTotalNum(100);
		return Collections.emptyList();
	}

	@Override
	public List<CarDetail> getCarDetailList(PageControl p) {
		// TODO Auto-generated method stub
		p.setTotalNum(100);
		return Collections.emptyList();
	}

}
