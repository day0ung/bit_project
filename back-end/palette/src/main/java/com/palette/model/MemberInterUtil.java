package com.palette.model;

import java.util.ArrayList;

public class MemberInterUtil {
	 
	public static void main(String[] args) {
		String value[];
		int seq[];
		String str = "1,2,3,13,5,10";
		value = str.split(",");
		ArrayList<String> arr = new ArrayList<String>();
		
		for (String string : value) {
			arr.add(string);
		}
		
		for (String ddd : arr) {
			System.out.println(ddd);
		}
		
	}
	

		
		
}


