package numbers;

public class Number {

	private int number;
	private String words;
	// private int[] ones = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
	// private int[] tens = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90};
	// private int[] hundreds = {0, 100, 200, 300, 400, 500, 600, 700, 800, 900};
	
	private String[] onesWord = { 
		"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
		"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
		"seventeen", "eighteen", "nineteen"};
	private String[] tensWord = {
		"", "ten", "twenty", "thirty", "forty", "fifty", 
		"sixty","seventy", "eighty", "ninety"};
		
	public Number(int number) {
		this.number = number;
		setWords();
	}

	public int getNumber() {
		return number;
	}

	public String getWords() {
		return words;
	}

//	public void setNumber(int number) {
//		this.number = number;
//	}

	private void setWords() {
		String words = "";
		
		if (number == 0) {
			words = "zero";
		} else if (number == 1000000) {
			words = "one million";
		} else if (number < 0) {
//			words = "negative " + new Number(number * -1).getWords();
			words = "negative number";
		} else if (number > 1000000) {
			words = "more than one million";
		} else if (number < 1000) {
//			System.out.println(number + " is less than 1000");
			words = under1000(number);
		} else {
//			System.out.println(number + " is less than 1 million");
			int thousands = number / 1000;
			int remainder = number % 1000;
//			System.out.println(thousands + " AND " + remainder);
//			System.out.println(under1000(thousands));
//			System.out.println(under1000(remainder));
			words = under1000(thousands) + " thousand " + under1000(remainder);
		}
		
		this.words = words;
	}
	
	private String under20(int n) {
//		if (n == 0) {
//			return "zero";
//		}
		return (n < 20) ? onesWord[n] : "";
	}
	
	private String under100(int n) {
//		System.out.println("What is the number? " + n);
		int ten = n / 10;
		int one = n % 10;
//		System.out.println(ten + " and " + one);
//		System.out.println(onesWord[one]);
		String dash = (one == 0) ? "" : "-";
//		System.out.println(tensWord[ten]);
//		System.out.println(onesWord[one]);
		return tensWord[ten] + dash + onesWord[one];
	}
	
	private String under1000(int n) {
		int num;
		String hw, rest;
		
		if (n < 20) {
//			System.out.println(n + " is less than 20");
			return under20(n);
		}
		
		if (n < 100) {
//			System.out.println(n + " is less than 100");
			return under100(n);
		}
		
		int hundred = n / 100;
		hw = onesWord[hundred] + " hundred ";
		num = n % 100;
		
		if (num < 20) {
			rest = onesWord[num];

		} else {
			int ten = num / 10;
			int one = num % 10;
			String dash = (one == 0) ? "" : "-";
			rest = tensWord[ten] + dash + onesWord[one];

//			rest = tensWord[ten] + "-" + onesWord[one];
		}
		
		return hw + rest;			
	}
	
	
	

	@Override
	public String toString() {
		String str = "";
		str += String.format("Number: %,d %n", number);
		str += String.format(" Words: %s %n", words);
		return str;
	}
	
	
}
