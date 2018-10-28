package link;

/**
 * 链表的基本操作
 * 
 * @author 嘻嘻哈哈123
 *
 */
public class LinkList {
	private Link first;

	public LinkList() {
		this.first = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	/**
	 * 在链表头插入数据
	 * @param id
	 * @param dd
	 */
	public void insertFirst(int id, double dd) {
		Link newLink = new Link(id, dd);
		newLink.next = first;
		first = newLink;
	}

	/**
	 * 删除链表的第一个数据
	 * @return
	 */
	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}

	/**
	 * 显示所有链表的数据
	 */
	public void display(){
		Link current = first;
		while(current != null){
			current.displayLink();
			current = current.next;
		}
	}
	
	/**
	 * 查找指定的元素
	 * @param key
	 * @return
	 */
	public Link find(int key){
		//开始从链表的第一个元素找
		Link current = first;
		while(current.iData!=key){
			if(current.next == null){
				return null;
			}else {
				current = current.next;
			}
		}
		return current;
	}
	
	/**
	 * 删除指定的元素(不明白就画图 )
	 * @param key
	 * @return
	 */
	public Link delete(int key){
		Link current = first;
		Link previous = first;
		while(current.iData!=key){
			if(current.next == null){
				return null;
			}else {
				previous = current;
				current = current.next;
			}
		}
		if(current == first){
			first = first.next;
		}else{
			previous.next = current.next;
		}
		return current;
	}
	
	
	public static void main(String[] args) {
		LinkList linkList = new LinkList();
		linkList.insertFirst(88, 00);
		linkList.insertFirst(99, 11);
		linkList.insertFirst(77, 22);
//		linkList.display();
		
		while(!linkList.isEmpty()){
			Link deleteFirst = linkList.deleteFirst();
			deleteFirst.displayLink();
		}
	}
}
