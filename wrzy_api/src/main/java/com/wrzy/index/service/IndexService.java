package com.wrzy.index.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.wrzy.index.Bo.MemoBO;
import com.wrzy.index.Dao.MemoBoDao;

@Service
public class IndexService {
	@Autowired
	private MemoBoDao memobodao;
	

	public  List<MemoBO> selectAll(){
		List<MemoBO> result= memobodao.selectAll();
		return result;
		
	}
}
