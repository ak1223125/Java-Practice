import java.util.Scanner;

public class continueKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int n = 1; n <= 50; n++){
            if(n % 3 == 0){
                continue;
            }
            System.out.print(n+" ");
        }
    }
}