package com.hui.edu.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hui.edu.model.mapper.IUserDao;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDao dao;
	
}
