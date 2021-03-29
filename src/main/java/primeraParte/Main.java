package primeraParte;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Integer[] array = new Integer[10];

        int contador = 10;
        for (int i = 0; i < array.length; i++) {
            array[i] = contador--;
        }

        Comparator<Integer> c = (x, y) -> x - y;

        QuickSortSorterImple<Integer> quickSort = new QuickSortSorterImple<>();
        quickSort.sort(array, c);

        for (Integer integer : array) {
            System.out.println(integer);
        }

        Integer[] array2 = new Integer[10];

        int contador2 = 10;
        for (int i = 0; i < array2.length; i++) {
            array2[i] = contador2--;
        }

        Comparator<Integer> c2 = (x, y) -> x - y;

        HeapSortImple<Integer> heapSortImple = new HeapSortImple<>();
        heapSortImple.sort(array2, c2);

        for (Integer integer : array2) {
            System.out.println(integer);
        }

        Integer[] array3 = new Integer[100];

        int contador3 = 100;
        for (int i = 0; i < array3.length; i++) {
            array3[i] = contador3--;
        }

        Comparator<Integer> c3 = (x, y) -> x - y;

        BubbleSortSorterImple<Integer> bubbleSortSorterImple = new BubbleSortSorterImple<>();
        bubbleSortSorterImple.sort(array3, c3);

        for (Integer integer : array3) {
            System.out.println(integer);
        }

    }

}
