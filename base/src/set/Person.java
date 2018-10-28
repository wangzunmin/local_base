package set;
/**
 *  implements Comparable<Person>
 * @author 嘻嘻哈哈123
 *
 */
public class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	@Override
//	public int compareTo(Person o) {
//		int result = this.age - o.age;//主要条件
//		return result == 0 ? this.name.compareTo(o.name) : result; //名字比较次要条件
//	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
