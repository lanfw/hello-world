package com.nm.gtt.Algoritmo.aop;

import com.leam.ssm.chapter3.pojo.Role;

public class RoleServiceimpl implements RoleService{

	@Override
	public void printRole(Role role) {
		System.out.println(" {id =" + role.getId() +", roleName=" + role.getRoleName() 
				+", note=" + role.getNote() + " } "); 
	}

}
