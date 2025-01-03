import java.util.Scanner;
public class duplicatenumber {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);

        int duplicate = 0;
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    duplicate = arr[j];
                }
            }
        }
        System.out.println(duplicate);
    }
}
