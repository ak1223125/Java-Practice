import java.util.Scanner;
class ArrayExample{
    Scanner sc = new Scanner(System.in);
    int [] arr = new int[5];
    int totalsum = 0;

    void sum(){
        System.out.println("Enter numbers :");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < 5; i++){
            totalsum = totalsum + arr[i];
        }
        System.out.print("Sum of total number is : "+totalsum);
    }
}

public class sumOfallArray{
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();

        obj.sum();
    }
}