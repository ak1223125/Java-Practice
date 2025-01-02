import java.util.Scanner;
public class countDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number(n should not be equal to 0) :");
        int n = sc.nextInt();

        int count = 0;
        while(n != 0){
            n /= 10;
            count++;
        } 
        System.out.println("total digit of a number is "+count);
    }
}
