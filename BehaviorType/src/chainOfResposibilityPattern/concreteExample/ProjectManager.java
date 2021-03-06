package chainOfResposibilityPattern.concreteExample;

public class ProjectManager extends Handler{

	public String handlerFeeRequest(String user, double fee) {
		// TODO Auto-generated method stub
		String str="";
		//项目经理权限500以内
		if(fee<500){
			//为了测试，只同意张三的请求
			if("张三".equals(user)){
				str="成功：项目经理同意"+user+"的申请";
			}else{
				//其他人不同意；
				str="失败：项目经理不同意"+user+"的申请";
			}
		}else{
			if(getSuccessor()!=null){
				return getSuccessor().handlerFeeRequest(user, fee);
			}
		}
		return str;
	}

}
