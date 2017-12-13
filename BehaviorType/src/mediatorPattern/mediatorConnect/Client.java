package mediatorPattern.mediatorConnect;

public class Client {

	public static void main(String[] args) {
		AbstractColleague collA=new ColleagueA();
		AbstractColleague collB=new ColleagueB();
		
		Abstractmediator am=new Mediator(collA, collB);
		
		System.out.println("a affect b");
		collA.setNumber(1000, am);
		System.out.println("a"+collA.getNumber());
		System.out.println("b"+collB.getNumber());
		
	}
}
