package com.epam.rd.autotasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CycleSwapTest {

    @Test
    public void testBasicShift() {
        int[] array = {1, 3, 2, 7, 4};
        CycleSwap.cycleSwap(array, 3);
        assertArrayEquals(new int[]{2, 7, 4, 1, 3}, array);
    }

    @Test
    public void testShiftByOne() {
        int[] array = {1, 2, 3, 4, 5};
        CycleSwap.cycleSwap(array, 1);
        assertArrayEquals(new int[]{5, 1, 2, 3, 4}, array);
    }

    @Test
    public void testNoShift() {
        int[] array = {1, 2, 3, 4, 5};
        CycleSwap.cycleSwap(array, 0);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testShiftEqualToLength() {
        int[] array = {1, 2, 3, 4, 5};
        CycleSwap.cycleSwap(array, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testEmptyArray() {
        int[] array = {};
        CycleSwap.cycleSwap(array, 2);
        assertArrayEquals(new int[]{}, array);
    }

    @Test
    public void testSingleElementArray() {
        int[] array = {42};
        CycleSwap.cycleSwap(array, 1);
        assertArrayEquals(new int[]{42}, array);
    }

    @Test
    public void testLargeShift() {
        int[] array = {1, 2, 3, 4, 5};
        CycleSwap.cycleSwap(array, 7); // 7 % 5 = 2
        assertArrayEquals(new int[]{4, 5, 1, 2, 3}, array);
    }

    @Test
    public void testTwoElements() {
        int[] array = {10, 20};
        CycleSwap.cycleSwap(array, 1);
        assertArrayEquals(new int[]{20, 10}, array);
    }
}
