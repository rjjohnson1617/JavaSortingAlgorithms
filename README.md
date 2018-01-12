# SortingAlgorithms
Descriptions of some sorting algorithms coded in Java.

## Bubble Sort
Bubble sort is a simple and well-known sorting algorithm that repeatedly steps through the list to be sorted, compares each pair of adjacent items, and swaps them if they are in the wrong order. It's main application is to make an introduction to the sorting algorithms.
Bubble sort belongs to O(n^2) sorting algorithms, which makes it quite inefficient for sorting large data volumes.
Bubble sort is stable and adaptive.
### Algorithm
1. Compare each pair of adjacent elements from the beginning of an array and, if they are in reversed order, swap them.
2. If at least one swap has been done, repeat step 1.

You can imagine that on every step, big bubbles float to the surface and stay there. At the step when no bubble moves, sorting stops.

### Complexity Analysis
Average and worst case complexity of bubble sort is O(n^2), where n is the number of items being sorted. Bubble sort is not a practical sorting algorithm when n is large. 
Bubble sort has the ability to detect if the list is sorted efficiently built into the algorithm. When the list is already sorted (best-case), the complexity of bubble sort is O(n).

## Heap Sort
Heap Sort is a comparison-based sorting algorithm. Heapsort can be though of as an improved selection sort: like that algorithm, it divides its input into a sorted and an unsorted array, and it iteratively shrinks the unsorted array by extracting the largest element and moving it to the sorted array.

### Algorithm
1. Initially build a max heap of element in the array.
2. The root element, that is array[0], will contain maximum element of the array. After that, swap this element with the last element of the array and heapify the max heap excluding the last element which is already in its correct position and decrease the length of the heap by one.
3. Repeat step 2 until all elements are in their correct position.

### Complexity Analysis
Heap Sort has O(nlogn) time complexities for all the cases (best case, average case, and worst case).
