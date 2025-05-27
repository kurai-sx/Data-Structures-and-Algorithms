public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 32,43,23,1,3};

        for (int i = 0; i<arr.length; i++){
            int min_index = i;
            for(int j=i+1; j< arr.length; j++){

                if(arr[min_index] > arr[j]){
                    min_index = j;
                }
            }
            if(min_index != i){
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;

            }System.out.print(arr[i] + " ");
        }
    }
}
