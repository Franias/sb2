package s2b.tst.soma;

public class Sum {

	public static double sum(double d, double e) {
		if (d < 0){
			throw new IllegalArgumentException();
			
		}
		if (e < 0){
			throw new IllegalArgumentException();
			
		}
		return d + e;
	}
}
