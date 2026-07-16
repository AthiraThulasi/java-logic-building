package Practice;

public class largestInArray {
    public static void main(String[] args){
        int [] arr = { 10,20,30,40 };
        int largest = arr[0];
        for(int i=1;i<=arr.length-1;i++){
            if(arr[i] < largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
