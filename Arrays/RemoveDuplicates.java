import java.util.HashSet;

public class RemoveDuplicates {
   public static void main(String[] args) {
     int[] numbers ={1,2,4,6,7,7,8,8,9};

     removeDuplicates(numbers);
   }
   public static void removeDuplicates(int[]arr){
    HashSet <Integer> uniqueSet = new HashSet<Integer>();
    for(int num:arr){
        if(uniqueSet.add(num)){
            System.out.print(num+" ");
        }
    }
   }

}
