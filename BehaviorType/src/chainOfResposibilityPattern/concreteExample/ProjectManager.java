package chainOfResposibilityPattern.concreteExample;

public class ProjectManager extends Handler{

	public String handlerFeeRequest(String user, double fee) {
		// TODO Auto-generated method stub
		String str="";
		//��Ŀ����Ȩ��500����
		if(fee<500){
			//Ϊ�˲��ԣ�ֻͬ������������
			if("����".equals(user)){
				str="�ɹ�����Ŀ����ͬ��"+user+"������";
			}else{
				//�����˲�ͬ�⣻
				str="ʧ�ܣ���Ŀ������ͬ��"+user+"������";
			}
		}else{
			if(getSuccessor()!=null){
				return getSuccessor().handlerFeeRequest(user, fee);
			}
		}
		return str;
	}

}