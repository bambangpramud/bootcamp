package com.bcafinance.training.day2;

import java.util.Random;
import java.util.Scanner;

//import java.util.Iterator;

/*
@Author Administrator a.k.a. Bambang
calon menantu idaman
created with Eclipse version 
Created on 08-11-2022 11:45:13
Last Modified on 08-11-2022 11:45:13
Version 1.0
*/

public class KondisiDanLoop {
public static void main(String[] args) {
	int ahay=2;
	String uhuy = (ahay==3) ? "a":"b";
	
	System.out.println("hello world "+uhuy);
//	String ehei = "a";
//	 
//	for (int i = 0; i <5; i++) {
//		ehei +="a";
//		for (int j = 0; j <5; j++) {
//			ehei +="b";
//			for (int k = 0; k <5; k++) {
//				ehei +="c";
//			}	
//			break;
//		}	
//	}
//	
//	System.out.println(ehei );
//	-----------------------------------------------------------------------------------
//	-----------------------------------------------------------------------------------
	
//	int hh =0;
//	
//	for (int i = 0; i < 10; ++i) {
//		hh++;
//		for (int j = 0; j < 20; ++j) {
//		hh++;	
//		}
//		
//	}
//	System.out.println(hh);
//	
//	for (int i = 0; i < 10; i++) {
//		
//		if (i==5) {
//			continue;	
//		}
//		
//		System.out.print(i);
//	}
//	
	
	
//	int testes = stringToAscii("Tb@14XzM");
	
	Scanner scn = new Scanner(System.in);
	
	System.out.print("input String to convert into ASCII Value :   ");
	int testes = stringToAscii(scn.nextLine());
	
	System.out.println(testes);
	
	System.out.println(asciiToString());
	
	
	
}

public static int stringToAscii(String a) {
	
	int intAsciValue=0;
	
	String tes = a;
	
	for (int i = 0; i < tes.length(); i++) {
		
		intAsciValue += (int) tes.charAt(i);
	}
	return intAsciValue;
}

public static String asciiToString() {
	
	
	int intAsciChar=0;
	String tes = "";
	
	Random ran = new Random();
	for (int i = 0; i < 9; i++) {
		if (i<3) {
			intAsciChar = ran.nextInt(65,91); 
			tes += (char)intAsciChar;
		}
		else if (i<6) {
			intAsciChar = ran.nextInt(97,122); 
			tes += (char)intAsciChar;
		}
		else  {
			intAsciChar = ran.nextInt(48,57); 
			tes += (char)intAsciChar;
		}
		
	}
	
	return tes;
}




}
