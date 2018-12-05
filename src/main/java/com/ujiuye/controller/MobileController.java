package com.ujiuye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ujiuye.bean.Mobile;
import com.ujiuye.service.MobileService;

@Controller
public class MobileController {
	
	@Autowired
	private MobileService service;
	
	@RequestMapping("getMoblie")
	@ResponseBody
	public Mobile getMoblie(String num){
		return service.getMobile(num);
	}
}
