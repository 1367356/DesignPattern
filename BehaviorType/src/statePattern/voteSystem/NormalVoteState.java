package statePattern.voteSystem;

public class NormalVoteState implements VoteState{

	public void vote(String user, String voteItem, VoteManager voteManager) {
		// TODO Auto-generated method stub
		//����ͶƱ����¼��ͶƱ��¼��
		voteManager.getMapVote().put(user,voteItem);
		System.out.println("��ϲͶƱ�ɹ�");
	}

}