package sort;
/**
 * Ñ¡ÔñÅÅĞò
 * Ê±¼ä¸´ÔÓ¶ÈO(n^2)
 * @author ÎûÎû¹ş¹ş123
 *
 */
public class SelectSort {
	private int[] array;
	private int nElems;

	public SelectSort(int init) {
		array = new int[init];
		nElems = 0;
	}

	public void display(){
		for(int a : array){
			System.out.print(a + " ");
		}
	}
	
	public void insert(int value){
		array[nElems] = value;
		nElems ++;
	}
	
	
	public void sort(){
		int in , out, min;
		for(out =0;out<nElems-1;out++){
			min = out;
			for(in=out +1;in<nElems;in++){
				if(array[in] < array[min]){
					min = in;
				}
			}
			swap(out, min);
		}
	}
	
	
	private void swap(int one, int two){
		int temp = array[one];
		array[one] = array[two];
		array[two] = temp;
	}
	
	
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort(6);
		bubbleSort.insert(98);
		bubbleSort.insert(45);
		bubbleSort.insert(109);
		bubbleSort.insert(66);
		bubbleSort.insert(11);
		bubbleSort.insert(23);
		
		bubbleSort.display();
		
		bubbleSort.sort();
		
		System.out.println();
		
		bubbleSort.display();
	}
}
