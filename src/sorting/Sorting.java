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
public class Sorting {
    
    //Print the array
    void printArray(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int bSarr[] = {75, 32, 56, 89, 12, 17, 3, 98, 76};
        int mSarr[] = {65, 89, 32, 567, 1, 19, 98, 43, 59, 87};
        int sSarr[] = {12, 76, 49, 50, 32, 87, 20};
        
        Sorting sort = new Sorting();
        //BubbleSort
        //Unsorted Array printed to screen
        System.out.println("Given Bubble Sort Array: ");
        sort.printArray(bSarr);
        long startTime = System.currentTimeMillis();
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(bSarr);
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("\nBubble Sorted Array: ");
        sort.printArray(bSarr);
        System.out.println("\nTime Taken: " + elapsedTime + "ms");
        
        //MergeSort
        System.out.println("\nGiven Merge Sort Array: ");
        sort.printArray(mSarr);
        startTime = System.currentTimeMillis();
        MergeSort ms = new MergeSort();
        ms.sort(mSarr);
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        System.out.println("\nMerge Sorted Array: ");
        sort.printArray(mSarr);
        System.out.println("\nTime Taken: " + elapsedTime + "ms");
        
        //Selection Sort
        System.out.println("\nGiven Selection Sort Array:");
        sort.printArray(sSarr);
        startTime = System.currentTimeMillis();
        SelectionSort ss = new SelectionSort();
        ss.sort(sSarr);
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        System.out.println("\nSelection Sorted Array: ");
        sort.printArray(sSarr);
        System.out.println("\nTime Taken: " + elapsedTime + "ms");
    }
    
}
