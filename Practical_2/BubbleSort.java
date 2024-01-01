// Optimized java implementation of Bubble sort

import java.io.*;

class BubbleSort {
    static int opn = 0, compn = 0, swap = 0;

	public static void main(String args[]) {
		// int arr[] = {1, 2, 3, 4, 5};
		// int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		// int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		// int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
		// int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
		
		// int arr[] = {5, 4, 3, 2, 1};
		int n = arr.length;
		bubbleSort(arr, n);
		// System.out.println("Sorted array: ");
		// printArray(arr, n);
	}

	static void bubbleSort(int arr[], int n) {
		int i, j, temp;
		boolean swapped;
		opn++; //i = 0
		for (i = 0; i < n - 1; i++) {
			opn++;//i++
			// compn++;//i < n - 1
			swapped = false;
			opn++;//swapped = false
			opn++; //j = 0
			for (j = 0; j < n - i - 1; j++) {
				opn++; //j++
				// compn++;//j < n-i-1
				compn++;//if comditino below
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

					opn += 3;//3 statments of swap
					// System.out.println("Swapping and operating");
                    swap++;//swap happened above
					opn++; //swapped = true
					swapped = true;
				}
			}
			// compn++;//componsating for last 
			// compn++;//if conditino below
			if (swapped == false) {
				opn++;//break;
				break;
            }
		}
        System.out.println("Number of operations = " + opn);
        System.out.println("Number of comparitions = " + compn);
        System.out.println("Number of swaps = " + swap);
    }
}