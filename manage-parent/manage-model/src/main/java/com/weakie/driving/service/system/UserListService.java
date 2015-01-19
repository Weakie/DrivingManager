package com.weakie.driving.service.system;

import java.util.List;

import com.weakie.driving.model.system.user.User;
import com.weakie.driving.utils.PageControl;

public interface UserListService {

	public List<User> getUserList(PageControl p);
	
	public List<User> searchUserList(PageControl p,String q);
}
