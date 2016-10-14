package StrCal;

import java.util.ArrayList;

public class StringCalculator {
	public static int add() {
		return 0;
	}
	public static int add(String x) throws Exception {
		if(x.isEmpty()) { return 0; }
		int sum = 0;
		ArrayList<Integer> negs = new ArrayList<Integer>();
		String negatives = "Negative numbers not allowed: ";
		if(x.contains(",")||x.contains("\n")) { 
			String[] ints = x.split("\\n|,");
			for(String num : ints) {
				int number = Integer.parseInt(num);
				if(number < 0) { negs.add(number); }
				if(number > 1000) { number = 0; }
				sum += number;
				}
			if(!negs.isEmpty()) {
				for(int neg : negs) {
					negatives.concat(neg + ",");
				}
				negatives = negatives.substring(0, negatives.length() -2);
				throw new Exception(negatives);
			}
			return sum;
		}
		int number = Integer.parseInt(x);
		if(number < 0) {
			throw new Exception(negatives + number);
		}
		if(number > 1000) { number = 0; }
		sum += number;
		return sum;
	}
}
