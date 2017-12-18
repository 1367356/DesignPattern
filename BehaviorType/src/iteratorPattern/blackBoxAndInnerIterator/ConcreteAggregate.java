package iteratorPattern.blackBoxAndInnerIterator;


public class ConcreteAggregate extends Aggregate{

	private Object[] objArray=null;
	/**
	 * ���췽��������ۼ����ϵľ�������
	 */
	public ConcreteAggregate(Object[] objArray) {
		// TODO Auto-generated constructor stub
		this.objArray=objArray;
	}
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(); //ʹ���ڲ��࣬���ý�ConcreteAggregate����¶��ȥ��
	}
	/**
	 * �ڲ���Ա�࣬�����������
	 */
	private class ConcreteIterator implements Iterator{

//		//���б������ľ���ľۺ϶���
//		private ConcreteAggregate agg;
		//�ڲ���������¼��ǰ������������λ��
		private int index=0;
		//��¼��ǰ�ۼ�����Ĵ�С
		private int size=0;

		public ConcreteIterator() {
			// TODO Auto-generated constructor stub
			this.size=objArray.length;
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
			return objArray[index];
		}
	}
	
}