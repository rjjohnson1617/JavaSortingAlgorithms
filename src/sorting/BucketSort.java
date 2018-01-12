/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.*;
/**
 *
 * @author rjjohnson
 */
public class BucketSort {
    //Mainly useful when input is uniformly distributed over a range
    //O(n) - best & average; O(n^2) - worst
    
    public static void sort(int[] a, int maxVal){
        int[] bucket = new int[maxVal+1];
        
        for(int i=0; i<bucket.length; i++)
            bucket[i] = 0;
        
        for(int i=0; i<a.length; i++)
            bucket[a[i]]++;
        
        int outPos = 0;
        for(int i=0; i<bucket.length; i++)
            for(int j=0; j<bucket[i]; j++)
                a[outPos++] = i;
    }
}
