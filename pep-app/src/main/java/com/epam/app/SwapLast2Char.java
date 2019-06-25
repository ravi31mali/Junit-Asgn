package com.epam.app;

public class SwapLast2Char {
	
	public String swap(String  str) {
		int length = str.length();
		
		if(length<2)
			return str;
		
		char lastchar = str.charAt(length-1);
		char secondlastchar = str.charAt(length-2);
	
		return str.substring(0,length-2)+lastchar+secondlastchar;
	}

}
