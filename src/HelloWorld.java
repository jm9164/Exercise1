import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		System.out.println("Hello ASE2017 - How are you now? :)");
=======
		System.out.println("Hello ASE2017 - How are you? :)");
		System.out.println("What is your name?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		HelloUser u = new HelloUser(name);
		u.greetUser();
		if (scanner != null) {
			scanner.close();
		}
>>>>>>> refs/heads/HelloUser
	}

}
