package cn.nilaile.ssm.service;

import java.util.List;

import cn.nilaile.ssm.entity.User;

public interface UserService {

	List<User> getUserList(int offset, int limit);
	 
}
