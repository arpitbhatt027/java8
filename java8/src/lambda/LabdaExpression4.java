package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer i1, Integer i2) {
		return ((i1 < i2) ? -1 : (i1 > i2) ? 1 : 0);
	}

}*/

public class LabdaExpression4 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(50);
		list.add(20);
		list.add(15);
		list.add(25);
		list.add(55);
		System.out.println("Before - " + list);
//		Collections.sort(list, new MyComparator());
		Comparator<Integer> comparator = (i1, i2) -> ((i1 < i2) ? -1 : (i1 > i2) ? 1 : 0);
		Collections.sort(list, comparator);
		System.out.println("After - " + list);
	}
}