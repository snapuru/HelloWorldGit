
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Usuario user = new Usuario("Damien", "Bourel");
		
		System.out.println(user.getNombre());
		System.out.println(user.getApellido());
		
		displayGreeting();
	}
	
	private static void displayGreeting() {
		System.out.println("hello Don pepito!");
		System.out.println("hello Don Jose!");
	}

}
