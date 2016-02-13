package com.microservices.rest;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.UUID;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class Customer {

	
	private String len;

	private String width;

	public String area;
	
	public UUID uid;
	DecimalFormat df = new DecimalFormat();


	
	public UUID uniqueid(){
		
		uid =  java.util.UUID.randomUUID();
		return uid;
		
	}
	
	
	public String getlen() {
		return len;
	}

	public void setlen(float len) {
		df.setMaximumFractionDigits(2);
		this.len = df.format(len);
	}
	
	public String getwidth() {
		return width;
	}

	public void setwidth(float width) {
		df.setMaximumFractionDigits(2);
		this.width = df.format(width);
	}
	
	public String calcarea(float len,float width) {
		
		if (len <= 99999999)
			{
			if (width <= 99999999)
				{
				float calcarea =(float) ( 0.5 * len * width);
				df.setMaximumFractionDigits(2);
				this.area = df.format(calcarea); 
				}
			}
		else 
		{
			this.area = "incorrect input values";
		}
		return this.area;
	}
	
	


}
