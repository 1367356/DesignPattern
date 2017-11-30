package builderPattern.usingSecne;

public class GoodbyeBuilder extends Builder{

	public GoodbyeBuilder() {
		// TODO Auto-generated constructor stub
		msg=new GoodbyeMessage();  //创建GoodbyeBuilder对象时，将会自动包括这个GoodbyeMessage
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
