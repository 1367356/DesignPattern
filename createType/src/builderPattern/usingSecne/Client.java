package builderPattern.usingSecne;

public class Client {

	public static void main(String[] args) {
		Builder builder=new WelcomeBuilder();
		Director director=new Director(builder);
		director.construct("118", "106");
	}
}
