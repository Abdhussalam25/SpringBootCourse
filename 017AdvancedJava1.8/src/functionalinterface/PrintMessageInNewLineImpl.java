package functionalinterface;

public class PrintMessageInNewLineImpl {

	public static void main(String[] args) {
		
		PrintMessageInNewLine printMessage = (message)->{ 
			System.out.println(message);
			};
			
			printMessage.printmMessageInNewLine("Hi all");

	}

}
