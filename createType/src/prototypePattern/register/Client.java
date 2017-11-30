package prototypePattern.register;

public class Client {

	public static void main(String[] args) {
		try {
			Prototype p1=new ConcretePrototype1();
			PrototypeManager.setPrototype("p1", p1);
			//��ȡԭ������������
			Prototype p3=PrototypeManager.getPrototype("p1").clonePrototype();
			p3.setName("����");
			System.out.println("��һ��ʵ��"+p3);
			
			//���˶�̬���л���ʵ��
			Prototype p2=new ConcretePrototype2();
			PrototypeManager.setPrototype("p1", p2);
			//���»��ԭ������������
			Prototype p4=PrototypeManager.getPrototype("p1").clonePrototype();
			p4.setName("����");
			System.out.println("�ڶ���ʵ����"+p4);
			
			//����ע�������ԭ��
			PrototypeManager.removePrototype("p1");
			//�ٴλ�ȡԭ������������
			Prototype p5=PrototypeManager.getPrototype("p1").clonePrototype();
			p5.setName("����");
			System.out.println("������ʵ����"+p5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
