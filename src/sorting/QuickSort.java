/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author rjjohnson
 */
public class QuickSort {
    //Like Merge Sort, QuickSort is a Divide and Conquer algorithm.
    //It picks an element as pivot and partitions the given array around the 
    //chosen pivot - Avg = O(nlogn); Worst = O(n^2)
    
    //Function takes last element as pivot, places pivot in correct position
    //in sorted array, and places all smaller to left of pivot and all greater
    //to right of pivot
    int partition(int arr[], int low, int high){
        int pivot = arr[high];
        //index of smaller element
        int i = (low -1);
        for(int j=low; j<high; j++){
            //If current element is smaller than or equal to pivot
            if(arr[j] <= pivot){
                i++;
                //swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        //swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        
        return i+1;
    }
    
    //main function that implements QuickSort()
    //arr[] -> array to be sorted
    //low -> starting index
    //high -> ending index
    void sort(int arr[], int low, int high){
        if(low < high){
            //pi is partitioning index, arr[pi] is now at right place
            int pi = partition(arr, low, high);
            
            //recursively sort elements before and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
}
