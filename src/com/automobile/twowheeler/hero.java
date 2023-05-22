package com.automobile.twowheeler;
import com.automobile.*;
public class hero extends vehicle {

	@Override
	public String getmodelname() {
				return "Hero";
	}

	@Override
	public String getregistrationNo() {
				return "ASDD67897RGF";
	}

	@Override
	public String getownername() {
				return "Tamil";
	}
	
	public int getspeed() {
		return 80;
	}
	
	public void audio() {
		System.out.println("Song is playing");
	}
}


