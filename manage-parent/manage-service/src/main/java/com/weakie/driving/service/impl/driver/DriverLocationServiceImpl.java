package com.weakie.driving.service.impl.driver;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.weakie.driving.model.Coordinate;
import com.weakie.driving.model.driver.DriverLocationInfo;
import com.weakie.driving.model.driver.DriverStatus;
import com.weakie.driving.service.driver.DriverLocationService;
import com.weakie.driving.utils.PageControl;

@Service
public class DriverLocationServiceImpl implements DriverLocationService {

	Coordinate c = new Coordinate(1000,2000);
	@Override
	public List<DriverLocationInfo> getDriverLocationInfosByStatus(DriverStatus status, PageControl p) {
		DriverLocationInfo info = new DriverLocationInfo("123","haha","冯志远","18795943912","易米",12,90,3.9,DriverStatus.DRIVING,
				"长白路",c,"龙华大道",c,new Date(),"长江路",c,new Date() );
		
		List<DriverLocationInfo> list = new ArrayList<DriverLocationInfo>();
		for(int i=0;i<p.getPageNum();i++){
			list.add(info);
		}
		p.setTotalNum(100);
		return list;
	}

	@Override
	public List<DriverLocationInfo> getDriverLocationInfosByPosition(Coordinate coordinate, PageControl p) {
		DriverLocationInfo info = new DriverLocationInfo("123","haha","冯志远","18795943912","易米",12,90,3.9,DriverStatus.DRIVING,
				"长白路",c,"龙华大道",c,new Date(),"长江路",c,new Date() );
		
		List<DriverLocationInfo> list = new ArrayList<DriverLocationInfo>();
		for(int i=0;i<p.getPageNum();i++){
			list.add(info);
		}
		p.setTotalNum(100);
		return list;
	}

	@Override
	public List<DriverLocationInfo> filterWorkingDriverLocationInfos(List<DriverLocationInfo> infos) {
		Iterator<DriverLocationInfo> iter = infos.iterator();
		while(iter.hasNext()){
			DriverLocationInfo info = iter.next();
			//转换状态，并且判断是否为none,若为none则不必显示
			DriverStatus state = DriverStatus.statusMapping(info.getCurrentState());
			if(state != DriverStatus.NONE){
				info.setCurrentState(state);
			}else{
				iter.remove();
			}
		}
		return infos;
	}

}
