package Java1;

import java.util.HashMap;
import java.util.Map;

import java.util.Arrays;

public class Java2  {
	
	public static void main(String [] args) {
		
		String a = "Vishal Toppo";
		
		char[] b = a.toCharArray();
		
		for(int i = 0; i< b.length ; i++) {
			for(int j = i+1; j< b.length; j++) {
				if(b[i]==b[j]) {
					System.out.println(b[j]);
				}
			}
		}
	}
}
		

//test
		