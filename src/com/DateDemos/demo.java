package com.DateDemos;
import java.time.LocalDate;
import java.time.Month;


public class demo {

	public static void main(String[] args) {
	     
		
		LocalDate LD=LocalDate.now();//This is how we create object of Localdate.. 
		String m=LD.getMonth().toString();//Here i am getting mont using getMonth() method...but the method returns enum Month..Thus we are using toString method to convert it to a string..
 		String d=LD.getDayOfMonth()+"";//here we are getting the day of the month...as it returns an int value i am just appending a blank string to ir to convert it to string....
		String y=LD.getYear()+"";//Here also i i am doing same.....
		System.out.println(d+":"+m+":"+y);//outputting the date...
	
		
	}

}
