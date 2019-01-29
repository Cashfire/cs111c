package m2Generic;


public class PairTester {

	public static void main(String[] args) {
		Pair<Integer> numberPair = new Pair<Integer>(5,7);
		Pair<String> wordPair = new Pair<String>("hello", "goodbye");
		Quad<Integer, String> quad1 = new Quad(numberPair, wordPair);
		
		
		// testing our sameItems method
//		String s1 = new String("apple");
//		String s2 = new String("apple");
//		Pair<String> wordPair2 = new Pair<String>(s1, s2);
//		System.out.println("wordPair2 contains the same items? " + wordPair2.sameItems());
		Pair<Integer> numberPair2 = new Pair<Integer>(7,5);
		Pair<String> wordPair2 = new Pair<String>( "Goodbye", "hello");
		Quad<String, Integer> quad2 = new Quad("goodbye", "hello",7,5);
		System.out.println(quad1.equals(quad2));
//		PairDifferent<Integer,String> numberWordPair = new PairDifferent<Integer,String>(2, "hello");
//		PairDifferent<Integer,Integer> doubleNumberPair = new PairDifferent<Integer,Integer>(1,1);

	}


}
