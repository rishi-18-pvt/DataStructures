public class MaxMinArrays{
    public static void main(String[]args){
        int numbers[]={8,4,3,0,9,1,2,7};
        int max=numbers[0];
        int min=numbers[0];
        for(int num:numbers){
            if(num>max){
                max = num;
            }if(num<min){
                min = num;
            }
            

        }
        System.out.println("minimum number"+min);
        System.out.println("maximum number"+max);

    }
}