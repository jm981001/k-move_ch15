package sec2;
import java.util.Arrays;
import java.util.List;
public class ArraysAsListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<String> list1 = Arrays.asList("홍길동", "신용권", "강자바");
	for(String name : list1) {
		System.out.println(name);
	}
	
	List<Integer>list2= Arrays.asList(1,2,3);
	for(int value : list2) {
		System.out.println(value);
	}
	}

}
