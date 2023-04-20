package sort;

public class HeapSort implements Sort{

    @Override
    public void sort(int[] array) {
        int n = array.length;

        for(int i = n/2 -1; i >= 0; i--)
            heapify(array, n, i);

        for(int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }

    private void heapify(int[] array,  int heapSize, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(left < heapSize && array[left] > array[largest])
            largest = left;

        if(right < heapSize && array[right] > array[largest])
            largest = right;

        if(largest != i) {
            int temp = array[largest];
            array[largest] = array[i];
            array[i] = temp;

            heapify(array, heapSize,largest);
        }
    }


}
