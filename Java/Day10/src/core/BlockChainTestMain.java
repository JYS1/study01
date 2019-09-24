package core;

import Util.Util;

public class BlockChainTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( Util.getHash( "1" ) );
		//6b86b273ff34fce19d6b804eff5a3f5747ada4eaa22f1d49c01e52ddb7875b4b 가지고 2를 유추 해야함 = 핵킹이 힘듬.
		// 채굴의 기본 코드 유형.
		/*
		int nonce = 0;
		
		// 000000 이 될떄까지 Hash값을 찾는다.
		while ( true ) {
			if ( Util.getHash( nonce + "").substring( 0 , 6).equals( "000000" ) ) {	
				System.out.println( "정답  : " + nonce );	// 정답 만큼 계산을 했다라는 뜻.
				break;
			}
			++nonce;
		}
		*/
		
		Block block = new Block( 1, null, 0, "데이터");					//1번째 블록
		block.mine();
		block.getInformation();
		
		Block block1 = new Block( 2, block.getBlockHash(), 0, "데이터");	//2번째 블록
		block1.mine();
		block1.getInformation();
		
		Block block2 = new Block( 3, block1.getBlockHash(), 0, "데이터");
		block2.mine();
		block2.getInformation();
		
		Block block3 = new Block( 4, block2.getBlockHash(), 0, "데이터");
		block3.mine();
		block3.getInformation();
		
		Block block4 = new Block( 5, block3.getBlockHash(), 0, "데이터");
		block4.mine();
		block4.getInformation();
	}
	
}
