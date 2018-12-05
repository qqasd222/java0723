package com.ujiuye.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ujiuye.bean.Mobile;

public interface MobileMapper {
	public void saveMobile(List<Mobile> list);
	
	public Mobile getMobile(@Param("num")String num);
}
