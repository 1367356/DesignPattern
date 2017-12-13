package observerPattern;

public class ConcreteObserver implements Observe{

	//观察者状态
	private String observerState;
	public void update(String state) {
		// TODO Auto-generated method stub
		/**
		 * 更新观察者的状态，使其与目标的状态保持一致
		 */
		observerState=state;
		System.out.println("状态为"+observerState);
	}

}
