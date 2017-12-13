package observerPattern.pullModel;

/*
 * 拉模型的抽象观察者类
 */
public interface Observer {

	/**
	 * 更新接口
	 * @param subject 传入主题对象，方便获取相应的主题状态
	 */
	public void update(Subject subject);
}
