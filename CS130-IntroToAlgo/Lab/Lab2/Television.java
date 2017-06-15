
//purpose of this class is to model a television
//Charlson So 3/8/2017

import java.util.*;
public class Television{
	

	private String MANUFACTURER;
	private int SCREEN_SIZE;
	private boolean powerOn;
	private int channel;
	private int volume;
	//default constructor that inputs string and int parameter
	//changes the power to false, volume to 20 and channel to 2, Manufacturer to the input string and Screen size to the input int
	
	Television(String brand,int size){
		powerOn=false;
		volume =20;
		channel=2;
		MANUFACTURER=brand;
		SCREEN_SIZE=size;

	}

	//outputs volume level : int
	public int getVolume(){
		return volume;
	}
	//outputs channel : int
	public int getChannel(){
		return channel;
	}
	//output manufacturer name : string
	public String getManufacturer(){
		return MANUFACTURER;
	}
	//output screen size : int
	public int getScreenSize(){
		return SCREEN_SIZE;
	}
	//intput int to change channel
	//output voice
	public void setChannel(int a){
		channel = a;
		
	}
	//change power to True if False, False if True
	public void power(){
		powerOn = !powerOn;
	}
	//increase the volume by 1
	public void increaseVolume(){
		volume+=1;
	}
	//decrease the volume by 1
	public void decreaseVolume(){
		volume-=1;
	}

}
