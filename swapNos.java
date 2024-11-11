import java.util.Scanner;

public class swapNos {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n1, n2;

        System.out.print("Enter number 1: ");
        n1 = sc.nextInt();

        System.out.print("Enter number 2: ");
        n2 = sc.nextInt();

        System.out.println("n1 = " + n1 + "\nn2 = " + n2);

        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("After swapping: ");
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
    }
}
