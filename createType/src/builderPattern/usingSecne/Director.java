package builderPattern.usingSecne;

public class Director {
	Builder builder;
	
	/**
	 * ���캯��
	 */
	public Director(Builder builder) {
		// TODO Auto-generated constructor stub
		this.builder=builder;
	}
	/**
	 * ��Ʒ���췽�������Ƶ��ø�����Ĺ��췽��
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
