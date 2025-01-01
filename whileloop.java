import java.util.Scanner;
public class whileloop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number for itrative statement :");
        
        int n = sc.nextInt();
        while(n > 0){
            System.out.println("hello");
            n--;
        }
    }
}
