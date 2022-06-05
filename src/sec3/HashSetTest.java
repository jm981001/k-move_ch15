package sec3;
import java.util.*;
public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String>set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servelt/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체 수: "+size);
		
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체 수: " + set.size());
		
		iterator=set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);
		}
		
		set.clear();
		if(set.isEmpty()) {System.out.println("비어있음");}
		
		}
	}

