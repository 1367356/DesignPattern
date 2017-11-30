package builderPattern;

public class ConcreteBuilder implements Builder{
	//产品对象
	Product product=new Product();
	
	/**
	 * 产品零件建造方法1
	 */
	public void buildPart1() {
		// TODO Auto-generated method stub
		product.setPart1("编号：1");
	}
	/**
	 * 产品零件建造方法2
	 */
	public void buildPart2() {
		// TODO Auto-generated method stub
		product.setPart2("编号：2");
	}

	public Product retrieveResult() {
		// TODO Auto-generated method stub
		return product;
	}

}
