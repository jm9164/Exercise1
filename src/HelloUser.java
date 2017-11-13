
public class HelloUser {

	public String name; 
	
	public HelloUser (String n) {
		this.name=n;
	}

	public String getName () {
		return this.name;
	}
	
	public void greetUser() {
		System.out.println("Hello "+ name +"!");
	}
}
