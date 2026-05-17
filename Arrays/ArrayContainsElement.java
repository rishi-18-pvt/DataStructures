public class ArrayContainsElement {
    public static void main(String[] args) {
        int numbers[]={10,9,7,4,3,9};
        boolean contains = false;
        int target = 0;
        for(int num:numbers){
            if(num == target){
                contains = true;
                break;
            }
        }
        if(contains){
            System.out.println("Array contains Element " + target);
        }else{
            System.out.println("Array does-not contains Element " + target);
        }
        
    }
}
