package Test01;

import java.util.*;

public class InfoControl {
	private List<Info> infos;
	
	public InfoControl() {
		infos = new ArrayList<>();
	}

	public void appendInfo(String name, String subject, int number) {
		// TODO Auto-generated method stub
		infos.add(new Info(name,subject,number));
	}
	public int searchInfo ( String name ) {
		int index = -1;
		
		for( int i = 0; i < infos.size(); i++) {
			index = i;
			break;
		}
		
		return index;
	}
}
