package s2b.tst.soma;

public class Sum {

	public static double sum(double d, double e) {
		if (d < 0){
			throw new IllegalArgumentException("Primeiro numero menor que zero");
			
		}
		if (e < 0){
			throw new IllegalArgumentException("Segundo numero menor que zero");
			
		}
		return d + e;
	}
}
