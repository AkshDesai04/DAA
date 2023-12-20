class IttFibo {
    static int loop = 0;
    public static void main(String[] args) {
        for(int i = 1;i < 10001;i++) {
            printFibonacci(i);
            System.out.println(i + " " + loop);
            loop = 0;
        }
    }

    public static void printFibonacci(int n) {
        loop++; //for condition
        if (n <= 0) {
            return;
        }

        loop++; //init a
        loop++; //init b
        long a = 0, b = 1;

        loop++; //init i
        for (int i = 0; i < n; i++) {
            loop++; //condition checking
            loop++; //increment of i

            loop++; //declaration of temp
            loop++; //a + b
            long temp = a + b;

            loop++; //a = b;
            a = b;
            loop++; //b = temp;
            b = temp;
        }
        loop++; //conponsation for last condition check of loop
    }
}
