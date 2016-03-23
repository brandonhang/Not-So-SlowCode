public class SlowCode {
	
	public static void main(String[] args) {
		System.out.println("Loading...DONE!");
		
		if (args.length != 1) {
			System.out.println("Just one argument, buddy!");
			System.exit(1);
		}
		
		int val = Integer.parseInt(args[0]) - 1;
		
		System.out.println("=6(MUNXOYPQRSTUVWXYZA=6(B@;2CA=6(DCA=6(EFGIMUFGIMUGIMUHLSIMUJOYKRLSMUN"
				+ "XOYPQRSTUVWXYZA=6(B@;2CA=6(DCA=6(EFGIMUFGIMUGIMUHLSIMUJOYKRLSMUNXOYPQRSTUVWXYZA"
				+ "=6(B@;2CA=6(DCA=6(EFGIMUFGIMUGIMUHLSIMUJOYKRLSMUNXOYPQRSTUVWXYZA=6(B@;2CA=6(DCA"
				+ "=6(EFGIMUFGIMUGIMUHLSIMUJOYKRLSMUNXOYPQRSTUVWXYZA=6(B@;2CA=6(DCA=6(EFGIMUFGIMUG"
				+ "IMUHLSIMUJOYKRLSMUNXOYPQRSTUVWXYZA=6(B@;2CA=6(DCA=6(EFGIMUFGIMUGIMUHLSIMUJOYKRL"
				+ "SMUNXOYPQRSTUVWXYZA=6(B@;2CA=6(DCA=6(EFGIMUFGIMUGIMUHLSIMUJOYKRLSMUNXOYPQRSTUVW"
				+ "XYZA=6(B@;2CA=6(DCA=6(EFGIMUFGIMUGIMUHLSIMUJOYKRLSMUNXOYPQRSTUVWXYZA=6(B@;2CA=6"
				+ "(DCA=6(EFGIMUFGIMUGIMUHLSIMUJOYKRLSMUNXOYPQRSTUVWXYZA=6(B@;2CA=6(DCA=6(EFGIMUFG"
				+ "IMUGIMUHLSIMUJOYKRLSMUNXOYPQRSTUVWXYZA=6(B@;2CA=6(DCA=6(EFGIMUFGIMUGIMUHLSIMUJO"
				+ "YKRLSMUNXOYPQRSTUVWXYZA=6(B@;2CA=6(DCA=6(EFGIMUFGIMUGIMUHLSIMUJOYKRLSMUNXOYPQRS"
				+ "TUVWXYZA=6(B@;2CA=6(DCA=6(EFGIMUFGIMUGIMUHLSIMUJOYKRLSMUNXOYPQRSTUVWXYZA=6(B@;2"
				+ "CA=6(DCA=6(EFGIMUFGIMUGIMUHLSIMUJOYKRLSMUNXOYPQRSTUVWXYZA=6(B@;2CA=6(DCA=6(EFGI"
				+ "MUFGIMUGIMUHLSIMUJOYKRLSMUNXOYPQRSTUVWXYZA=6(B@;2CA=6(DCA=6(E");
		System.out.println("Statistics of value " + val + ":");
		System.out.println("Chirpy Number? " + Chirp.isChirpy(val));
		System.out.println("Nirpy Number? " + Chirp.isNirpy(val));
		System.out.println("Schnirpiness Level " + Chirp.schnirpyLevel(val));
		
		if (val >= 1454) {				// In order to retain "functionality", I had to write a print statement that mimics a bug found in the original
			System.out.printf("Exception in thread \"main\" java.lang.StringIndexOutOfBoundsException: "
					+ "String index out of range: %d\n"
					+ "\tat java.lang.String.substring(Unknown Source)\n"
					+ "\tat Other.threatLevel(Other.java:20)\n"
					+ "\tat SlowCode.main(SlowCode:64)\n", val);
			System.exit(1);
		}
		
		System.out.print("Threat Level: ");
		Other.threatLevel(val);
		System.out.println("DEFCON: " + Other.defcon(val));
	}
}
