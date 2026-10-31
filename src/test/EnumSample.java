//2025/04/26
//列挙型
package test;

import java.util.ArrayList;
import java.util.List;

enum Animal {Cat, Dog, Rabit}

class Pet {
	private Animal kind;
	private String name;
	
	public Pet(Animal kind, String name) {
		this.kind = kind;
		this.name = name;
	}
	public Animal getKind() {
		return kind;
	}
	public String getName() {
		return name;
	}
}

public class EnumSample {
	public static void main(String[] args) {
		List<Pet> lst = new ArrayList<Pet>();
		lst.add(new Pet(Animal.Dog, "aaa"));
		lst.add(new Pet(Animal.Cat, "bbb"));
		lst.add(new Pet(Animal.Rabit, "ccc"));
		
		for (Pet p : lst) {
			if (p.getKind() == Animal.Dog) {
				System.out.println("Dog name : " + p.getName());
			}
		}
		
		for (Pet p : lst) {
			System.out.println(p.getKind() + ":" + p.getName());
		}
		
	}

}
