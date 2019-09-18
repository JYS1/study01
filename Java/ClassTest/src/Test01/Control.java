package Test01;

import java.util.*;

public class Control {
	private int count;
	public List<Entity> control = new ArrayList<>();

	
	public Entity getEntity(int index) {
		return control.get(index);
	}
	
	public void appendEntity (Entity entity) {
		control.add(entity);
		++count;
	}
	public  int rankcount (int rank) {
		int k = 1;
		Entity ranking1;
		Entity ranking2;
		for(int i = 0; i < control.size(); i++) {
			ranking1 = control.get(i);
			for(int j = 0; j < control.size(); j++) {
				ranking2 = control.get(j);
				while(ranking1.getAverage() >= ranking2.getAverage()) {
					k++;
				}
			}
		}
		return k;
	}
	public String toString() {
		StringBuffer str = new StringBuffer();
		
		for(Entity value : control ) {
			str.append( String.format("%-7s", value.getName()));
			str.append( String.format("%4d", value.getSubject1()));
			str.append( String.format("%4d", value.getSubject2()));
			str.append( String.format("%4d", value.getSubject3()));
			str.append( String.format("%5d", value.getTotal()));
			str.append( String.format("%8.2f ", value.getAverage()));
			str.append( String.format("%2d ", value.getRank()));
			str.append( String.format(" %-13s\n", value.getGrade()));
		}
		
		return str.toString();
	}
	
	
	
	
	
}




