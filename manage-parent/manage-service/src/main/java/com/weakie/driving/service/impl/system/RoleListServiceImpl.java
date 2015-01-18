package com.weakie.driving.service.impl.system;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.weakie.driving.model.system.role.Authority;
import com.weakie.driving.model.system.role.Role;
import com.weakie.driving.service.system.RoleListService;
import com.weakie.driving.utils.PageControl;

@Service
public class RoleListServiceImpl implements RoleListService {

	@Override
	public List<Role> getRoleList(PageControl p) {
		List<Role> l = new ArrayList<Role>();
		for(int i=0;i<10;i++){
			l.add(new Role("12"+i,"123"+p.getPageIndex()+i,new Authority(),"asdas"));
		}
		p.setTotalNum(20);
		return l;
	}

	@Override
	public List<Role> searchRoleList(PageControl p, String q) {
		List<Role> l = new ArrayList<Role>();
		for(int i=0;i<10;i++){
			l.add(new Role("12"+i,"123"+p.getPageIndex()+i,new Authority(),"asdas"));
		}
		p.setTotalNum(20);
		return l;
	}

}
