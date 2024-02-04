import java.util.ArrayList;
import hu.szit.Client;
import hu.szit.Convert;

class TodoService{
	
	ArrayList<Todo> toDoList;
	
	public ArrayList<Todo> getTodos (String url){
		
		String adress = url;
		Client client = new Client();
		String usersString = client.get(adress);
		ArrayList<Todo> toDoList = Convert.toListObject(usersString, Todo.class);
		this.toDoList = toDoList;
		
		
		
		
		return toDoList;
		
		
		
		
		
	}
	
	public  void check() {
		
		
			
			for(Todo todo : toDoList) {
				
				System.out.println("----------");
				System.out.println(todo.id);
				System.out.println(todo.userId);
				System.out.println(todo.title);
				System.out.println(todo.completed);
				System.out.println("----------");
				
			}
			
	}
		
	
	
	
	
}