package builderPattern;

public class Direcotr {

	//���е�ǰ��Ҫʹ�õĽ���������
	private Builder builder;
	
	/**
	 * ���췽�������뽨��������
	 */
	public Direcotr(Builder builder) {
		// TODO Auto-generated constructor stub
		this.builder=builder;
	}
	
	/**
	 * ��Ʒ���췽����������ø���������췽��
	 */
	public void construct(){
		builder.buildPart1();
		builder.buildPart2();
	}
}
