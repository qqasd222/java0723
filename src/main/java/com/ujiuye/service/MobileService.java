package com.ujiuye.service;

import java.util.List;

import com.ujiuye.bean.Mobile;

public interface MobileService {
	public void saveMobile(List<Mobile> list);
	
	public Mobile getMobile(String num);
}
