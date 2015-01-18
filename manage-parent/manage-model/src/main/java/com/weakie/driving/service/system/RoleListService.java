package com.weakie.driving.service.system;

import java.util.List;

import com.weakie.driving.model.system.role.Role;
import com.weakie.driving.utils.PageControl;

public interface RoleListService {

	public List<Role> getRoleList(PageControl p);
	
	public List<Role> searchRoleList(PageControl p,String q);
}
