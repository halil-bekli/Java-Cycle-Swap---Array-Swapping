package com.epam.rd.autotasks;

public class CycleSwap {
    
    /**
     * Shift all elements in the given array to the right in a cycle manner by shift positions.
     * Shift value is guaranteed to be non-negative. If shift is larger than the array length,
     * it will be normalized using modulo operation.
     * 
     * For example: [1, 3, 2, 7, 4] with a shift of 3 becomes [2, 7, 4, 1, 3]
     * 
     * @param array the array to cycle swap
     * @param shift the number of positions to shift right (non-negative)
     */
    public static void cycleSwap(int[] array, int shift) {
        if (array == null || array.length == 0 || shift == 0) {
            return;
        }
        
        int length = array.length;
        // Normalize shift to be within array bounds
        shift = shift % length;
        
        if (shift == 0) {
            return;
        }
        
        // Create a temporary array to hold the result
        int[] temp = new int[length];
        
        // Copy elements with shift applied
        for (int i = 0; i < length; i++) {
            // Element at position i moves to position (i + shift) % length
            temp[(i + shift) % length] = array[i];
        }
        
        // Copy back to original array
        System.arraycopy(temp, 0, array, 0, length);
    }
}
