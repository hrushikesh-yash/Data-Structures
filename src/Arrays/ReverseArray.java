package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArray {

	public static void main(String[] args) {
		Integer[] array= {8,2,4,3,9,1};
		System.out.println("hello");
		List<Integer> list= Arrays.asList(array);
		
		for (int i = list.size()-1; i>0 ; i--) {
			System.out.println(list.get(i));
		}

	}

}
