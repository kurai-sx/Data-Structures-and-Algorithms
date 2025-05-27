public class BubbleSort{
    public static void main(String[] args) {

        int[] arr = {20,3,40,54,89,23,13,1,4,99,33};

        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j< arr.length;j++){

                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }System.out.print(arr[i] + " ");
        }
    }
}