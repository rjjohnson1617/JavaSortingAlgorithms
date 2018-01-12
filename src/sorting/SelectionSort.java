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
public class SelectionSort {
    
    //Sorts an array by repeatedly finding the minimum element (considering
    //ascending order) from usorted part and putting it at beginning - O(n^2)
    
    void sort(int arr[]){
        int n = arr.length;
        
        //One by one move boundary of unsorted subarray
        for(int i = 0; i < n-1; i++){
            //Find the minimum element in unsorted array
            int min_element = i;
            for(int j = i+1; j < n; j++)
                if(arr[j] < arr[min_element])
                    min_element = j;
            
            //Swap the found minimum element with the first element
            int temp = arr[min_element];
            arr[min_element] = arr[i];
            arr[i] = temp;
        }
    }
}
