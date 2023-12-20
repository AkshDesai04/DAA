class IttFact {
	public static void main(String[] args) {
		int num = 10;
		int loop = 0;

		int fact = 1;
		loop++; //Init of fact
		loop++; //Init of i
		for(int i = 1;i <= num;i++) {
			fact *= i;
			loop++; //Math operation
			loop++; //Condition checking
			loop++; //Increment
		}
		loop++; //Compensating for last condition check

		System.out.println("Fact = " + fact);
		System.out.println("Number of loops used: " + loop);
	}
}