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
        int iSarr[] = {93, 45, 67, 32, 90, 3, 17, 29};
        int hSarr[] = {12, 54, 76, 43, 89, 12, 10, 9};
        int qSarr[] = {45, 76, 43, 12, 19, 78, 90, 104};
        int rSarr[] = {98, 65, 49, 76, 12, 37, 48, 145, 27};
        char cSarr[] = {'f', 'y', 's', 'p', 'a', 'b', 'n', 'l'};
        
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
        
        //Insertion Sort
        System.out.println("\nGiven Insertion Sort Array:");
        sort.printArray(iSarr);
        startTime = System.currentTimeMillis();
        InsertionSort is = new InsertionSort();
        is.sort(iSarr);
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        System.out.println("\nInsertion Sorted Array:");
        sort.printArray(iSarr);
        System.out.println("\nTime Taken: " + elapsedTime + "ms");
        
        //Heap Sort
        System.out.println("\nGiven Heap Sort Array:");
        sort.printArray(hSarr);
        startTime = System.currentTimeMillis();
        HeapSort hs = new HeapSort();
        hs.sort(hSarr);
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        System.out.println("\nHeap Sorted Array:");
        sort.printArray(hSarr);
        System.out.println("\nTime Taken: " + elapsedTime + "ms");
        
        //Quick Sort
        System.out.println("\nGiven Quick Sort Array:");
        sort.printArray(qSarr);
        int n = qSarr.length;
        startTime = System.currentTimeMillis();
        QuickSort qs = new QuickSort();
        qs.sort(qSarr, 0, n-1);
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        System.out.println("\nQuick Sorted Array:");
        sort.printArray(qSarr);
        System.out.println("\nTime Taken: " + elapsedTime + "ms");
        
        //Radix Sort
        System.out.println("\nGiven Radix Sort Array:");
        sort.printArray(rSarr);
        n = rSarr.length;
        startTime = System.currentTimeMillis();
        RadixSort rs = new RadixSort();
        rs.radixsort(rSarr);
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        System.out.println("\nRadix Sorted Array:");
        sort.printArray(rSarr);
        System.out.println("\nTime Taken: " + elapsedTime + "ms");
        
        //Counting Sort
        System.out.println("\nGiven Counting Sort Array:");
        for(int i=0; i<cSarr.length; ++i)
            System.out.print(cSarr[i] + ", ");
        startTime = System.currentTimeMillis();
        CountingSort cs = new CountingSort();
        cs.sort(cSarr);
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        System.out.println("\nCounting Sorted Array:");
        for(int j=0; j<cSarr.length; ++j)
            System.out.print(cSarr[j] + ", ");
        System.out.println("\nTime Taken: " + elapsedTime + "ms");
    }
    
}
