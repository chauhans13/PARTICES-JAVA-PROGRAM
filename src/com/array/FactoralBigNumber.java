package com.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FactoralBigNumber {
	
	public static void main(String... ar) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the digit:");
		String[] values = br.readLine().split("");
		System.out.println("Values"+values);
		List<Integer> fact = new ArrayList<Integer>();
		 for(int i =0 ; i<values.length; i++){
			 if(fact.isEmpty())
				 fact.add(1);
			 else
				 fact.add((fact.get(0)) * i);
	    }
		
		System.out.println(fact.toString());
	}

}
