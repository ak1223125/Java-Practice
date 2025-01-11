import java.util.Scanner;

public class methodsInJava {

    static int sum(int a, int b){
        int totalsum = a + b;
        return totalsum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x; 
        int y;
        System.out.print("Enter a first number : ");
        x = sc.nextInt();
        System.out.print("Enter a second number : ");
        y = sc.nextInt();


        System.out.print("Total sum of two numbers is : "+x+" + "+y+" = " + sum(x,y));

    }
}
