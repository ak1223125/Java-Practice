import java.util.Scanner;
public class breakKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 1;
        while(true){
            if((n % 7 == 0) && (n % 5 == 0)){
                System.out.print(n+" ");
                break;
            }
            n++;
        }
    }
}
