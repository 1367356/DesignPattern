package strategyPattern.concreteExample;

public class Client {

	public static void main(String[] args) {
		//ѡ�񲢴�����Ҫʹ�õĲ��Զ���
		MemberStrategy strategy=new AdvancedMemberStrategy();
		//��������
		Price price=new Price(strategy);
		//����۸�
		double quote=price.quote(200);
		System.out.println("���յ�ͼ��۸�Ϊ��"+quote);
	}
}