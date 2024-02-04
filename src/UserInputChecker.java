import java.util.Scanner;

public  class UserInputChecker{
	
	
	public static boolean inputCheck() {
	
		Scanner scanner = new Scanner(System.in);
		char userInput = scanner.next().charAt(0);
		
		if(userInput == 'y' || userInput == 'Y') {
			scanner.close();
			return true;
		}else {
			scanner.close();
			return false;
		}
		
		
	
	}
	
	
}