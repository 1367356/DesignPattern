package visitorPattern.multiAllocate;

public class SubEast1 extends East{

	@Override
	public void goEast(West west) {
		// TODO Auto-generated method stub
		west.goWest1(this);
	}
	public String myName1(){
		return "SubEast1";
	}

}
