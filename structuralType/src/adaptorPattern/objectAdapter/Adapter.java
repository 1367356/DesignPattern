package adaptorPattern.objectAdapter;

/**
 * ����������ģʽ
 * @author admin
 *
 */
public class Adapter implements Target{

	private Adaptee adaptee;
	public Adapter(Adaptee adaptee) {
		// TODO Auto-generated constructor stub
		this.adaptee=adaptee;
	}
	/**
	 * Դ��Adaptee�з���sampleOperation1
	 * �����������ֱ��ί�ɼ���
	 */
	public void sampleOperation1(){
		this.adaptee.sampleOperation1();
	}
	
	/**
	 * Դ��Adapteeû�з���sampleOperation2
	 * �������������Ҫ����˷���
	 */
	public void sampleOperation2(){
		
	}
}