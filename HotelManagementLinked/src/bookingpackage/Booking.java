package bookingpackage;

import java.util.ArrayList;

public class Booking {
	String ac;
	String cot;
 	String cable;
 	String wifi;
 	String laundry;
 	int date;
 	//public static int datearray[]=new  int[20];
 	//public static int roomarray[]=new  int[20];
 	public ArrayList<Integer>datearray=new ArrayList<Integer>();
 	public ArrayList<Integer>roomarray=new ArrayList<Integer>();
	public String getAc() {
		return ac;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}
	public String getCot() {
		return cot;
	}
	public void setCot(String cot) {
		this.cot = cot;
	}
	public String getCable() {
		return cable;
	}
	public void setCable(String cable) {
		this.cable = cable;
	}
	public String getWifi() {
		return wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public String getLaundry() {
		return laundry;
	}
	public void setLaundry(String laundry) {
		this.laundry = laundry;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}

}
