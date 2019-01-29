package m2Generic;

/**
 * represent a generic class for Module 2 studying
 * @author maoye
 *
 * @param <T>
 */

public class Trio<T> {
	private T item1, item2, item3;
	//two constructors
	public Trio(T item1, T item2, T item3){
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
	}
	public Trio(T item1) {
		this(item1, item1, item1);
	}
	//getters and setters for each item in the trio
	public T getItem1() {
		return item1;
	}
	public void setItem1(T item1) {
		this.item1 = item1;
	}
	public T getItem2() {
		return item2;
	}
	public void setItem2(T item2) {
		this.item2 = item2;
	}
	public T getItem3() {
		return item3;
	}
	public void setItem3(T item3) {
		this.item3 = item3;
	}
	
	@Override
	public String toString(){
		return item1.toString() + "\t"+item2.toString() + "\t"+item3.toString();
	}
	
	//a method called contains that returns a count of how many times an item is in the Trio
	public int contains(Object item) {
		int count = 0;
		if(item1.equals(item)){ count++; }
		if(item2.equals(item)){ count++; }
		if(item3.equals(item)){ count++; }
		return count;
	}
	
	//a method called hasDuplicates that returns true 
	//if the at least two items within the Trio are the same as each other.
	public boolean hasDuplicates() {
		return (item1.equals(item2)) || item1.equals(item3) || item2.equals(item3);	
	}
	
	@Override
	public boolean equals(Object o){
		if(this == o) { return true;}
		if(o instanceof Trio<?>){
			Trio<?> other = (Trio<?>) o;		
			return (this.contains(item1) == other.contains(item1)) 
					&& (this.contains(item2) == other.contains(item2))
					&& (this.contains(item3) == other.contains(item3)) ;		
		}
		return false;
	}
}
