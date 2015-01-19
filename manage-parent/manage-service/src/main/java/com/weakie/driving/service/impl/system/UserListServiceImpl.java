package com.weakie.driving.service.impl.system;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.weakie.driving.model.system.user.User;
import com.weakie.driving.service.system.UserListService;
import com.weakie.driving.utils.PageControl;

@Service
public class UserListServiceImpl implements UserListService {

	@Override
	public List<User> getUserList(PageControl p) {
		List<User> l = new ArrayList<User>();
		for (int i = 0; i < 10; i++) {
			User u = new User("001" + i, "123", "123", "易米", false, "001");
			l.add(u);
		}
		p.setTotalNum(100);
		return l;
	}

	@Override
	public List<User> searchUserList(PageControl p, String q) {
		List<User> l = new ArrayList<User>();
		for (int i = 0; i < 10; i++) {
			User u = new User("001" + i, "123", "123", "易米", false, "001");
			l.add(u);
		}
		p.setTotalNum(100);
		return l;
	}

}
