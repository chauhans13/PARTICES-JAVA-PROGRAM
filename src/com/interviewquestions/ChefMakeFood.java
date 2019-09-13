package com.interviewquestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChefMakeFood {
	/*
	 * Have a One Chef with 3 ingredients of 3 types like carb, fat, biber with
	 * unique id make distinct with 3 type of ingredients with one has repeated.
	 * Input: 1 chef Input: 3 ingredients Input: 3 type Carb fat fiber Input: ind
	 * Uniq id : type-name Input: 2 type same minimum, Input: n 0 1 2 3, everyday
	 * Unique ingredients
	 * https://www.codingame.com/work/servlet/fileservlet?id=27200830222634 12
	 * CARBBeetroot FIBERCarrot FATOlive CARBCorn CARBPotato FIBERBroccoli FATEgg
	 * FIBERBeans FATCheese CARBRice FIBERSpinach FATOil
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter the Days(12) to make Foods=");

		int days = Integer.parseInt(br.readLine());
		
		System.out.println("Please Enter the Foods Name Like(CARBBeetroot FIBERCarrot FATOlive CARBCorn CARBPotato FIBERBroccoli FATEgg FIBERBeans FATCheese CARBRice FIBERSpinach FATOil)=");
		String food = br.readLine();
		String[] foods = food.split(" ");
		
		int no_of_day_making__day = makeFood(days, foods);
		System.out.println("\nNumber of day making the food=" + no_of_day_making__day);

	}

	private static int makeFood(int days, String[] foods) {
		String firstFood = "";
		String secondFood = "";
		String thirdFood = "";
		String temp;
		int no_of_day_make_food = 0;
		for (int i = 0; i < days; i++) {
			
			if (firstFood.isEmpty() || secondFood.isEmpty() || thirdFood.isEmpty()) {
				if (secondFood.isEmpty()) {
					secondFood = foods[i];
					System.out.print("-");
				} else if (firstFood.isEmpty()) {
					firstFood = foods[i];
					System.out.print("-");
				} else {
					temp = foods[i].substring(0, 2);
					if (firstFood.contains(temp) || secondFood.contains(temp)) {
						System.out.print(secondFood + ":" + firstFood + ":" + foods[i]);
						firstFood = "";
						secondFood = "";
						++no_of_day_make_food;
					} else {
						thirdFood = foods[i];
						System.out.print("-");
					}
				}
			}else {
				temp = foods[i].substring(0, 2);
				if (firstFood.contains(temp) || secondFood.contains(temp)) {
					System.out.print(secondFood + ":" + firstFood + ":" + foods[i]);
					secondFood = thirdFood;
					firstFood = "";
					thirdFood = "";
					++no_of_day_make_food;
				} else if (thirdFood.contains(temp)) {
					System.out.print(secondFood + ":" + firstFood + ":" + foods[i]);
					secondFood = firstFood;
					firstFood = "";
					thirdFood = "";
					++no_of_day_make_food;
				} else {
					System.out.print("-");
				}
			}
			
		}
		return no_of_day_make_food;
	}

}
