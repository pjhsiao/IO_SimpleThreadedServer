package com.patristar.io;


public class Util {
	public static int transmogrify(int data){
		if(Character.isLetter(data)) return data ^ ' ' ;
		return data;
	}
}
