import java.util.Scanner;
public class sumofallintegers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int k = sc.nextInt();

        int totalsum = 0;
        int n = 1;
        while(n <= k){
            totalsum += n;
            n++;
        }
        System.out.println("total sum of numbers is : "+totalsum);

    }
}
