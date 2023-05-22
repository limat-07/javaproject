package com.automobile.fourwheeler;
import com.automobile.*;
public class honda extends vehicle{
	@Override
	public String getmodelname() {
		return "Honda";
	}
	
	@Override
	public String getregistrationNo() {
		return "1233ASDDFF33";
	}
	
	@Override
	public String getownername() {
		return "ram";
	}
	public int getspeed() {
		return 80;
	}
	
	public void CDplayer() {
		System.out.println("Song is playing");
	}
}
