package com.baiiu;

/**
 * auther: baiiu
 * time: 17/4/9 09 10:59
 * description:
 */
public class TestSort {

    public static void main(String[] args) {
        int[] array = new int[] { 5, 0, 10, 0, 2, 6, 9, 7, 8, -1, 3 };//11

        array = new int[] { 3, 0, 3 };

        //BubbleSort.simpleSwapSort(array);
        //BubbleSort.bubbleSort(array);
        //BubbleSort.bubbleSortBetter(array);

        //SimpleSelectionSort.simpleSelectionSort(array);

        //StraightInsertionSort.straightInsertionSort(array);
        //StraightInsertionSort.straightInsertionSort2(array);

        //BinaryInsertionSort.binaryInsertionSort(array);

        //ShellSort.shellSort(array);

        //HeapSort.heapSort(array);

        //MergeSort.mergeSort(array);
        //MergeSortWhile.mergeSort(array);

        //QuickSort.quickSort(array);
        //QuickSortWithInsertSort.quickSortWithInsertSort(array);

        //BucketSort.bucketSort(array, 5);

        array = CountSort.countSort(array);

        CommonUtil.printArray(array);
        CommonUtil.isSorted(array);

    }

}
