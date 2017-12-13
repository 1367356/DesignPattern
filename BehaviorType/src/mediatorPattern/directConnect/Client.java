package mediatorPattern.directConnect;

public class Client {

	public static void main(String[] args) {
		AbstractColleage collA=new ColleageA();
		AbstractColleage collB=new ColleagueB();
		
		System.out.println("---------设置A影响B==================");
		collA.setNumber(120, collB);
		System.out.println("collA的number值"+collA.getNumber());
		System.out.println("collB的number值："+collB.getNumber());
		
		
	}
}
