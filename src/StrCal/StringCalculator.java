package StrCal;

public class StringCalculator {
	public static int add() {
		return 0;
	}
	public static int add(String x) {
		if(x.isEmpty()) { return 0; }
		if(x.contains(",")||x.contains("\n")) { 
			int sum = 0;
			String[] ints = x.split("\\n|,");
			for(String num : ints) {
				sum += Integer.parseInt(num);
			}
			return sum;
		}
		return Integer.parseInt(x);
	}
}
