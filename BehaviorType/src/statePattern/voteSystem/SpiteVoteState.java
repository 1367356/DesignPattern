package statePattern.voteSystem;

public class SpiteVoteState implements VoteState{

	public void vote(String user, String voteItem, VoteManager voteManager) {
		// TODO Auto-generated method stub
		//����ͶƱ��ȡ���û���ͶƱ�ʸ񣬲�ȡ��ͶƱ��¼
		String str=voteManager.getMapVote().get(user);
		if(str!=null){
			voteManager.getMapVote().remove(user);
		}
		System.out.println("���ж���ˢ����Ϊ��ȡ��ͶƱ�ʸ�");
	}

}
