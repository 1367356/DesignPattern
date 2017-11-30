package builderPattern.usingSecne;

public class WelcomeBuilder extends Builder{

	public WelcomeBuilder() {
		// TODO Auto-generated constructor stub
		msg=new WelcomeMessage();
	}
	public void buildSubject() {
		// TODO Auto-generated method stub
		msg.setSubject("welcome subject");
	}

	public void buildBody() {
		// TODO Auto-generated method stub
		msg.setBody("welcome content");
	}

}
