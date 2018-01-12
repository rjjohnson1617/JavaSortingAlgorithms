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
public class CountingSort {
    //Sorting technique based on keys between a specific range.
    //Works by counting the number of objects having distinct key values 
    //(kind of hashing) - O(n+k) where n is number of elements in array and k
    //is the range of input
    
    void sort(char arr[]){
        int n = arr.length;
        
        //The output character array that will have sorted arr
        char output[] = new char[n];
        
        //Create a count array to store count of individual characters
        //and initialize count array as 0
        int count[] = new int[256];
        for(int i=0; i<256; ++i)
            count[i] = 0;
        
        //store count of each character
        for(int i=0; i<n; ++i)
            ++count[arr[i]];
        
        //Change count[i] so that count[i] now contains actual position
        //of this character in output array
        for(int i=1; i<=255; ++i)
            count[i] += count[i-1];
        
        //Build the output character array
        for(int i=0; i<n; ++i){
            output[count[arr[i]]-1] = arr[i];
            --count[arr[i]];
        }
        
        //Copy the output array to arr, so that arr now contains sorted chars
        for(int i=0; i<n; ++i)
            arr[i] = output[i];
    }
}
