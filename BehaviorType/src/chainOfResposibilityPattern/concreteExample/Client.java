package chainOfResposibilityPattern.concreteExample;

public class Client {

	public static void main(String[] args) {
		
		//��Ҫ��װ������
		Handler h1=new GenerateManager();
		Handler h2=new DeptManager();
		Handler h3=new ProjectManager();
		h3.setSuccessor(h2);
		h2.setSuccessor(h1);
		
		//��ʼ����
		String test1=h3.handlerFeeRequest("����", 200);
		System.out.println("test1="+test1);
		String test2=h3.handlerFeeRequest("��", 200);
		System.out.println("test2="+test2);
		
		String test3=h3.handlerFeeRequest("����", 700);
		System.out.println("test3="+test3);
		String test4=h3.handlerFeeRequest("��", 700);
		System.out.println("test4="+test4);
		
		String test5=h3.handlerFeeRequest("����", 1500);
		System.out.println("test5="+test5);
		String test6=h3.handlerFeeRequest("��", 1500);
		System.out.println("test6="+test6);
	}
	
}
