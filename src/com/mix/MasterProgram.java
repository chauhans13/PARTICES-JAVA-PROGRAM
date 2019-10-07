package com.mix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MasterProgram {

	public static void main(String[] args) throws IOException {

		String onOffCharacter = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("=========Select the Option====================");
		System.out.println("1.  Print the Fibonacci Serices");
		System.out.println("2.  Check if a given number is prime or not.");
		System.out.println("3.  Print the prime list to given number");
		System.out.println("4.  Check if a given String is palindrome or not");
		System.out.println("5.  Check if given Integer is palindrome or not");
		System.out.println("6.  Check if given number is Armstrong number or not example 153= 1+ 125+27 which is equal to 1^3+5^3+3^3");
		System.out.println("7.  Write code in such a way that no deadlock should occur");
		System.out.println("8.  Write the program Reverse a String");
		System.out.println("9.  Write the Program Factorial");
		System.out.println("10.  Write the Program Factorial Using Recursion");
		System.out.println("11. Wtire the Program Remove duplicates from array");
		System.out.println("12. Print repeated characters of String");
		System.out.println("13. GCD of two numbers");
		System.out.println("14. Square root of number");
		System.out.println("15. Reverse array in place");
		System.out.println("16. Reverse words of sentence");
		System.out.println("17. Leap year");
		System.out.println("18. Check if two given String is Anagram of each other");
		System.out.println("19. Reverse a number");
		System.out.println("20. First non-repeated character of String");
		System.out.println(
				"21. Print all permutations of String input String GOD permutations as \"GOD\", \"OGD\", \"DOG\", \"GDO\", \"ODG\", and \"DGO\"");
		System.out.println("22. Reverse a String in place");
		System.out.println("23. Removal all white space from String");
		System.out.println("24. ");
		System.out.println("25. ");
		System.out.println("26. ");
		System.out.println("27. ");
		System.out.println("28. ");
		System.out.println("29. ");
		System.out.println("30. ");
		
		do {
			System.out.println("Please Choise the Case=");
			int choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1:
				System.out.println("Please Enter the nth number to print FibonacciSerices=");
				printFibonacciSerices(Integer.parseInt(br.readLine()));
				break;
			case 2:
				System.out.println("Please Enter the Number=");
				checkPrimeNumber(Integer.parseInt(br.readLine()));
				break;
			case 3:
				System.out.println("Please Enter the Number=");
				printPrimeNumberList(Integer.parseInt(br.readLine()));
				break;
			case 4:
				System.out.println("Please Enter the String=");
				checkPalindromeString(br.readLine());
				break;
			case 5:
				System.out.println("Please Enter the Number=");
				checkPalindromeNumber(Integer.parseInt(br.readLine()));
				break;
			case 6:
				System.out.println("Please Enter the Number=");
				checkArmstrongNumber(Integer.parseInt(br.readLine()));
				break;
			case 7:
				createDeadLock();
				break;
			case 8:
				System.out.println("Please Enter the String=");
				reverseString(br.readLine());
				break;
			case 9:
				System.out.println("Please Enter the Number=");
				factorialNumber(Integer.parseInt(br.readLine()));
				break;
			case 10:
				System.out.println("Please Enter the Number=");
				factorialUsingRecursionNumber(Integer.parseInt(br.readLine()));
				break;
			case 11:
				System.out.println("Please Enter the Array like(1,2,3)=");
				int[] arr = null;
				removeDupblicateElementFromArray(arr);
				break;
			case 12:
				System.out.println("Please Enter the String=");
				repatedCharactersOfString(br.readLine());
				break;
			case 13:
				System.out.println("Please Enter the First Number=");
				int firstNumber = Integer.parseInt(br.readLine());
				int secondNumber = Integer.parseInt(br.readLine());
				GCDOfTwoNumber(firstNumber,secondNumber);
				break;
			case 14:
				System.out.println("Please Enter the Number=");
				SequreRootOfNumber(Integer.parseInt(br.readLine()));
				break;
			case 15:
				System.out.println("Please Enter the Array like(1,2,3)=");
				 arr = null;
				reverseArrayInPlace(arr);
				break;
			case 16:
				System.out.println("Please Enter the Sentence=");
				reverseWordsOfSentence(br.readLine());
				break;
			case 17:
				System.out.println("Please Enter the Number=");
				checkLeepYear(Integer.parseInt(br.readLine()));
				break;
			case 18:
				System.out.println("Please Enter the First String=");
				String firstString = br.readLine();
				System.out.println("Please Enter the First String=");
				String secondString = br.readLine();
				checkAnagramString(firstString,secondString);
				break;
			case 19:
				System.out.println("Please Enter the Number=");
				reversNumber(Integer.parseInt(br.readLine()));
				break;
			
			case 20:
				System.out.println("Please Enter the String=");
				firstNonRepeatedCharacterOfString(br.readLine());
				break;
			case 21:
				System.out.println("Please Enter the String=");
				printAllPermutationsOfString(br.readLine());
				break;
			case 22:
				System.out.println("Please Enter the String=");
				reverseStringInPlace(br.readLine());
				break;
			case 23:
				System.out.println("Please Enter the String=");
				removalAllWhiteSpaceFromString(br.readLine());
				break;
			case 24:
				break;
			default:
				System.out.println("Please choise the valied case");
				break;
			}
			System.out.println("\nDo you want to contiune please type (y/Y) otherwise any Key=");
			onOffCharacter = br.readLine();

		} while (onOffCharacter.equalsIgnoreCase("y"));
		System.out.println("You Exit the Program");

	}

	private static void removalAllWhiteSpaceFromString(String str) {
		
	}

	private static void reverseStringInPlace(String str) {
		
	}

	private static void printAllPermutationsOfString(String str) {
		// TODO Auto-generated method stub
		
	}

	private static void firstNonRepeatedCharacterOfString(String str) {
		// TODO Auto-generated method stub
		
	}

	private static void reversNumber(int number) {
		// TODO Auto-generated method stub
		
	}

	private static void checkAnagramString(String firstString, String secondString) {
		// TODO Auto-generated method stub
		
	}

	private static void checkLeepYear(int number) {
		// TODO Auto-generated method stub
		
	}

	private static void reverseWordsOfSentence(String str) {
		// TODO Auto-generated method stub
		
	}

	private static void reverseArrayInPlace(int[] arr) {
		// TODO Auto-generated method stub
		
	}

	private static void SequreRootOfNumber(int number) {
		// TODO Auto-generated method stub
		
	}

	private static void GCDOfTwoNumber(int firstNumber, int secondNumber) {
		// TODO Auto-generated method stub
		
	}

	private static void repatedCharactersOfString(String str) {
		// TODO Auto-generated method stub
		
	}

	private static void removeDupblicateElementFromArray(int[] arr) {
		// TODO Auto-generated method stub
		
	}

	private static void factorialUsingRecursionNumber(int number) {
		// TODO Auto-generated method stub
		
	}

	private static void factorialNumber(int number) {
		// TODO Auto-generated method stub
		
	}

	private static void reverseString(String str) {
		// TODO Auto-generated method stub
		
	}

	private static void createDeadLock() {
		// TODO Auto-generated method stub
		
	}

	private static void checkArmstrongNumber(int number) {
		// TODO Auto-generated method stub
		
	}

	private static void checkPalindromeNumber(int number) {
		// TODO Auto-generated method stub
		
	}

	private static void checkPalindromeString(String str) {
		
	}
	private static void printPrimeNumberList(int number) {
		List<Integer> primeList = new ArrayList<>();
		
		if(number < 1 )
			System.out.println(number+" is not prime number");
		primeList.add(2);
		boolean isPrime =  true;
		for(int i=3;i<=number; i ++) {
			for(int j=0;j<primeList.size();j++) {
				if(i % primeList.get(j) == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				primeList.add(i);
		}
		
		System.out.println("The Prime Number List is="+(primeList.toString()));
		
	}

	private static void checkPrimeNumber(int number) {
		if(number <0 )
			System.out.println(number+" is not prime number");
		boolean isPrime =  true;
		for(int i=2;i<number/ 2;i++) {
			if(number % i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime)
			System.out.println(number+" is prime number");
		else
			System.out.println(number+" is not prime number");
		
	}

	private static void printFibonacciSerices(int number) {
		int a = 0;
		int b = 1;
		int c;
		
		for(int i=0;i<number;i++) {
			c = a + b;
			if(a == 0 && b == 1)
				System.out.print(b+ " ");
			else 
				System.out.print(c+" ");
			
			b = a;
			a = c;
		}

	}

}
