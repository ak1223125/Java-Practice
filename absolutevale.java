import java.util.Scanner;
public class absolutevale {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any Integer :");
    int n = sc.nextInt();
    
    if(n < 0){
        n*=-1;
        System.out.println("absolute value is :");
        System.out.println(n);
    }
    else{
        System.out.println("absolute value is :");
        System.out.println(n);
    }

    }
}
