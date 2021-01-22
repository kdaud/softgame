package com.mycodes.db;

import java.util.Arrays;

public class ObsClass {
	
	public static void main(String[] args) {
		System.out.println("Hello Uganda");
		Patient [] obj = {new Patient("Isaac",31),new Patient("Patrick", 34)};
		System.out.println(Arrays.asList(obj));
		
	}
	
}
