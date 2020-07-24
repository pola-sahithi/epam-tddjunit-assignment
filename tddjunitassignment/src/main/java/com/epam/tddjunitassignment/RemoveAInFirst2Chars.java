package com.epam.tddjunitassignment;

public class RemoveAInFirst2Chars {

	String remove(String string) {
		int stringLength = string.length();
		
		String result = "";
		
		if(stringLength >=2 ) {
			result = string;
			if(string.charAt(0) == 'A' && string.charAt(1) == 'A') {
				result = string.substring(2, stringLength);
			}
			else if(string.charAt(0) != 'A' && string.charAt(1) == 'A')
			{
				result = string.charAt(0) + string.substring(2, stringLength);
			}
			else if(string.charAt(0) == 'A' && string.charAt(1) != 'A') 
			{
				result = string.charAt(1) + string.substring(2, stringLength);
			}
		}
		
		return result;
		
		
	}
}
