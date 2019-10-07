package com.threading;

class PrintNumber {
	 private volatile boolean isOdd;
	synchronized  void printEven(int number) {
		while(!isOdd) {
			try {
				wait();
			}catch(InterruptedException ee) {
				Thread.currentThread().interrupt();
			}
		}
		System.out.println(Thread.currentThread().getName() + ":" + number);
        isOdd = false;
        notify();
	}
	synchronized  void printOdd(int number) {
		while(isOdd) {
			try {
				wait();
			}catch(InterruptedException ee) {
				Thread.currentThread().interrupt();
			}
		}
		System.out.println(Thread.currentThread().getId()+":"+number);
		isOdd = true;
		notify();
	}
}
class TaskEvenOdd implements Runnable{
	private int max;
    private boolean isEvenNumber;
	PrintNumber printNumber;
	
	TaskEvenOdd(PrintNumber printNumber ,int max, boolean isEvenNumber){
		this.printNumber = printNumber;
		this.max = max;
		this.isEvenNumber = isEvenNumber;
	}
	public void run() {
		int number = isEvenNumber ? 2 : 1;
        while (number <= max) {
            if (isEvenNumber) {
            	printNumber.printEven(number);
            } else {
            	printNumber.printOdd(number);
            }
            number += 2;
        }
	}
}
public class TwoThreadSync {
	
	
	public void main(String[] arr) {
		PrintNumber printNumber  = new PrintNumber();
		Thread t1 = new Thread(new TaskEvenOdd(printNumber, 10, false),"Odd");
		Thread t2 = new Thread(new TaskEvenOdd(printNumber, 10, false),"Even");
	}

	
}
