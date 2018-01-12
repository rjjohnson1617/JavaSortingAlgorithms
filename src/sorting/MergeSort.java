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
public class MergeSort {
    
    //MergeSort - Divide and Conquer algorithm
    //Divides input array in two halves, calls itself for the two halves
    //and then merges the two sorted halves - O(nLogn)
    
    private int[] numbers;
    private int[] helper;
    
    private int number;
    
    public void sort(int[] values){
        this.numbers = values;
        number = values.length;
        this.helper = new int[number];
        mergeSort(0, number - 1);
    }
    
    private void mergeSort(int low, int high){
        //check if low is smaller than high, if not then array is sorted
        if(low < high){
            //Get index of middle element
            int middle = low + (high - low) / 2;
            //Sort left side of array
            mergeSort(low, middle);
            //Sort right side of array
            mergeSort(middle + 1, high);
            //Combine the arrays
            merge(low, middle, high);
        }
    }
    
    private void merge(int low, int middle, int high){
        //Copy both parts into helper array
        for(int i = low; i <= high; i++)
            helper[i] = numbers[i];
        
        int i = low;
        int j = middle + 1;
        int k = low;
        
        //Copy smallest values from eith the left or right side back to original
        while(i <= middle && j <= high){
            if(helper[i] <= helper[j]){
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }
        
        //Copy the rest of the left side of the array into the target array
        while(i <= middle){
            numbers[k] = helper[i];
            k++;
            i++;
        }
        
        //Since we are sorting in-place, any leftover elements from the right side
        //are already at the right position
    }
}
