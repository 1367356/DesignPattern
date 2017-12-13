package flyWeight;

public class Client {

	public static void main(String[] args) {
		FlyWeightFactory factory=new FlyWeightFactory();
		FlyWeight fly=factory.factory(new Character('a'));
		fly.operation("First Call");
		
		fly=factory.factory(new Character('b'));
		fly.operation("Second Call");
		
		fly=factory.factory(new Character('c'));
		fly.operation("Thrid Call");
	}
}
