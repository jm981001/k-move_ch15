package sec5;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>();
		// Exception occurred because the Fruit did not implement the Comparable.
		treeSet.add(new Fruit("grape", 3000));
		treeSet.add(new Fruit("watermelon", 10000));
		treeSet.add(new Fruit("strawberry", 6000));
		*/	
		
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new Descendingcomparator());
		// When it's stored, it's sorted in descending order based on price.
		treeSet.add(new Fruit("grape", 3000));
		treeSet.add(new Fruit("watermelon", 10000));
		treeSet.add(new Fruit("strawberry", 6000));
		Iterator<Fruit> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.name + ": " +fruit.price );
		}
		
	}

}
