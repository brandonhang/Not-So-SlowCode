public class Other {
	
	public static void threatLevel(int val) {
		
		String threatLvl = "Midnight";
		int value = Math.abs(val);
		int threatCounter = -1;
		int charsPrinted = 0;
		int stringCounter = 0;
		
	threatAssessment:
		while (charsPrinted != value) {
			if (stringCounter % 8 == 0) {
				if (threatCounter > 0) {
					for (int i = 0; i < threatCounter; i++) {
						System.out.print(2);
						charsPrinted++;
						if (charsPrinted == value) {
							break threatAssessment;
						}
					}
				}
				threatCounter++;
			}
			System.out.print(threatLvl.charAt(stringCounter % 8));
			charsPrinted++;
			stringCounter++;
		}
		System.out.println();
	}
	
	public static long defcon(long val) {
		if (val >= 2000) {
			return 2001000;
		}
		else if (val <= 0) {
			return val;
		}
		else {
			long sum = 0;
			for (int i = 0; i <= val; i++) {
				sum += i;
			}
			return sum;
		}
	}
}
