package com.wrzy.index.Dao;

import java.util.List;
import org.mybatis.spring.annotation.MapperScan;
import com.wrzy.index.Bo.MemoBO;
@MapperScan
public interface MemoBoDao {

  
    
    List<MemoBO> selectAll();

  
}