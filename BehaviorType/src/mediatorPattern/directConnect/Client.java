package mediatorPattern.directConnect;

public class Client {

	public static void main(String[] args) {
		AbstractColleage collA=new ColleageA();
		AbstractColleage collB=new ColleagueB();
		
		System.out.println("---------����AӰ��B==================");
		collA.setNumber(120, collB);
		System.out.println("collA��numberֵ"+collA.getNumber());
		System.out.println("collB��numberֵ��"+collB.getNumber());
		
		
	}
}
