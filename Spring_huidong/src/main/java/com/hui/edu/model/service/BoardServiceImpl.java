package com.hui.edu.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hui.edu.model.mapper.IBoardDao;

@Service
public class BoardServiceImpl implements IBoardService {
	@Autowired
	private IBoardDao dao;
	
}
