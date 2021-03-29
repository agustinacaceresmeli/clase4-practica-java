package primeraParte;

import java.util.Comparator;

public class HeapSortImple<T> implements Sorter<T> {

    private static int heapSize;
    private static int node;
    private static int left;
    private static int right;

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        buildHeap(arr, c);
        T temp;
        for (int i = arr.length - 1; i >= 0; i--) {
            temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapSize--;
            heapify(arr, 0, c);
        }
    }

    private void buildHeap(T[] array, Comparator<T> comp) {
        heapSize = array.length;
        for (int i = (int) Math.floor((array.length) / 2) - 1; i >= 0; i--) {
            heapify(array, i, comp);
        }
    }

    private void heapify(T[] array, int i, Comparator<T> comp) {
        left = getLeft(i);
        right = getRight(i);
        node = i;

        if((left <= heapSize - 1) && (comp.compare(array[left], array[node]) > 0)){
            node = left;
        }
        if ((right <= heapSize - 1) && (comp.compare(array[right], array[node]) > 0)) {
            node = right;
        }
        if (node != i) {
            T temp = array[i];
            array[i] = array[node];
            array[node] = temp;
            heapify(array, node, comp);
        }
    }

    private static int getLeft(int i) {
        return (i * 2);
    }

    private static int getRight(int i) {
        return (i * 2 + 1);
    }

}

