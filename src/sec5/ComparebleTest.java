package sec5;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparebleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("HongGilDong", 45));
		treeSet.add(new Person("GamJaVa", 25));
		treeSet.add(new Person("ParkJiWon", 31));
		
		Iterator<Person> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + ": " + person.age);
		}
		
	}

}
