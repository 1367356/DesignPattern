package chainOfResposibilityPattern.concreteExample;

public class DeptManager extends Handler{

	public String handlerFeeRequest(String user, double fee) {
		// TODO Auto-generated method stub
		String str="";
		//���ž����Ȩ��Ϊ1000
		//��Ŀ����Ȩ��500����
		if(fee<1000){
			//Ϊ�˲��ԣ�ֻͬ������������
			if("����".equals(user)){
				str="�ɹ������ž���ͬ��"+user+"������";
			}else{
				//�����˲�ͬ�⣻
				str="ʧ�ܣ����ž���ͬ��"+user+"������";
			}
		}else{
			if(getSuccessor()!=null){
				return getSuccessor().handlerFeeRequest(user, fee);
			}
		}
		return str;
	}

}
