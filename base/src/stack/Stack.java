package stack;
/**
 * �Ƚ����
 * ������洢ջԪ��
 * Ӧ�ã���������
 * ʱ�临�Ӷ�ΪO��1��
 * @author ��������123
 *
 */
public class Stack {
	private int maxSize;
	private long[] stackArray;
	private int top;
	public Stack(int s){
		maxSize = s;
		stackArray = new long[maxSize];
		top = -1;
	}
	
	/**
	 * ��ջ
	 * @param j
	 */
	public void push(long j){
		stackArray[++top] = j;
	}
	
	/**
	 * ��ջ
	 * @return
	 */
	public long pop(){
		return stackArray[top--];
	}

	/**
	 * �鿴ջ��Ԫ��
	 * @return
	 */
	public long peek(){
		return stackArray[top];
	}
	
	/**
	 * �ж�ջ��û��Ԫ��
	 * @return
	 */
	public boolean isEmpty(){
		return top==-1;
	}
	
	/**
	 * �ж��Ƿ�ջ����
	 * @return
	 */
	public boolean isFull() {
		return top == maxSize -1;
	}
	
	
	
	public static void main(String[] args) {
		Stack stack = new Stack(10);
		int i=0;
		while(!stack.isFull()){
			stack.push(i++);
		}
//		stack.push(10);
//		stack.push(11);
//		stack.push(12);
//		stack.push(13);
//		stack.push(14);
		
		while(!stack.isEmpty()){
			long pop = stack.pop();
			System.out.print(pop);
			System.out.println(" ");
		}
	}
	
}
