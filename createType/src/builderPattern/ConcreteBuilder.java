package builderPattern;

public class ConcreteBuilder implements Builder{
	//��Ʒ����
	Product product=new Product();
	
	/**
	 * ��Ʒ������췽��1
	 */
	public void buildPart1() {
		// TODO Auto-generated method stub
		product.setPart1("��ţ�1");
	}
	/**
	 * ��Ʒ������췽��2
	 */
	public void buildPart2() {
		// TODO Auto-generated method stub
		product.setPart2("��ţ�2");
	}

	public Product retrieveResult() {
		// TODO Auto-generated method stub
		return product;
	}

}
