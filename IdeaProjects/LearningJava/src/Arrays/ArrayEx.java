package Arrays;

public class ArrayEx {
    static int[] arr = {12,2,4,15};

    private static int sum(){
        int sum = 0;
        int i;
        for(i =0; i < arr.length;i++){
            sum+= arr[i];
        }
        return sum;
    }

    private static int leastNumber(){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i< arr.length;i++){
            if (smallest > arr[i]){
                smallest = arr[i];
            }
        }
        return smallest;
    }

    private static int largest(){
        int i;
        int max = arr[0];
        for(i=1; i <arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
            return max;
    }



    public static void main(String[] args) {
        System.out.println("Sum of given array is " + sum());
        System.out.println("Smallest number in array is: "+ leastNumber());
        System.out.println("Largest in given array is " + largest());
    }


}
