package com.threading;

class TestThread extends Thread{
	
	public void run() {
		System.out.println("I am simple Thread");
	}
}

public class SimpleThread {

	public static void main(String[] args) {
		
		TestThread t = new TestThread();
		t.start();

	}

}
