import java.util.*;
public class binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int arr_size = sc.nextInt();
        System.out.println("enter your array :");
        int arr [] = new int [arr_size]; // array liya hai jo hum array lenge
        for(int i = 0; i< arr_size; i++){
            arr [i] = sc.nextInt(); // user se hum isme i ki values denge
        }
        System.out.println("enter your no. that you want to find:");
        int target = sc.nextInt();
        int arr_start = 0;
        int arr_end = arr_size-1;
        while (arr_start<=arr_end){
            int mid= (arr_start+arr_end)/2;
            if (arr[mid] == target){
                System.out.println(" your target at  index no.: "+mid);
                System.out.println("your target value is  :"+arr[mid]);
                break;
            }
            else if(arr[mid]<target){
                arr_start= mid+1;
            }
            else{
                arr_end= mid-1;
            }
        }
    }
}
