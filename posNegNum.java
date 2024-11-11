import java.util.Scanner;

public class posNegNum {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter the number: ");
        n = sc.nextInt();

        if(n>0){
            System.out.println(n + " is a positive number!");
        }
        else if (n<0) {
            System.out.println(n + " is a negative number!");
        }
        else{
            System.out.println(n + " is 0");
        }
    }
}
