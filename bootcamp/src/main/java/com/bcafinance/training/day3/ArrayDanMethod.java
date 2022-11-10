package com.bcafinance.training.day3;
/*
@Author Administrator a.k.a. Bambang
calon menantu idaman
created with Eclipse version 2022-09 (4.25.0)
Created on 09-11-2022 15:40:10
Last Modified on 09-11-2022 15:40:10
Version 1.0
*/

public class ArrayDanMethod {
	public static void main(String[] args) {
		char[] chX = {'3','4','5'};
		char[] chY = new char[3];
		chY[2]='F';
		
		double[] doP = new double[5];
		doP[4] = 1.5;
		
		System.out.println(doP[2]);
		
		String [][] strS = new String[2][3];
		strS[0][0] = "AB";
		strS[0][1] = "CD";
		strS[0][2] = "EF";
		strS[1][0] = "GH";
		strS[1][1] = "IJ";
		strS[1][2] = "KL";
		StringBuilder sBuild = new StringBuilder();
		String strPrintz = "";
		
		for(int i=0;i<strS.length;i++)
		{
			
			for(int j=0;j<strS[i].length;j++)
			{
				if(j==strS[i].length-1)
				{
					sBuild.setLength(0);
					strPrintz = sBuild.append(strPrintz).append(strS[i][j]).append("\n").toString();
				}else
				{
					sBuild.setLength(0);
					strPrintz = sBuild.append(strPrintz).append(strS[i][j]).append(",").toString();
				}				
			}
			
		}
		System.out.print(strPrintz);
		
	}
	
	
	
}
