
class ArrayMax{
    int [] arr = {1,5,8,9,44,5,3,2};
    int max = 0;
    int arrmax(){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
public class FindMax {
    public static void main(String[] args) {
        ArrayMax obj = new ArrayMax();
        int max;
        max = obj.arrmax();
        System.out.println("Largest number in Array : " +max);
    }
}
