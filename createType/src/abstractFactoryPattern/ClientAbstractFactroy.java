package abstractFactoryPattern;

/**
 * �ο���http://www.cnblogs.com/java-my-life/archive/2012/03/28/2418836.html
 *       http://www.cnblogs.com/foryang/p/5849402.html
 * @author admin
 *
 */
public class ClientAbstractFactroy {

	public static void main(String[] args) {
		/**
		 * ����װ������ʦ����
		 */
		ComputerEngineerAbstractFactory ceaf=new ComputerEngineerAbstractFactory();
		//�ͻ�ѡ�񲢴�����Ҫʹ�õ� ��Ʒ����
		AbstractFactory af=new IntelFactory();
		
		//����װ������ʦ�Լ�ѡ��Ĳ�Ʒ����װ������ʦ��װ����
		ceaf.makeComputer(af);
	
	}
}
