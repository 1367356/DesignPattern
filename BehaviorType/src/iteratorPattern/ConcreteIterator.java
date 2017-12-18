package iteratorPattern;

public class ConcreteIterator implements Iterator{

	//���б������ľ���ľۺ϶���
	private ConcreteAggregate agg;
	//�ڲ���������¼��ǰ������������λ��
	private int index=0;
	//��¼��ǰ�ۼ�����Ĵ�С
	private int size=0;

	public ConcreteIterator(ConcreteAggregate concreteAggregate) {
		// TODO Auto-generated constructor stub
		this.agg=concreteAggregate;
		this.size=agg.size();
		index=0;
	}
	/**
	 * �����������ƶ�����һ��Ԫ��
	 */
	public void first() {
		// TODO Auto-generated method stub
		index=0;
	}

	/**
	 * �����������Ƿ�Ϊ��һ��Ԫ��
	 */
	public void next() {
		// TODO Auto-generated method stub
		if(index<size){
			index++;
		}
	}

	/**
	 * �����������Ƿ�Ϊ���һ��Ԫ��
	 */
	public boolean isDone() {
		// TODO Auto-generated method stub
		return (index>=size);
	}

	/**
	 * �������������ص�ǰԪ��
	 */
	public Object currentItem() {
		// TODO Auto-generated method stub
		return agg.getElement(index);
	}
	

}