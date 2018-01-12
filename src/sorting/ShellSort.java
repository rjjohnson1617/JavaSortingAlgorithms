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
public class ShellSort {
    //A variation of Insertion Sort. Allows exchange of far items
    //We make the array h-sorted for a large value of h. We keep reducing the
    //value of h until it becomes 1. An array is said to be h-sorted if all
    //sublists of every h'th element is sorted - O(n^2)
    
    public static void sort(int arr[]){
        int inner, outer;
        int temp;
        
        int h = 1;
        while(h <= arr.length / 3)
            h = h * 3 + 1;
        
        while(h > 0){
            for(outer = h; outer < arr.length; outer++){
                temp = arr[outer];
                inner = outer;
                
                while(inner > h - 1 && arr[inner - h] >= temp){
                    arr[inner] = arr[inner - h];
                    inner -= h;
                }
                arr[inner] = temp;
            }
            h = (h - 1) / 3;
        }
    }
}
