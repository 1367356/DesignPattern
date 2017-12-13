package iteratorPattern.blackBoxAndInnerIterator;

public interface Iterator {

	/**
	 * �����������ƶ�����һ��Ԫ��
	 */
	public void first();
	/**
	 * �����������ƶ�����һ��Ԫ��
	 */
	public void next();
	/**
	 * �����������Ƿ�Ϊ���һ��Ԫ��
	 */
	public boolean isDone();
	/**
	 * �������������ص�ǰԪ��
	 */
	public Object currentItem();
}
