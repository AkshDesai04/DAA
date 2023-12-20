class RecFact {
	static int loop = 0;
	public static void main(String[] args) {
		for(int i = 1;i < 10001;i++) {
			System.out.println(i + "  " + loop_test(i));
			loop = 0;
		}
	}
	public static int loop_test(int num) {
		int fact = factorial(num);
		loop++;// for fact init;

		return loop;
	}

	public static int factorial (int n) {
		loop++;//for function being called
		loop++; //for condition checking
		if (n == 0) {
			loop++; //for return statment
			return 1;
		}
		loop++; //for return statment
		loop++; //for function call
		loop++; //for math opeartion
		return n * factorial(n - 1);
	}
}