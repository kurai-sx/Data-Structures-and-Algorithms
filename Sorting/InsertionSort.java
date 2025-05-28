public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {57, 2, 84, 10, 94, 23};
        int n = arr.length;

        for(int i=1; i<n; i++){
            
            int temp = arr[i];
            int j = i-1;

            while( j >= 0 && arr[j] > temp){

                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
            for( int num : arr){
                System.out.print(num + " ");
            }
        }
    }
}
