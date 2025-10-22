public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int sumOfDigits(int x){
		int sum = 0;
		x = Math.abs(x);
		while(x > 0){
			sum = sum + x % 10;
			x = x / 10;
		}
		return sum;
	}

	public static int factorial(int inputNum) {
		if (inputNum == 0) return 1;
		if (inputNum < 0) return 0;
		return inputNum * factorial(inputNum - 1);
	}

}
