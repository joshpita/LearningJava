public class LeftRotate {
    // function to left rotate arr[] of size n by d
    static void leftRotate(int arr[], int d){
        if(d == 0)
            return;
        int n = arr.length;
        rvereseArray(arr,0,d-1);
        rvereseArray(arr,d,n-1);
        rvereseArray(arr,0,n-1);

    }
    // function to reverse arr[] from index start to end
    static void rvereseArray(int arr[], int start, int end){
        int temp;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end --;
        }

    }
    //function to print an array
    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args){
        int arr[] = { 1,2,3,4,5,6,7};
        int n = arr.length;
        int d = 1;

        // in case the rotating factor is
        // greater than array length

        d = d % n;
        leftRotate(arr,d);
        printArray(arr);

    }
}
