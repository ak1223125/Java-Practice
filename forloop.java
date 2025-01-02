import java.util.Scanner;
public class forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a numbers : ");

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print(i+" ");
        }
    }
}
