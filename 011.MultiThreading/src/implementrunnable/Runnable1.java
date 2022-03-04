package implementrunnable;

class ThreadA implements Runnable{
	public void run() {
		for(int i=1;i<30;i++) {
			System.out.print("\nThreadA statement"+i+" thread Priorityes:");
		}

	 System.out.print("\nThreadA is out now");
	}
}

class ThreadB implements Runnable{
	public void run() {
		for(int j=1;j<30;j++) {
			System.out.print("\nThreadB statement"+j);
	 System.out.print("\nThreadB is out now");
	}
}}

class ThreadC implements Runnable{
	public void run() {
		for(int k=1;k<30;k++) {
			System.out.print("\nThreadC statement"+k+" thread Priorityes:");
		}
	 System.out.print("\nThreadC is out now");
	}
}

public class Runnable1{
	public static void main(String args[]) {
	Thread thread_a=new Thread(new ThreadA());
	Thread thread_b=new Thread(new ThreadB());
	Thread thread_c=new Thread(new ThreadC());
	System.out.print("\nThreadA started..");
	thread_a.start();
	
	System.out.print("\nThreadB started..");
	thread_b.start();
	
	System.out.print("\nThreadC started..");
	thread_c.start();
	}
}

