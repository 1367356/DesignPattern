package visitorPattern.multiAllocate;

public class SubWest2 extends West{

	@Override
	public void goWest1(SubEast1 east) {
		// TODO Auto-generated method stub
		System.out.println("SubWest2"+east.myName1());
	}

	@Override
	public void goWest2(SubEast2 east) {
		// TODO Auto-generated method stub
		System.out.println("SubWest2"+east.myName());
	}

}
