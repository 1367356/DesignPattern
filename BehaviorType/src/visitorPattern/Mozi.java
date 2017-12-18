package visitorPattern;

/**
 * http://www.cnblogs.com/foryang/p/5849402.html
 */
public class Mozi {

	public void ride(Horse h){
		System.out.println("����");
	}
	public void ride(WhiteHorse wh){
		System.out.println("�����");
	}
	public void ride(BlackHorse bh){
		System.out.println("�����");
	}
	public static void main(String[] args) {
		Horse wh=new WhiteHorse();
		Horse bh=new BlackHorse();
		Mozi mozi=new Mozi();
		mozi.ride(bh);
		mozi.ride(wh);
	}
}