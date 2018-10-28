package stack;
/**
 * 先进后出
 * 用数组存储栈元素
 * 应用：单词逆序
 * 时间复杂度为O（1）
 * @author 嘻嘻哈哈123
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
	 * 入栈
	 * @param j
	 */
	public void push(long j){
		stackArray[++top] = j;
	}
	
	/**
	 * 出栈
	 * @return
	 */
	public long pop(){
		return stackArray[top--];
	}

	/**
	 * 查看栈顶元素
	 * @return
	 */
	public long peek(){
		return stackArray[top];
	}
	
	/**
	 * 判断栈中没有元素
	 * @return
	 */
	public boolean isEmpty(){
		return top==-1;
	}
	
	/**
	 * 判断是否栈已满
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
