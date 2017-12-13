package statePattern.voteSystem;

public class NormalVoteState implements VoteState{

	public void vote(String user, String voteItem, VoteManager voteManager) {
		// TODO Auto-generated method stub
		//正常投票，记录到投票记录中
		voteManager.getMapVote().put(user,voteItem);
		System.out.println("恭喜投票成功");
	}

}
