package chainOfResposibilityPattern.concreteExample;

public class GenerateManager extends Handler{

	public String handlerFeeRequest(String user, double fee) {
		// TODO Auto-generated method stub
		String str="";
		//�ܾ���Ȩ��1000����
		if(fee>1000){
			//Ϊ�˲��ԣ�ֻͬ������������
			if("����".equals(user)){
				str="�ɹ����ܾ���ͬ��"+user+"������";
			}else{
				//�����˲�ͬ�⣻
				str="ʧ�ܣ��ܾ���ͬ��"+user+"������";
			}
		}else{
			if(getSuccessor()!=null){
				return getSuccessor().handlerFeeRequest(user, fee);
			}
		}
		return str;
	}

}
