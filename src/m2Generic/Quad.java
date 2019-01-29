package m2Generic;

public class Quad <T, U>{
	private Pair<T> pair1;
	private Pair<U> pair2;
	
	public Quad(T t1, T t2, U u1, U u2) {
		this.pair1 = new Pair<T>(t1, t2);
		this.pair2 = new Pair<U>(u1, u2);;
	}

	public Quad(Pair<T> p1, Pair<U> p2){
		this.pair1 = p1;
		this.pair2 = p2;
	}
	
	public Pair getPair1() {
		return pair1;
	}

	public void setPair1(Pair pair1) {
		this.pair1 = pair1;
	}

	public Pair getPair2() {
		return pair2;
	}

	public void setPair2(Pair pair2) {
		this.pair2 = pair2;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) { return true; }
		if(o instanceof Quad<?, ?>){
			Quad<?, ?> other = (Quad<?,?>) o;
			boolean matchPossible1 = pair1.equals(other.getPair1()) && pair2.equals(other.getPair2());
			boolean mathcPossible2 = pair1.equals(other.getPair2()) && pair2.equals(other.getPair1());
			return matchPossible1 || mathcPossible2;
		}
		return false;
	}
	
}
