package anonyms;

public class AbstractClassFruitsImpl {

	public static void main(String[] args) {
		
		AbstractClassFruits fruits = new AbstractClassFruits()	{
			@Override
			public  void eatApple() {
				
				System.out.println("Eating an apple is everyday is good for health");
			}
			
			
		};
		
		fruits.eatApple();

	}

}
