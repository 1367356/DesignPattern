package flyWeight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {

	private Map<Character, FlyWeight> files=new HashMap<Character, FlyWeight>();
	
	public FlyWeight factory(Character state){
		//�ȴӻ����в��Ҷ���
		FlyWeight fly=files.get(state);
		if(fly==null){
			//������󲻴��ڣ��򴴽�һ���µ�FlyWeight����
			fly=new ConcreteFlyWeight(state);
			//������µ�FlyWeight�������ӵ�������
			files.put(state, fly);
		}
		return fly;
	}
}