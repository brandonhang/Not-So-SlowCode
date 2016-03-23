public class Chirp {
	
	public static boolean isChirpy(int n) {
		
		int l, m;
		
		if (n > 0) {
			l = n;
			m = n * 2;
			n *= 3;
		}
		else {
			l = 0;
			m = n;
		}
		
		if ((l + m + n) % 7 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isNirpy(int n) {
		
		if (n < 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public static int schnirpyLevel(int n) {
		
		if (n < 0) {
			n++;
		}
		long num = (long)Integer.MAX_VALUE - n;
		return (int)(((num + (n % 2)) / 2 + (1 - (n % 2))) % 10);
	}
}
