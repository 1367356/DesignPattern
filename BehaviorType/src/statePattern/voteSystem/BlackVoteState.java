package statePattern.voteSystem;

public class BlackVoteState implements VoteState{

	public void vote(String user, String voteItem, VoteManager voteManager) {
		// TODO Auto-generated method stub
		//记录黑名单中，禁止登陆系统
		System.out.println("进入黑名单，将禁止登陆和使用本系统");
	}

}
