package chainOfResposibilityPattern;

public class ConcreteHandler extends Handler{

	/**
	 * �����������ô˷�����������
	 */
	public void handleRequest() {
		/**
		 * �ж��Ƿ��к�̵����ζ�������У���ת���������̵����ζ���
		 * ���û�У���������
		 */
		if(getSuccessor()!=null){
			System.out.println("�Ź�����");
			getSuccessor().handleRequest();
		}else{
			System.out.println("��������");
		}
		
	}

}
