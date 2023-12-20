public class RecFibbo {
    static int loop = 0;
    public static void main(String[] args) {
        for(int i = 1;i <= 10001;i++) {
            fibo(i);
            System.out.println(i + " " + loop);
            loop = 0;
        }
    }

    static int fibo(int n) {
        loop++; //init i
        for (int i = 0; i < n; i++) {
            loop++; //condition checking
            loop++; //increment of i
            fibonacci(i);
        }
        loop++; //Conponsating for last condition check
        return loop;
    }

    public static long fibonacci(int n) {
        loop++; //function call

        loop++; //condition check
        if (n <= 1) {
            loop++; //return
            return n;
        } else {
            loop++; //n-1
            loop++; //n-2
            loop++; //addition
            loop++; //return
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
