package observerPattern.pullModel;

/*
 * ��ģ�͵ĳ���۲�����
 */
public interface Observer {

	/**
	 * ���½ӿ�
	 * @param subject ����������󣬷����ȡ��Ӧ������״̬
	 */
	public void update(Subject subject);
}
