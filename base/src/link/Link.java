package link;
/**
 * ��������
 * @author ��������123
 *
 */
public class Link {
	public int iData; //key
	public double dData; //����
	public Link next; //��һ���ڵ�
	public Link(int iData, double dData) {
		super();
		this.iData = iData;
		this.dData = dData;
	}
	
	public void displayLink() {
		System.out.println("iData = " + iData + " dData=" + dData);
	}
	
}