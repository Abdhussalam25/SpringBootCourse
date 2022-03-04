package com.application.thread;

public class ThreadApplication {

	public static void main(String[] args) {
		
	ThreadName newThread =  new ThreadName("Thread-A");
	ThreadName newThread2 =  new ThreadName("Thread-A");
	
	newThread.start();
	newThread2.start();
		
	}
}
	
	class ThreadName extends Thread{
		
	String threadName;		
	
		
		public ThreadName() {
		super();
	}


		public ThreadName(String threadName) {
		
		this.threadName = threadName;
	}
		

		public String getThreadName() {
			return threadName;
		}


		public void setThreadName(String threadName) {
			this.threadName = threadName;
		}


		public void run() {
			Thread.currentThread().setName(threadName);
			for(int i = 0; i<100; i++) {
				System.out.println("number value is " + i + " - " + Thread.currentThread().getName() );
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			
			
		}
		
	}
	

