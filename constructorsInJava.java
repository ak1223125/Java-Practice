import java.util.Scanner;
class Operation{
    int c,d;
    Operation(int a, int b){
        System.out.println("constructor are calling itselt.");
        c = a;
        d = b; 
    }

    int add(){
        System.out.print("addition : ");
        return c + d;
    }
    int sub(){
        System.out.print("subtration : ");
        return c - d;
    }
    int mul(){
        System.out.print("multiplication : ");
        return c * d;
    }
    double div(){
        System.out.print("division : ");
        return c / d;
    }
}

public class constructorsInJava {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");

        int x = sc.nextInt(),y = sc.nextInt();
        Operation op1 = new Operation(x,y);

        System.out.println(op1.add());
        System.out.println(op1.sub());
        System.out.println(op1.mul());
        System.out.println(op1.div());

    } 
}
