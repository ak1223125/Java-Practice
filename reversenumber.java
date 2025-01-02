import java.util.Scanner;
public class reversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int n = sc.nextInt();

        for(int i = n; i > 0; i--){
            System.out.print(i+" ");
        }
    }
}
