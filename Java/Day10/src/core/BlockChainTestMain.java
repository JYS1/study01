package core;

import Util.Util;

public class BlockChainTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( Util.getHash( "1" ) );
		//6b86b273ff34fce19d6b804eff5a3f5747ada4eaa22f1d49c01e52ddb7875b4b ������ 2�� ���� �ؾ��� = ��ŷ�� ����.
		// ä���� �⺻ �ڵ� ����.
		/*
		int nonce = 0;
		
		// 000000 �� �ɋ����� Hash���� ã�´�.
		while ( true ) {
			if ( Util.getHash( nonce + "").substring( 0 , 6).equals( "000000" ) ) {	
				System.out.println( "����  : " + nonce );	// ���� ��ŭ ����� �ߴٶ�� ��.
				break;
			}
			++nonce;
		}
		*/
		
		Block block = new Block( 1, null, 0, "������");					//1��° ���
		block.mine();
		block.getInformation();
		
		Block block1 = new Block( 2, block.getBlockHash(), 0, "������");	//2��° ���
		block1.mine();
		block1.getInformation();
		
		Block block2 = new Block( 3, block1.getBlockHash(), 0, "������");
		block2.mine();
		block2.getInformation();
		
		Block block3 = new Block( 4, block2.getBlockHash(), 0, "������");
		block3.mine();
		block3.getInformation();
		
		Block block4 = new Block( 5, block3.getBlockHash(), 0, "������");
		block4.mine();
		block4.getInformation();
	}
	
}
