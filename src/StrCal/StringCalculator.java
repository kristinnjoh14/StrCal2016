package StrCal;

public class StringCalculator {
	public static int add() {
		return 0;
	}
	public static int add(String x) {
		if(x.isEmpty()) { return 0; }
		if(x.contains(",")) { return Integer.parseInt(x.substring(0, 1)) + Integer.parseInt(x.substring(2)); }
		return Integer.parseInt(x);
	}
}
