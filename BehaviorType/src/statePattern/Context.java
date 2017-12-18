package statePattern;

/**
 * ������ɫ��
 * @author admin
 *
 */
public class Context {

	/**
	 * ����һ��state���͵Ķ���ʵ��
	 */
	private State state;
	
	public void setState(State state){
		this.state=state;
	}
	/**
	 * �û�����Ȥ�Ľӿڷ���
	 */
	public void request(String sampleParameter){
		//ת��state������
		state.handle(sampleParameter);
	}
}