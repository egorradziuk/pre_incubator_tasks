package fourthTask.module2;

import secondTask.Animal;

public class AnimalVoice {
	
	public static <T extends Animal> void getVoice(T t) {
		t.voice();
	}
	
}
