//MergeSort is a D&C algorithm where we will divide the array into two halves and sort them individually and then merge them.

import java.util.Vector;
//Here we merge two sorted arrays into one sorted array.
public class MergeSort
{
    void merge(Vector<Integer> arr, int start, int mid, int end){
        
        Vector<Integer> temp = new Vector<>();
        int i = start;
        int j = mid+1;
        
        while(i<=mid && j <= end){
            if(arr.get(i) <= arr.get(j)){
                temp.add(arr.get(i));
                i++;
            }
            else{
                temp.add(arr.get(j));
                j++;
            }
        } 
        while(i<=mid){
            temp.add(arr.get(i));
            i++;
        }
        while(j<=end){
            temp.add(arr.get(j));
            j++;
        }
        for(int idx=0; idx< temp.size(); idx++){
            arr.set(start + idx, temp.get(idx));
        }
    }

    //here we divide the array into two halves and sort them individually.
    void mergeSort(Vector<Integer> arr, int start, int end){
        if(start < end){
	        int mid = start + (end - start)/2; //for integer overflow
	        mergeSort(arr, start, mid);
	        mergeSort(arr, mid+1, end);
	        merge(arr, start, mid, end);
	    }
	}
	public static void main(String[] args) {

        int [] arr = {10,32,43,12,65,23,87,2};
        Vector<Integer> vector = new Vector<>();
	    
	    for(int num: arr){
            vector.add(num);
	    }
        MergeSort sorter = new MergeSort();
        sorter.mergeSort(vector, 0, vector.size() - 1);	    
	    
        for(int num: vector){
	        System.out.print(num + " ");
	    }
	}
}