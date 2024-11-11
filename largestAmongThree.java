import java.util.Scanner;

public class largestAmongThree {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n1, n2, n3;

        System.out.print("Enter the first number: ");
        n1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        n2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        n3 = sc.nextInt();

        int max = n1;

        if((n2 >= n1 && n1 > n3) || (n2 >= n3 && n3 > n1)){
            max= n2;
        }
        else if((n3 >= n1 && n1 > n2) || (n3 >= n2 && n2 > n1)){
            max = n3;
        }

        System.out.println("Maximum  = " + max);
    }
}
