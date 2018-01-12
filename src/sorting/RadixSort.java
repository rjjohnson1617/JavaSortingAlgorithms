/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.io.*;
import java.util.*;
/**
 *
 * @author rjjohnson
 */
public class RadixSort {
    //A non-comparative integer sorting algorithm that sorts data with integer
    //keys by grouping keys by the individual digits which share the same 
    //significant position and value. O(wn) - n keys which are integers of 
    //word size w
    
    public void radixsort(int[] input){
        final int RADIX = 10;
        //declare and initialize bucket[]
        List<Integer>[] bucket = new ArrayList[RADIX];
        for(int i=0; i < bucket.length; i++)
            bucket[i] = new ArrayList<Integer>();
        
        //sort
        boolean maxLength = false;
        int tmp = -1, placement = 1;
        while(!maxLength){
            maxLength = true;
            //split input between lists
            for(Integer i : input){
                tmp = i / placement;
                bucket[tmp % RADIX].add(i);
                if(maxLength && tmp > 0)
                    maxLength = false;
            }
            //empty lists into input array
            int a = 0;
            for(int b=0; b<RADIX; b++){
                for(Integer i : bucket[b])
                    input[a++] = i;
                bucket[b].clear();
            }
            //move to next digit
            placement *= RADIX;
        }
    }
}
