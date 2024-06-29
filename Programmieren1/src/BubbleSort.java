public class BubbleSort {
    int[] array;


    public void sort(int[] array) {
        if (array.length > 1) {
            boolean running = true;
            while (running) {
                running = false;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        int temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        running = true;
                    }
                }
            }
        } else return;
    }

    public void sortiert(int[] array) {
        sort(array);
        for (int n : array) {
            System.out.print(n + " ");
        }
    }
}
