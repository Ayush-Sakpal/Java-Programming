import java.util.Scanner;

public class evenOdd {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter the number: ");
        n = sc.nextInt();

        if(n%2 == 0){
            System.out.println(n + " is an Even Number");
        }
        else{
            System.out.println(n + " is an Odd number");
        }
    }
}
