package strategyPattern.concreteExample;

/**
 * �����ۿ���
 */
public interface MemberStrategy {

	/**
	 * ����ͼ��ļ۸�
	 * @param booksPrice ͼ���ԭ��
	 * @return  ��������ۺ�ļ۸�
	 */
	public double calcPrice(double booksPrice);
}
