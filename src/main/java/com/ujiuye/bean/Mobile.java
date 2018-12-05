package com.ujiuye.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="mobile")
public class Mobile {
	private Integer id;
	private String num;
	private String area;
	private String mobiletype;
	private String areacode;
	private String postcode;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getMobiletype() {
		return mobiletype;
	}
	public void setMobiletype(String mobiletype) {
		this.mobiletype = mobiletype;
	}
	public String getAreacode() {
		return areacode;
	}
	public void setAreacode(String areacode) {
		this.areacode = areacode;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", num=" + num + ", area=" + area + ", mobiletype=" + mobiletype + ", areacode="
				+ areacode + ", postcode=" + postcode + "]";
	}
	
	
}
