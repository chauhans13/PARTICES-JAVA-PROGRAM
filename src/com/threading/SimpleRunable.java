package com.threading;

class TxtThread implements Runnable{

	public void run() {
		System.out.println("I am simple Thread");
	}
	
}
public class SimpleRunable {

	public static void main(String[] ar) {
		
		Thread t = new Thread(new TxtThread());
		t.start();
		
		
	}
}
