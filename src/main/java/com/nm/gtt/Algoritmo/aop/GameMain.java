package com.nm.gtt.Algoritmo.aop;

import com.leam.ssm.chapter3.pojo.Role;

public class GameMain {
	public static void main(String[] args) {
		RoleService roleService = new RoleServiceimpl(); 
		Interceptor interceptor = new Roleinterceptor(); 
		RoleService proxy = ProxyBeanFactory.getBean(roleService,
				interceptor) ; 
		Role role= new Role(1L, "role name l ","role note l"); 
		proxy.printRole(role);
		
		System.out.println("＃＃＃＃＃＃＃＃＃＃＃＃＃＃测试 afterthrowing 方法###############") ; 
		role = null; 
		proxy.printRole(role) ;
	}
}
