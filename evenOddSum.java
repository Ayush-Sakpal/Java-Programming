import java.util.Scanner;

public class evenOddSum {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter number of elements in the array: ");
        n = sc.nextInt();

        int even_sum = 0, odd_sum = 0;

        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<n; i++){
            if(arr[i]%2 == 0){
                even_sum += arr[i];
            }
            else{
                odd_sum += arr[i];
            }
        }

        System.out.println("Sum of odd numbers  = " + odd_sum);
        System.out.println("Sum of even numbers = " + even_sum);
    }
}
