package chainOfResposibilityPattern.concreteExample;

public abstract class Handler {

	/**
	 * 持有下一个处理请求的对象
	 */
	protected Handler successor=null;

	public Handler getSuccessor() {
		return successor;
	}

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	/**
	 * 处理聚餐费用的申请,方法
	 * user 申请人，
	 * fee  申请的钱数
	 * return  成功或失败的具体通知
	 */
	public abstract String handlerFeeRequest(String user,double fee);
}
