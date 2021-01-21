package service;

import model.User;

// Type your code
public class AstroCalculator {
	public String findSign(User user) {
		String[] arr = user.getDob().split("-");
		int month = Integer.parseInt(arr[1]);
		int day = Integer.parseInt(arr[0]);
		String sign = "";
		if (month == 01) {
	         if (day < 20)
	            sign = "Capricorn";
	         else
	            sign = "Aquarius";
	      }
	      else if (month == 02) {
	         if (day < 19)
	            sign = "Aquarius";
	         else
	            sign = "Pisces";
	      }
	      else if(month == 03) {
	         if (day < 21)
	            sign = "Pisces";
	         else
	            sign = "Aries";
	      }
	      else if (month == 04) {
	         if (day < 20)
	            sign = "Aries";
	         else
	            sign = "Taurus";
	      }
	      else if (month == 05) {
	         if (day < 21)
	            sign = "Taurus";
	         else
	            sign = "Gemini";
	      }
	      else if( month == 06) {
	         if (day < 21)
	            sign = "Gemini";
	         else
	            sign = "Cancer";
	      }
	      else if (month == 07) {
	         if (day < 23)
	            sign = "Cancer";
	         else
	            sign = "Leo";
	      }
	      else if( month == 8) {
	         if (day < 23)
	            sign = "Leo";
	         else
	            sign = "Virgo";
	      }
	      else if (month == 9) {
	         if (day < 23)
	            sign = "Virgo";
	         else
	            sign = "Libra";
	      }
	      else if (month == 10) {
	         if (day < 23)
	            sign = "Libra";
	         else
	            sign = "Scorpio";
	      }
	      else if (month == 11) {
//	    	  System.out.println("11 enter");
	         if (day < 22)
	            sign = "Scorpio";
	         else
	            sign = "Sagittarius";
	      }
	      else if (month == 12) {
	         if (day < 22)
	            sign = "Sagittarius";
	         else
	            sign ="Capricorn";
	      }
		return sign;
	}
	}
