import java.util.Scanner;

public class intsDivByFive {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        if(n%5 == 0){
            System.out.println("Divisible by 5");
        }
        else{
            System.out.println("Not divisible by 5");
        }
    }
}
