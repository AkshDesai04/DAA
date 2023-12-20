class IttLinearSearch {
    static int loop = 0;
    public static void main(String[] args) {
        for(int i = 1;i < 10001;i++) {
            int[] arr = new int[i];
            arr[arr.length - 1] = 10;
            for(int j = 0;j < arr.length - 2;j++) {
                arr[j] = 1;
            }

            System.out.println(i + " " + linear_search(arr, 10));
            loop = 0;
        }
    }

    static int linear_search(int arr[], int search) {
        loop++; //Function Call
        loop++; //Condition Checking
        if (arr.length == 0) {
            return -1;
        }
        loop++; //Condition Checking
        loop++; //arr.length - 1
        if (arr[arr.length - 1] == search) {
            return arr.length - 1;
        }
        return linear_search(arr, search);
    }
}