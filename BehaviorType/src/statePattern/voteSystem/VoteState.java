package statePattern.voteSystem;

public interface VoteState {

	/**
	 * ����״̬��Ӧ����Ϊ
	 */
	public void vote(String user,String voteItem,VoteManager voteManager);
}