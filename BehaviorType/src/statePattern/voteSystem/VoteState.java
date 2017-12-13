package statePattern.voteSystem;

public interface VoteState {

	/**
	 * 处理状态对应的行为
	 */
	public void vote(String user,String voteItem,VoteManager voteManager);
}
