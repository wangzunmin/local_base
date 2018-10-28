package sort;

/**
 * ð������
 * ʱ�临�Ӷ�O(n^2)
 * @author ��������123
 *
 */
public class BubbleSort {
	private int[] array;
	private int nElems; //������arraylist�е�size

	public BubbleSort(int init) {
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
		int in , out;
		for(out = nElems-1;out>1;out--){
			for(in=0;in<out;in++){
				if(array[in] > array[in + 1]){
					swap(in, in+1);
				}
			}
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
