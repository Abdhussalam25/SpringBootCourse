package singlethread;

public class Service {

	public static void main(String[] args) {
		System.out.print("\nMain method started..");
		SingleThread obj1=new SingleThread("obj1");
		SingleThread obj2=new SingleThread("obj2");
		SingleThread obj3=new SingleThread("obj3");
		System.out.print("\nThread "+obj1.getName()+" is alive:"+obj1.t.isAlive()+", it is Demon:"+
		obj1.t.isDaemon());
		System.out.print("\nThread "+obj2.getName()+" is alive:"+obj2.t.isAlive()+", it is Demon:"+
				obj2.t.isDaemon());
		System.out.print("\nThread "+obj3.getName()+" is alive:"+obj3.t.isAlive()+", it is Demon:"+
				obj3.t.isDaemon());
		try {
			System.out.print("\nwaiting for threads to finish their process..");
			obj1.t.join();
			obj1.t.join();
			obj1.t.join();
		}catch(InterruptedException e) {
			e.getMessage();
		}
		System.out.print("\nThread "+obj1.getName()+" is alive:"+obj1.t.isAlive()+", it is Demon:"+
				obj1.t.isDaemon());
				System.out.print("\nThread "+obj2.getName()+" is alive:"+obj2.t.isAlive()+", it is Demon:"+
						obj2.t.isDaemon());
				System.out.print("\nThread "+obj3.getName()+" is alive:"+obj3.t.isAlive()+", it is Demon:"+
						obj3.t.isDaemon());
				System.out.print("\nMain method closed");
		
	}

}
