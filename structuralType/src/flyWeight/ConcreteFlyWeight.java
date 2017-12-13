package flyWeight;

public class ConcreteFlyWeight implements FlyWeight{

	private Character intrinsicState=null;
	
	/**
	 * ���캯��������״̬��Ϊ��������
	 */
	public ConcreteFlyWeight(Character state) {
		// TODO Auto-generated constructor stub
		this.intrinsicState=state;
	}
	
	/**
	 * ����״̬��Ϊ�������뷽���У��ı䷽������Ϊ
	 * ���ǲ����ı���������״̬
	 */
	public void operation(String state) {
		// TODO Auto-generated method stub
		System.out.println("Intrinsic State="+this.intrinsicState);
		System.out.println("Extrinsic state="+state);
	}

}
