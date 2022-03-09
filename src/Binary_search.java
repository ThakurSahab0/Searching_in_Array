public class Binary_search {

    public static void main(String[] args) {
        int[] intArray = { -22, -15, 1, 7, 20, 35, 55 };

        iterativeBinarySearch(intArray, 8888);
        iterativeBinarySearch(intArray, -15);
        iterativeBinarySearch(intArray, 35);
        iterativeBinarySearch(intArray, 1);

        recursiveBinarySearch(intArray, -15);
        recursiveBinarySearch(intArray, 35);
        recursiveBinarySearch(intArray, 8888);
        recursiveBinarySearch(intArray, 1);

    }
    // Using iterative approach
    public static void iterativeBinarySearch(int[] input, int value) {
        int start = 0;
        int end = input.length;
        int count=0;
        while (start < end) {
            int mid = (start + end) / 2;
            if (input[mid] == value) {
                System.out.println("Element is at index " + mid);
                count++;
                return;
            }
            else if (input[mid] < value)
                start = mid + 1;
            else
                end = mid;
        }
        if (count==0)
            System.out.println("Element not found in array");
    }
    // Using recursion
    public static int recursiveBinarySearch(int[] input, int value) {
        return recursiveBinarySearch(input, 0, input.length, value);
    }

    public static int recursiveBinarySearch(int[] input, int start, int end, int value) {
        if (start >= end) {
            System.out.println("Element not found in array");
            return -1;
        }
        int mid = (start + end) / 2;
        if (input[mid] == value) {
            System.out.println("Element is at index " + mid);
            return 0;
        }
        else if (input[mid] < value) {
            return recursiveBinarySearch(input, mid + 1, end, value);
        }
        else {
            return recursiveBinarySearch(input, start, mid, value);
        }
    }
}
