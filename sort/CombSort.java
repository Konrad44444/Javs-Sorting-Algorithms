package sort;

public class CombSort implements Sort{
    @Override
    public void sort(int[] array) {
        int gap = array.length;
        boolean swapped = true;

        while(swapped) {
            gap = getNextGap(gap);
            swapped = false;

            for(int i = 0; i < array.length - gap; i++) {
                if(array[i] > array[i + gap]) {
                    int temp = array[i];
                    array[i] = array[i + gap];
                    array[i + gap] = temp;
                    swapped = true;
                }
            }
        }
    }

    private int getNextGap(int gap) {
        gap = (gap * 10) / 13;
        if(gap < 0) return 1;
        return (int) gap;
    }
}
