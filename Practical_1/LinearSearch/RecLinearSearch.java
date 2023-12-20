class RecLinearSearch {
    static int loop = 0;

    public static void main(String[] args) {
        for(int i = 1;i < 10001;i++) {
            int[] arr = new int[i];
            arr[arr.length - 1] = 10;
            for(int j = 0;j < arr.length - 2;j++) {
                arr[j] = 1;
            }

            linearsearch(arr, i, 10);

            System.out.println(i + " " + loop);
            System.out.println("found at index: " + linearsearch(arr, i, 10));
            loop = 0;
        }
    }

    static int linearsearch(int arr[], int size, int key) {
        // System.out.println("Loop: " + loop + "\t");
        loop++; //Function call
        loop++; //condition checking
        if(size == 0) {
            loop++; //Return statment
            return -1;
        }
        loop++; //condition checking
        loop++; //size - 1
        if (arr[size - 1] == key) {
            loop++; //size - 1
            loop++; //return
            return size - 1;
        }
            loop++; //size - 1
            loop++; //return
        return linearsearch(arr, size - 1, key);
    }
}