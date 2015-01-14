package com.weakie.driving.service.impl.car;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.weakie.driving.model.Coordinate;
import com.weakie.driving.model.Driver;
import com.weakie.driving.model.car.CarArea;
import com.weakie.driving.model.car.CarDetail;
import com.weakie.driving.model.car.CarShuttle;
import com.weakie.driving.model.car.CarStatus;
import com.weakie.driving.service.car.CarListService;
import com.weakie.driving.utils.PageControl;

@Service
public class CarListServiceImpl implements CarListService {

	@Override
	public List<CarShuttle> getCarShuttleList(PageControl p) {
		List<CarShuttle> list = new ArrayList<CarShuttle>();
		for (int i = 0; i < 10; i++) {
			CarShuttle shuttle = new CarShuttle("001" + i + (p.getPageIndex() - 1) * p.getPageNum(), "未接送", new Driver(
					"001", "王师傅", "13873458967", "易米"), new Coordinate(100, 200), "嘉定区", new Date(), "12341",
					new Driver("001", "李师傅", "13873458967", "易米"));
			list.add(shuttle);
		}
		p.setTotalNum(100);
		return list;
	}

	@Override
	public List<CarShuttle> searchCarShuttleList(PageControl p, String q) {
		List<CarShuttle> list = new ArrayList<CarShuttle>();
		for (int i = 0; i < 10; i++) {
			CarShuttle shuttle = new CarShuttle("001" + i + (p.getPageIndex() - 1) * p.getPageNum(), "未接送", new Driver(
					"001", "王师傅", "13873458967", "易米"), new Coordinate(100, 200), "嘉定区", new Date(), "12341",
					new Driver("001", "李师傅", "13873458967", "易米"));
			list.add(shuttle);
		}
		p.setTotalNum(100);
		return list;
	}

	@Override
	public List<CarArea> getCarAreaList() {
		List<CarArea> l = new ArrayList<CarArea>();
		for(int i=0;i<100;i++){
			CarArea c = new CarArea("112"+i,"成都市","某某区", new Coordinate(100, 200), new Coordinate(100, 200));
			l.add(c);
		}
		return l;
	}
	
	@Override
	public List<CarArea> getCarAreaList(PageControl p) {
		List<CarArea> l = new ArrayList<CarArea>();
		for(int i=0;i<10;i++){
			CarArea c = new CarArea("112"+i,"成都市","某某区", new Coordinate(100, 200), new Coordinate(100, 200));
			l.add(c);
		}
		p.setTotalNum(100);
		return l;
	}

	@Override
	public List<CarDetail> getCarDetailList(PageControl p) {
		List<CarDetail> l = new ArrayList<CarDetail>();
		for(int i=0;i<10;i++){
			CarDetail d = new CarDetail("112"+i,"渝A335E"+i,"长安",
					new CarArea("112"+i,"成都市","某某区", new Coordinate(100, 200), new Coordinate(100, 200))
			,CarStatus.FREE,new Driver("001", "李师傅", "13873458967", "易米"),"易米","易米");
			l.add(d);
		}
		p.setTotalNum(100);
		return l;
	}

}
