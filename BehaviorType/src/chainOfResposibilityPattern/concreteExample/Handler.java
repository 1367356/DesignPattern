package chainOfResposibilityPattern.concreteExample;

public abstract class Handler {

	/**
	 * ������һ����������Ķ���
	 */
	protected Handler successor=null;

	public Handler getSuccessor() {
		return successor;
	}

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	/**
	 * ����۲ͷ��õ�����,����
	 * user �����ˣ�
	 * fee  �����Ǯ��
	 * return  �ɹ���ʧ�ܵľ���֪ͨ
	 */
	public abstract String handlerFeeRequest(String user,double fee);
}
