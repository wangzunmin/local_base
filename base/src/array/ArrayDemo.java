package array;

public class ArrayDemo {
	private long a[];
	private int nelems; 

	public ArrayDemo(int max) {
		a = new long[max];
		nelems = 0;
	}

	public boolean find(long searchKey) {
		int j;
		for (j = 0; j < nelems; j++) {
			if(a[j] == searchKey){
				break;
			}
		}
		if(j == nelems){
			return false;
		}else {
			return true;
		}
	}
	
	
	public void insert(long value){
		a[nelems] = value;
		nelems ++ ;
	}
	
	public boolean delete(long value){
		int j;
		for (j = 0; j < nelems; j++) {
			if(a[j] == value){
				break;
			}
		}
		if(j == nelems){
			return false;
		}else {
			for(int k=j;k<nelems;k++){
				a[k] = a[k+1];
			}
			nelems--;
			return true;
		}
	}
	
	
	public void display(){
		for(int i=0;i<nelems;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		int maxsize=100;
		
		ArrayDemo arrayDemo = new ArrayDemo(maxsize);
		
		arrayDemo.insert(100);
		arrayDemo.insert(66);
		arrayDemo.insert(55);
		arrayDemo.insert(88);
		arrayDemo.insert(99);
		arrayDemo.insert(33);
		arrayDemo.insert(11);
		arrayDemo.insert(77);
		arrayDemo.insert(44);
		arrayDemo.insert(23);
		arrayDemo.insert(76);
		arrayDemo.insert(98);
		
		arrayDemo.display();
		
		
		boolean find = arrayDemo.find(11);
		if(find){
			System.out.println("have found");
		}else {
			System.out.println("not found");
		}
		
		arrayDemo.delete(100);
		
		arrayDemo.display();
	}

}
