package flyWeight;

public class ConcreteFlyWeight implements FlyWeight{

	private Character intrinsicState=null;
	
	/**
	 * 构造函数，内蕴状态作为参数传入
	 */
	public ConcreteFlyWeight(Character state) {
		// TODO Auto-generated constructor stub
		this.intrinsicState=state;
	}
	
	/**
	 * 外蕴状态作为参数传入方法中，改变方法的行为
	 * 但是并不改变对象的内蕴状态
	 */
	public void operation(String state) {
		// TODO Auto-generated method stub
		System.out.println("Intrinsic State="+this.intrinsicState);
		System.out.println("Extrinsic state="+state);
	}

}
