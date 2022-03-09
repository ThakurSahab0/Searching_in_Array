import java.util.Scanner;
public class Linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :- ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of array :- ");
        for (int i = 0  ; i <n ;i ++)
            arr[i]= sc.nextInt();
        System.out.println(" Enter element to search ");
        int element = sc.nextInt();
        Search(arr,element);
    }
    public static void Search(int[] inputArray, int value){
        int i =0, count = 0;
        for (i =0; i < inputArray.length;i++ ){
            if(inputArray[i]== value ) {
                System.out.println("Element is at index " + i);
                count++;
            }
        }
        if ( count == 0)
            System.out.println("Element is not in array");
        else
            System.out.println("Element is found "+count +"times");
    }
}
