package fourthTask.module2;

import secondTask.Cat;
import secondTask.Cow;
import secondTask.Dog;

import java.util.Scanner;

public class FourthTask2 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = "";
		
		while (!str.toLowerCase().equals("exit")) {
			System.out.println("Input an animal: ");
			str = sc.next();
			switch (str.toLowerCase()) {
				case Cow.name:
					AnimalVoice.getVoice(new Cow());
					break;
				case Cat.name:
					AnimalVoice.getVoice(new Cat());
					break;
				case Dog.name:
					AnimalVoice.getVoice(new Dog());
					break;
				default :
					System.out.println("We haven't got that animal.");
					break;
			}
		}
		sc.close();
	}
}
