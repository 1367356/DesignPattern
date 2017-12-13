package visitorPattern.multiAllocate;

public class SubEast2 extends East{

	@Override
	public void goEast(West west) {
		// TODO Auto-generated method stub
		west.goWest2(this);
	}
	public String myName(){
		return "SubEast2";
	}

}
