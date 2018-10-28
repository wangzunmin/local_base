package queue;
/**
 * 队列 （先进先出）
 * @author 嘻嘻哈哈123
 *
 */
public class Queue {
	private int maxSize;
	private long[] queArray;
	private int front; //队首指针
	private int rear; //队尾指针
	private int nItems;
	public Queue(int s){
		maxSize = s;
		queArray = new long[maxSize];
		front= 0;
		rear=-1;
		nItems=0;
	}
	
	public void insert(long value){
		if(rear == maxSize-1){
			rear = -1;
		}
		queArray[++rear] =value;
		nItems ++;
	}
	
	public long remove(){
		long temp= queArray[front ++];
		if(front==maxSize){
			front = 0;
		}
		nItems --;
		return temp;
	}
	
	public long peekfront(){
		return queArray[front];
	}
	
	public boolean isEmpty(){
		return nItems == 0;
	}
	
	
	public boolean isFull(){
		return nItems == maxSize;
	}
	
	
	public int size(){
		return nItems;
	}
	
	
	
	public static void main(String[] args) {
		Queue queue = new Queue(10);
		queue.insert(10);
		queue.insert(20);
		queue.insert(30);
		queue.insert(40);
		
		long remove1 = queue.remove();
		System.out.println(remove1);
		long remove2 = queue.remove();
		System.out.println(remove2);
	}
	
}
