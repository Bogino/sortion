public class SelectionSort implements Sorter {

    private final int[] digitMassive;

    public SelectionSort(int length) {

        digitMassive = new int[length];

        for (int i = 0; i < length; i++) {
            digitMassive[i] = i;
        }
    }

    @Override
    public void sort() {

        for (int j = digitMassive.length - 1; j > 0; j--) {
            swap(findMax(j), j);
        }
    }

    private int findMax(int j) {

        int max = 0;

        for (int i = 1; i <= j; i++) {
            if (digitMassive[i] > digitMassive[max]) {
                max = i;
            }
        }
        return max;
    }

    private void swap(int x, int y) {
        int t = digitMassive[x];
        digitMassive[x] = digitMassive[y];
        digitMassive[y] = t;
    }
}
