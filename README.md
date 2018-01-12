# SortingAlgorithms
Descriptions of some sorting algorithms coded in Java.

## Bubble Sort
Bubble sort is a simple and well-known sorting algorithm that repeatedly steps through the list to be sorted, compares each pair of adjacent items, and swaps them if they are in the wrong order. It's main application is to make an introduction to the sorting algorithms.
Bubble sort belongs to O(n^2) sorting algorithms, which makes it quite inefficient for sorting large data volumes.
Bubble sort is stable and adaptive.
#### Algorithm
1. Compare each pair of adjacent elements from the beginning of an array and, if they are in reversed order, swap them.
2. If at least one swap has been done, repeat step 1.

You can imagine that on every step, big bubbles float to the surface and stay there. At the step when no bubble moves, sorting stops.
#### Complexity Analysis
Average and worst case complexity of bubble sort is O(n^2), where n is the number of items being sorted. Bubble sort is not a practical sorting algorithm when n is large. 
Bubble sort has the ability to detect if the list is sorted efficiently built into the algorithm. When the list is already sorted (best-case), the complexity of bubble sort is O(n).

## Bucket Sort
Bucket sort, or bin sort, is a sorting algorithm that works by distributing the elements of an array into a number of buckets. Each bucket is then sorted individually, either using a different sorting algorithm, or by recursively applying the bucket sortying algorithm. Bucket sort can be implemented with comparisons and therefore can also be considered a comparison sort algorithm.
#### Algorithm
1. Set up an arry of initially empty "buckets."
2. Scatter: Go over the original array, putting each object in its bucket
3. Sort each non-empty bucket
4. Gather: Visit the buckets in order and put all elements back into the original array
#### Complexity Analysis
For bucket sort to be O(n) on average, the number of buckets, n, must be equal to the length of the array being sorted, and the input array must be uniformly distributed across the range of possible bucket values. If these requirements are not met, the performance of bucket sort will be dominated by the running time of nextSort, which is typically O(n^2) insertion sort.

## Counting Sort
Counting sort is an algorithm for sorting a collection of objects according to keys that are small integers; that is, it is an integer sorting algorithm. It operated by counting the number of objects that have each distinct key value, and using arithmetic on those counts to determine the positions of each key value in the output sequence.
#### Algorithm
1. Allocate an array, count, where the indices represent numbers from our input array and the values represent how many times the index number appears. Start each value at 0.
2. In one pass of the input array, update the count array as you go, so that at the end the values in count are correct.
3. Allocate an array, sorted, where we'll store our sorted numbers.
4. In one in-order pass of the count array put each number, the correct number of times, into the sorted array.
#### Complexity Analysis
Because the algorithm uses only simple for loops, without recursion or subroutine calls, it is straightforward to analyze. The initialization of the count array, and the second for loop which performs a prefix sum on the count array, each iterate at most k+1 times and therefore take O(k) time. The other two for loops, and the initialization of the output array, each take O(n) time. Therefore, the time for the whole algorithm is the sum of the times for these steps, O(n+k).

## Heap Sort
Heap Sort is a comparison-based sorting algorithm. Heapsort can be though of as an improved selection sort: like that algorithm, it divides its input into a sorted and an unsorted array, and it iteratively shrinks the unsorted array by extracting the largest element and moving it to the sorted array.
#### Algorithm
1. Initially build a max heap of element in the array.
2. The root element, that is array[0], will contain maximum element of the array. After that, swap this element with the last element of the array and heapify the max heap excluding the last element which is already in its correct position and decrease the length of the heap by one.
3. Repeat step 2 until all elements are in their correct position.
#### Complexity Analysis
Heap Sort has O(nlogn) time complexities for all the cases (best case, average case, and worst case).

## Insertion Sort
Insertion sort is a simple sorting algorithm that builds the final sorted array one item at a time. It is efficient for (quite) small data sets.
#### Algorithm
1. If it is the first element, it is already sorted.
2. Pick next element.
3. Compare with all elements in the sorted sub-list.
4. Shift all the elements in the sorted sub-list that is greater than the value to be sorted.
5. Insert the value.
6. Repeat until list is sorted.
#### Complexity Analysis
The best case input is an array that is already sorted. In this case, insertion sort has a linear running time, O(n).
The simplest worst case input is an array sorted in reverse order. In these cases, every iteration of the inner loop will scan and shift the entire sorted subsection of the array before inserting the next element. This gives insertion sort a quadratic running time, O(n^2).
The average case is also quadratic, which makes insertion sort impractical for sorting large arrays. However, insertion sort is one of the fastest algorithms for sorting very small arrays.

## Merge Sort
Merge sort is an efficient, general-purpose, comparison-based sorting algorithm. It is a divide and conquer algorithm based on teh idea of breaking down a list into several sublists until each sublist consists of a single element and merging those sublists in a manner that results into a sorted list.
#### Algorithm
1. Divide the unsorted list into n sublists, each containing 1 element (A list of 1 element is considered sorted).
2. Take adjacent pairs of two singleton lists and merge them to form a list of 2 elements. n will now convert into n/2 lists of size 2.
3. Repeat the process until a single sorted list is obtained.
#### Complexity Analysis
In sorting n objects, merge sort has an average and worst-case performance of O(nlogn). If the running time of merge sort for a list of length n is T(n), then the recurrence T(n)=2T(n/2)+n follows from the definition of the algorithm (apply the algorithm to two lists of half the size of the original list, and add the n steps taken to merge the resulting two lists).

## Quick Sort
Quicksort, sometimes called partition-exchange sort, is an efficient sorting algorithm, serving as a systematic method for placing the elements of an array in order. Quicksort is a comparison sort, meaning that it can sort items of any type for which a "less-than" relation is defined.
#### Algorithm
1. Pick an element, called a pivot, from the array.
2. Partitioning: Reorder the array so that all elements with values less than the pivot come before the pivot, while all elements with values greater than the pivot come after it (equal values can go either way). After this partitioning, the pivot is in its final position. This is called the partition operation.
3. Recursively apply the above steps to the sub-array of elements with smaller values and separately to the sub-array of elements with greater values.
#### Complexity Analysis
Worst-Case: The most unbalanced partition occurs when the pivot divides the list into two sublists of sizes 0 and n-1. This may occur if the pivot happens to be the smallest or largest element in the list, or in some implementations where all the elements are equal. If this happens, then each recursive call processes a list of size one less than the previous list resulting in O(n^2) time.
Best-Case: In the most balanced case, each time we perform a partition, we divide the list into two nearly equal pieces. This means each recursive call processes a list of half the size. The result is O(nlogn) time.
Average-case: To sort an array of n distinct element, quicksort takes O(nlogn) time.

## Radix Sort
Radix sort is a non-comparative integer sorting algorithm that sorts data with integer keys by grouping keys by the individual digits which share the same significant position and value.
#### Algorithm
1. Do the following step for each digit, i, where i varies from least significant digit to the most significant digit.
2. Sort input array using counting sort (or any stable sort) according to the i'th digit.
#### Complexity Analysis
Radix sort complexity is O(wn) for n keys which are integers of word size w. Sometimes w is presented as a constant, which would make radix sort better (for sufficiently large n) than the best comparison-based sorting algorithms, which all perform O(nlogn) comparisons to sort n keys. However, in general, w cannot be considered a constant: if all n keys are distinct, then w has to be at least log n for a random-access machine to be able to store them in memory, which gives at best a time complexity O(nlogn). That would seem to make radix sort at most equally efficient as the best comparison-based sorts (and worse if keys are much longer than log n).

## Selection Sort
Selection sort is a sorting algorithm, specifically an in-place comparison sort. It is inefficient on large lists, and generally performs worse than the similar insertion sort. The algorithm divides the input into two parts: the sublist of items already sorted, which is built up from left to right at the front (left) of the list, and the sublist of items remaining to be sorted that occupy the rest of the list. Initially, the sorted sublist is empty and the unsorted sublist is the entire input list. The algorithm proceeds by finding the smallest (or largest, depending on sorting order) element in the unsorted sublist, exchanging it with the leftmost unsorted element, and moving the sublist boundaries one element to the right.
#### Algorithm
1. Set MIN to location 0.
2. Search for the minimum element in the list.
3. Swap with value at location MIN.
4. Increment MIN to point to the next element.
5. Repeat until the list is sorted.
#### Complexity Analysis
Selection sort is not difficult to analyze compared to other sorting algorithms since none of the loops depend on the data in the array. Selecting the minimum requires scanning n elements and then swapping it into the first position. Finding the next lowest element requires scanning the remaining n-1 elements and so on. The time complexity is therefore O(n^2) in terms of number of comparisons.

## Shell Sort
Shellsort, also known as Shell's method, is an in-place comparison sort. The method starts by sorting pairs of elements far apart from each other, then progressively reducing the gap between the elements being compared. Starting with far apart elements, it can move some out-of-place elements into position faster than a simple nearest neighbor exchange.
#### Algorithm
1. Initilize the value of h.
2. Divide the list into smaller sublists of equal interval h.
3. Sort these sublists using insertion sort.
4. Repeat until complete list is sorted.
#### Complexity Analysis
The algorithm is quite efficient for medium-sized data sets as its average and worst case complexity are of O(n), where n is the number of items.
The time complexity in the code example is O(n^2). In this implementation, the gap is reduced by half in every iteration. There are many other ways to reduce the gap which lead to better time complexity.
