package com.java.logic;

public class Calculation {

	public static int findMax(int arr[]){
		int max=0;
		//int max=arr[0];
		for(int i=1;i<arr.length;i++){//{1,3,4,6,2}
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}
	
	public static int cube(int n){
		return n*n*n;
	}
	
}
