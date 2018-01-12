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
public class BubbleSort {
    
    //Bubble Sort - Repeatedly swapping the adjacent elements if they are in
    //the wrong order - O(n^2)even if sorted
    
    void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n-1; i++)
            for(int j = 0; j < n-i-1; j++)
                if(arr[j] > arr[j+1]){
                    //swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}
