package set;

import java.util.Comparator;
import java.util.TreeSet;


/**
 * 有序的set集合	
 * @author 嘻嘻哈哈123
 *
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Person> set = new TreeSet<>(new SetCompartor());
		set.add(new Person("tom", 11));
		set.add(new Person("tom", 11));
		set.add(new Person("jack", 46));
		set.add(new Person("jenny", 23));
		set.add(new Person("javk", 44));
		set.add(new Person("rose", 23));
		
		System.out.println(set);
	}
	
	
	private static class SetCompartor implements Comparator<Person>{

		@Override
		public int compare(Person o1, Person o2) {
			int result = o1.getAge()-o2.getAge();
			return result == 0?o1.getName().compareTo(o2.getName()) : result;
		}
		
	}
	
}
