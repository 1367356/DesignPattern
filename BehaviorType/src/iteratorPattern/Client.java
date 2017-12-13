package iteratorPattern;

public class Client {

	public static void main(String[] args) {
		Object[] objArray={"one","Two","Three","Four"};
		//创建聚集对象
		Aggregate agg=new ConcreteAggregate(objArray);
		//循环输出聚合对象中的值
		Iterator it=agg.createIterator();
		while(!it.isDone()){
			System.out.println(it.currentItem());
			it.next();
		}
	}
}
