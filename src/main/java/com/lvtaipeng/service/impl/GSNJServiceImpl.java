package com.lvtaipeng.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lvtaipeng.dao.GSNJDao;
import com.lvtaipeng.entity.GSNJ;
import com.lvtaipeng.entity.Vo;
import com.lvtaipeng.service.GSNJService;

@Service
public class GSNJServiceImpl implements GSNJService {

	@Autowired
	private GSNJDao dao;

	@Override
	public List<GSNJ> list(Vo vo) {
		// TODO Auto-generated method stub
		return dao.list(vo);
	}
}
