package chap13.book.s130401;

public class Util {
	 public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		 boolean keyCompare = p1.getKey().equals(p2.getKey());
		 boolean valueCompare = p1.getValue().equals(p2.getValue());
		 return keyCompare && valueCompare;
	 }
}
