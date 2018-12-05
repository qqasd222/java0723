package com.ujiuye.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ujiuye.bean.Mobile;
import com.ujiuye.mapper.MobileMapper;
import com.ujiuye.service.MobileService;
@Service("mobileServiceImpl")
public class MobileServiceImpl implements MobileService{
	@Resource
	private MobileMapper mobileMapper;
	
	@Override
	public void saveMobile(List<Mobile> list) {
		mobileMapper.saveMobile(list);
	}

	@Override
	public Mobile getMobile(String num) {
		// TODO Auto-generated method stub
		return mobileMapper.getMobile(num.substring(0, 7));
	}

}
