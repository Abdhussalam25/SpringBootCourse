package anonyms;

public class InterfaceFruitsImpl {

	public static void main(String[] args) {
		
		InterfacFruits fruits = new InterfacFruits()	{
			@Override
			public  void eatApple() {
				
				System.out.println("Eating an apple is everyday is good for health");
			}
			
			
		};
		
		fruits.eatApple();

	}

}
