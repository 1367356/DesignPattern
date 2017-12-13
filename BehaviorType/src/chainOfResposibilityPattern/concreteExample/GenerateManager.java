package chainOfResposibilityPattern.concreteExample;

public class GenerateManager extends Handler{

	public String handlerFeeRequest(String user, double fee) {
		// TODO Auto-generated method stub
		String str="";
		//总经理权限1000以上
		if(fee>1000){
			//为了测试，只同意张三的请求
			if("张三".equals(user)){
				str="成功：总经理同意"+user+"的申请";
			}else{
				//其他人不同意；
				str="失败：总经理不同意"+user+"的申请";
			}
		}else{
			if(getSuccessor()!=null){
				return getSuccessor().handlerFeeRequest(user, fee);
			}
		}
		return str;
	}

}
