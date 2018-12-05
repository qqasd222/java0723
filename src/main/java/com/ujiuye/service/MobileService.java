package com.ujiuye.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ujiuye.bean.Mobile;

public interface MobileService {
	public void saveMobile(List<Mobile> list);
	
	
	@GET
	@Path("/service/{num}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Mobile getMobile(@PathParam("num")String num);
}
