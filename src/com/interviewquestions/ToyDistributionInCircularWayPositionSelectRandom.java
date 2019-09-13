package com.interviewquestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ToyDistributionInCircularWayPositionSelectRandom {

	/* Have the n children, to sit in circular way, to distribute the toys of any position, find the position of
	 * last children to get the toy. 
	 * Given 
	 * array of size N.
	 * T toys
	 * D starting index
	 * 
	 * 
	 */
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = null;
		System.out.println("\nPlease enter the Nth size of array like(10, 8, 3, 1)=");
		String[] values = br.readLine().split(",");
		for(int i=0;i<values.length;i++) {
			arr[i] = Integer.parseInt(values[i]);
		}
		System.out.println("Please enter the number of Toys=");
		int toys = Integer.parseInt(br.readLine());
		
		System.out.println("Please enter the Starting point to start for distribute the toys=");
		int startingIndex = Integer.parseInt(br.readLine());
		
		int pos = findTheLastPositionOfLastChilder(arr,toys,startingIndex);
	}

	private static int findTheLastPositionOfLastChilder(int[] arr, int toys, int startingIndex) {
		
		return 0;
	}

}
