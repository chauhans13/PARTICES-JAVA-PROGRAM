package com.interviewquestions;

import java.util.Scanner;

public class ChefMakeFood {
	/*
	 * Have a One Chef with 3 ingredients of 3 types like carb, fat, biber with
	 * unique id make distinct with 3 type of ingredients with one has repeated.
	 * Input: 1 chef Input: 3 ingredients Input: 3 type Carb fat fiber Input:
	 * ind Uniq id : type-name Input: 2 type same minimum, Input: n 0 1 2 3,
	 * everyday Unique ingredients
	 * https://www.codingame.com/work/servlet/fileservlet?id=27200830222634 12
	 * CARBBeetroot FIBERCarrot FATOlive CARBCorn CARBPotato FIBERBroccoli
	 * FATEgg FIBERBeans FATCheese CARBRice FIBERSpinach FATOil
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int si = s.nextInt();
		String data, a = "", b = "", c = "", temp;
		for (int i = 0; i < si; i++) {
			data = s.next();
			if (a.isEmpty() || b.isEmpty() || c.isEmpty()) {
				if (b.isEmpty()) {
					b = data;
					System.out.print("-");
				} else if (a.isEmpty()) {
					a = data;
					System.out.print("-");
				} else {
					temp = data.substring(0, 2);
					if (a.contains(temp) || b.contains(temp)) {
						System.out.print(b + ":" + a + ":" + data);
						a = "";
						b = "";
					} else {
						c = data;
						System.out.print("-");
					}
				}
			} else {
				temp = data.substring(0, 2);
				if (a.contains(temp) || b.contains(temp)) {
					System.out.print(b + ":" + a + ":" + data);
					b = c;
					a = "";
					c = "";
				} else if (c.contains(temp)) {
					System.out.print(b + ":" + c + ":" + data);
					b = a;
					a = "";
					c = "";
				} else {
					System.out.print("-");
				}
			}
		}
	}
}
