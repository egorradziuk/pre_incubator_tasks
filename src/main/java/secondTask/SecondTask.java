package secondTask;

import java.util.Scanner;

public class SecondTask {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = "";
		
		while (!str.toLowerCase().equals("exit")) {
			System.out.println("Input an animal: ");
			str = sc.next();
			switch (str.toLowerCase()) {
				case Cow.name:
					new Cow().voice();
					break;
				case Cat.name:
					new Cat().voice();
					break;
				case Dog.name:
					new Dog().voice();
					break;
				default :
					System.out.println("We haven't got that animal.");
					break;
			}
		}
		sc.close();
	}
}
