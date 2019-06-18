package com.epam.app;

public class CheckForA {

	public String removeA(String str) {
	       if(str.charAt(0)=='A' && str.charAt(1)=='A' ) {
	    	   return str.substring(2);
	       }else if(str.charAt(0)=='A') {
	    	   return str.substring(1);
	       }else if(str.charAt(1)=='A') {
	    	   return str.charAt(0)+str.substring(2);
	       }
	       return str;
		}
}
