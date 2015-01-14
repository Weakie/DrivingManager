package com.weakie.driving.service.car;

import java.util.List;

import com.weakie.driving.model.car.CarArea;
import com.weakie.driving.model.car.CarDetail;
import com.weakie.driving.model.car.CarShuttle;
import com.weakie.driving.utils.PageControl;

public interface CarListService {

	public List<CarShuttle> getCarShuttleList(PageControl p);

	public List<CarShuttle> searchCarShuttleList(PageControl p, String q);

	public List<CarArea> getCarAreaList(PageControl p);

	public List<CarDetail> getCarDetailList(PageControl p);
}
