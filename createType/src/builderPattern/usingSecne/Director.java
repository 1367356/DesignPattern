package builderPattern.usingSecne;

public class Director {
	Builder builder;
	
	/**
	 * 构造函数
	 */
	public Director(Builder builder) {
		// TODO Auto-generated constructor stub
		this.builder=builder;
	}
	/**
	 * 产品构造方法，复制调用各零件的构造方法
	 */
	public void construct(String toAddress,String fromAddress){
		this.builder.buildTo(toAddress);
		this.builder.buildFrom(fromAddress);
		this.builder.buildSubject();
		this.builder.buildBody();
		this.builder.buildSendDate();
		this.builder.sendMessage();
	}
}
