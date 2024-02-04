/*
 * File: Dolgozat001
 * Author: Varjaskéri Dániel
 * Copyright: 2024, Varjaskéri Dániel
 * Group: Szoft II/1/E
 * Date: 2024-02-04
 * Github: https://github.com/VDan007/Dolgozat001
 * Licenc: GNU GPL
 */




import java.util.ArrayList;

class App{
	
	
	public static void main( String[] args) {
		
		System.out.println("Program started");
		
		
		TodoService service = new TodoService();
		
		try {
		
			ArrayList<Todo> list = service.getTodos("https://jsonplaceholder.typicode.com/todos");
			
			if(list != null) {
				
				System.out.println("Todo list have been recieved");
				System.out.println("Would you like to check it? (press y if yes any other if no)");
				boolean Answer = UserInputChecker.inputCheck();
				
				if(Answer) {
					service.check();
				}else {
					System.out.println("Have a nice day!");
				}
				
			}
			
		}catch(Exception e) {
			
			System.out.println("Exception message:  " + e.getMessage());
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
