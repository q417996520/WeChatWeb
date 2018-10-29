package com.wrzy.index.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wrzy.index.Bo.MemoBO;

import com.wrzy.index.service.IndexService;
@Controller
@RequestMapping("/mvc")
public class IndexController {

	
@Resource
private IndexService indexservice;
@RequestMapping("index")
public ModelAndView index() {
	System.out.println("test");
	return new ModelAndView("index");
}
@ResponseBody
@RequestMapping("test")
public List<MemoBO> test() {
	List<MemoBO> result =  indexservice.selectAll();
	System.out.println(result.get(1).getMemo());
	return result;
}
}
