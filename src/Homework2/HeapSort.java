package Homework2;

import Seminar2.Ex01;

public class HeapSort {
    public static void main(String[] args) {
        int size = 20;
        int min = 0;
        int max = 100;
        int[] array = Ex01.getRandomArr(size, min, max);
        Ex01.printArr(array);
        sortHeap(array);
        Ex01.printArr(array);

    }
    public static void sortHeap(int[] array) {
        for (int i = array.length /2 - 1; i >= 0; i--)
            heapify(array, array.length, i);

        for (int i = array.length - 1; i >= 0 ; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }

    }

    private static void heapify (int [] array, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        if (leftChild < heapSize && array[leftChild] > array[largest])
            largest = leftChild;
        if (rightChild < heapSize && array[rightChild] > array[largest])
            largest = rightChild;

        if (largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            heapify(array, heapSize, largest);
        }
    }
}
