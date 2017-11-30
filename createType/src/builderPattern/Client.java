package builderPattern;

public class Client {

	public static void main(String[] args) {
		Builder builder=new ConcreteBuilder();
		Direcotr direcotr=new Direcotr(builder);
		direcotr.construct();
		//��ȡ��Ʒ����
		Product product=builder.retrieveResult();
		
		System.out.println(product.getPart1());
		System.out.println(product.getPart2());
	}
}
