import java.util.Scanner;
public class weightConversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int choice;
        double weight;
        double convertedWeight;

        System.out.println("Weight conversion program :");
        System.out.println("1 : convert lbs to kgs .");
        System.out.println("2 : convert kgs to lbs .");

        System.out.println();
        System.out.println("choose an option :");
        choice = sc.nextInt();

        if(choice == 1){
            System.out.print("Enter the weight in lbs : ");
            weight = sc.nextDouble();
            convertedWeight = weight * 0.453592;
            System.out.print("The converted weight(in kgs) : " + convertedWeight);
        }
        else{
            System.out.print("Enter the weight in kgs : ");
            weight = sc.nextDouble();
            convertedWeight = weight / 0.453592;
            System.out.print("The converted weight(in lbs) : " + convertedWeight);
        }

        sc.close();
    } 
}
