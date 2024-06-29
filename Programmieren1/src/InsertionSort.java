public class InsertionSort {
    int[] Array;

    public InsertionSort(int[] array) {
        Array = array;
    }


    public void sortieren(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int x = array[i];
            int j = i;
            while (j >= 1 && array[j - 1] > x) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = x;
        }
    }
}
