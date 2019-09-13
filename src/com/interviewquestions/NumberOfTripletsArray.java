package com.interviewquestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOfTripletsArray {
	
	 /*Given an array arr of size N. The task is to count number of triplets in the array such that
	 * case 1: i<j<k 
	 * case 2: a[i]<a[j]<a[k] or a[i]>a[j]>a[k]
	 * example:
	 * Input : arr[] = {10, 8, 3, 1}
	 * Output : 4
	 * The triplets are:
		1, 3, 8
		1, 3, 10
		1, 8, 10
		3, 8, 10
	 */

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    System.out.println("\nPlease enter the Nth size of array likelike(10,8,3,1)=");
	    String[] values = br.readLine().split(",");
	    int[] arr = new int[values.length];
	    for(int i =0 ; i<values.length; i++){
	    	arr[i] = Integer.parseInt(values[i]);
	    }
		
	    int numberOFTripletArray = numberOFTripletArray(arr);
	}

	private static int numberOFTripletArray(int[] arr) {
		return 0;
	}

}
