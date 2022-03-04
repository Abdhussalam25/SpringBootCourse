package singlethread;

public class SingleThread implements Runnable{
	String name;
	Thread t;
	public String getName() {
		return(this.name);
	}
	public SingleThread(String name) {
		this.name = name;
		this.t = new Thread(this,name);
		System.out.print("\nThe New thread:"+this.t);
		t.start();
	}
	@Override
	public void run() {
		try {
			for(int i=5;i>0;i--) {
				System.out.print("\nthread Name:"+this.getName()+" having value:"+i);
				Thread.sleep(1000);
			}
			}catch(InterruptedException e) {
				System.out.print("\nthread Name:"+name+ " interrupted..");
			}
		
		System.out.print("\nthread Name:"+name+ " existing..");
		}	
}
