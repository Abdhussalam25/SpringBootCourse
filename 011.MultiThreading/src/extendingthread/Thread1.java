package extendingthread;


class ThreadA extends Thread{
	public void run() {
		for(int i=1;i<30;i++) {
			System.out.print("\nThreadA statement"+i+" thread Priorityes:"+this.getPriority());
		}
	
	 try {
		 this.sleep(500);
	 }catch(InterruptedException e) {
		 e.printStackTrace();
	 }
	 System.out.print("\nThreadA is out now");
	}
}

class ThreadB extends Thread{
	public void run() {
		for(int j=1;j<30;j++) {
			System.out.print("\nThreadB statement"+j+" thread Priorityes:"+this.getPriority());
			if(j==20) {
				this.setPriority(10);
			}
		}
	 System.out.print("\nThreadB is out now");
	}
}

class ThreadC extends Thread{
	public void run() {
		for(int k=1;k<30;k++) {
			System.out.print("\nThreadC statement"+k+" thread Priorityes:"+this.getPriority());
			if(k==10) {
				this.setPriority(1);
			}
		}
	 System.out.print("\nThreadC is out now");
	}
}

public class Thread1{
	public static void main(String args[]) {
		ThreadA thread_a=new ThreadA();
		ThreadB thread_b=new ThreadB();
		ThreadC thread_c=new ThreadC();
		
		System.out.print("\nThreadA started..");
		thread_a.start();
		
		System.out.print("\nThreadB started..");
		thread_b.start();
		
		System.out.print("\nThreadC started..");
		thread_c.start();
	}
}