package com.application.thread;

public class Application {

	public static void main(String[] args) {
		System.out.println("starting Thread 1");
		Task taskRunner =  new Task();
		taskRunner.start();		
		//System.out.println("This is the main thread this started executing");
		System.out.println("starting Thread 2");
		Task taskRunner2 =  new Task();
		taskRunner2.start();
	

		System.out.println("This is the main thread this stopping executing");
	
	}
	
	

}

class Task extends Thread{
	
	public void run() {
		for(int i = 0; i<1000; i++) {
		System.out.println("number value is " + i + " - " + Thread.currentThread().getName());
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
	
}