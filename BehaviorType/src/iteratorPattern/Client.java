package iteratorPattern;

public class Client {

	public static void main(String[] args) {
		Object[] objArray={"one","Two","Three","Four"};
		//�����ۼ�����
		Aggregate agg=new ConcreteAggregate(objArray);
		//ѭ������ۺ϶����е�ֵ
		Iterator it=agg.createIterator();
		while(!it.isDone()){
			System.out.println(it.currentItem());
			it.next();
		}
	}
}
