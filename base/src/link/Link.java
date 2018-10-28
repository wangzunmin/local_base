package link;
/**
 * 单向链表
 * @author 嘻嘻哈哈123
 *
 */
public class Link {
	public int iData; //key
	public double dData; //数据
	public Link next; //下一个节点
	public Link(int iData, double dData) {
		super();
		this.iData = iData;
		this.dData = dData;
	}
	
	public void displayLink() {
		System.out.println("iData = " + iData + " dData=" + dData);
	}
	
}