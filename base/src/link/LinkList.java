package link;

/**
 * ����Ļ�������
 * 
 * @author ��������123
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
	 * ������ͷ��������
	 * @param id
	 * @param dd
	 */
	public void insertFirst(int id, double dd) {
		Link newLink = new Link(id, dd);
		newLink.next = first;
		first = newLink;
	}

	/**
	 * ɾ������ĵ�һ������
	 * @return
	 */
	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}

	/**
	 * ��ʾ�������������
	 */
	public void display(){
		Link current = first;
		while(current != null){
			current.displayLink();
			current = current.next;
		}
	}
	
	/**
	 * ����ָ����Ԫ��
	 * @param key
	 * @return
	 */
	public Link find(int key){
		//��ʼ������ĵ�һ��Ԫ����
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
	 * ɾ��ָ����Ԫ��(�����׾ͻ�ͼ )
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
