package com.lvtaipeng.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lvtaipeng.entity.GSNJ;
import com.lvtaipeng.entity.Vo;
import com.lvtaipeng.service.GSNJService;

@Controller
public class GSNJController {

	@Autowired
	private GSNJService service;
	
	@RequestMapping("/list")
	public String list(@RequestParam(defaultValue = "1")int pageNum,Model m,Vo vo) {
		PageHelper.startPage(pageNum, 5);
		List<GSNJ> list = service.list(vo);
		PageInfo<GSNJ> pg = new PageInfo<>(list);
		m.addAttribute("pg", pg);
		m.addAttribute("vo", vo);
		m.addAttribute("list", list);
		return "list";
	}
}
