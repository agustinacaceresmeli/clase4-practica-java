package primeraParte;

import java.util.Comparator;

public class QuickSortSorterImple<T> implements Sorter<T>{

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        int left = 0;
        int right = arr.length-1;

        this.quickSort(arr,c,left,right);
    }

    public void quickSort(T[] arr, Comparator<T> c,int left, int right) {
        int ll=left;
        int rr=right;
        T pivot = arr[(ll+rr)/2];

        if (rr>ll){
            while (ll <=rr){
                while(ll<right && c.compare(arr[ll], pivot) < 0){
                    ll +=1;
                }
                while(rr>left &&  c.compare(arr[rr], pivot) > 0){
                    rr -=1;
                }
                if (ll <=rr){
                    swap(arr, ll ,rr);
                    ll +=1;
                    rr -=1;
                }
            }
            if (left < rr){
                quickSort(arr,c,left,rr);

            }
            if (ll<right){
                quickSort(arr,c,ll, right);
            }
        }
    }


    public static final <T> void swap (T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
