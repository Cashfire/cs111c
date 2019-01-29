package m2Generic;

import java.util.ArrayList;

public class Box<T> {
	
	private T thing;
	private int thingCount;
	private ArrayList<T> boxHistory;
	
	public Box(T firstThing) {
		this.thing = firstThing;
		this.thingCount = 1;
		boxHistory.add(firstThing);
	}
	
	public T getContents() {
		return thing;
	}
	public int getCount() {
		return thingCount;
	}
	
	public ArrayList<T> getBoxHistory() {
		return boxHistory;
	}

	public void replaceContents(T newThing) {
		this.thing = newThing;
		boxHistory.add(newThing);
		thingCount++;
	}
	
	public boolean hasDuplicates(){
		for(int i = 0; i < boxHistory.size() -1 ; i++){
			for(int j = i+1; j< boxHistory.size(); j++){
				if(boxHistory.get(i).equals(boxHistory.get(j))){
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return thing.toString() + " (item " + thingCount + ")";
	}
	
	@Override
	public boolean equals(Object other) {
		if(other instanceof Box<?>) {
			Box<?> otherBoxR = (Box<?>) other;
			
			boolean sameThing = this.thing.equals(otherBoxR.thing);
			boolean sameCount = this.thingCount==otherBoxR.thingCount;
			boolean sameHistory = this.boxHistory.equals(((Box) other).getBoxHistory());
			return sameThing && sameCount && sameHistory;
			
		} else {
			return false;
		}
	}

}
