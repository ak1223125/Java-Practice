import java.util.Scanner;
public class dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");

        int n = sc.nextInt();
        int i = 1;
        do{
            System.out.print(i+" ");
            i++;
        }while(i <= n);
    }
}
