package com.automobile.test;
import com.automobile.fourwheeler.honda;
import com.automobile.twowheeler.hero;


public class test {

	public static void main(String[] args) {
		hero vehicle1 = new hero();
		System.out.println(vehicle1.getmodelname());
		System.out.println(vehicle1.getregistrationNo());
		System.out.println(vehicle1.getownername());
		vehicle1.audio();
		
		
		honda vehicle2 = new honda();
		System.out.println(vehicle2.getmodelname());
		System.out.println(vehicle2.getregistrationNo());
		System.out.println(vehicle2.getownername());
		vehicle2.CDplayer();
	}

}
