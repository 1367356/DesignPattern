package builderPattern.usingSecne;

public class GoodbyeBuilder extends Builder{

	public GoodbyeBuilder() {
		// TODO Auto-generated constructor stub
		msg=new GoodbyeMessage();  //����GoodbyeBuilder����ʱ�������Զ��������GoodbyeMessage
	}
	
	public void buildSubject() {
		// TODO Auto-generated method stub
		msg.setSubject("goodbye subject");
	}

	public void buildBody() {
		// TODO Auto-generated method stub
		msg.setBody("goodbye content");
	}

}
