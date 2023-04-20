package sort;

public class QuickSort implements Sort{
    @Override
    public void sort(int[] array) {
        quick(array, 0, array.length - 1);
    }

    private void quick(int[] array, int left, int right) {
        if(left < right) {
            int pi = partition(array, left, right);

            quick(array, left, pi - 1);
            quick(array, pi + 1, right);
        }
    }

    private int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left - 1;

        for(int j = left; j < right; j ++) {
            if(array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[right];
        array[right] = temp;

        return (i + 1);
    }
}
