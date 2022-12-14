public class BubbleSorter implements Sorter {

    private int[] digitMassive;

    public BubbleSorter(int length) {

        digitMassive = new int[length];

        for (int i = 0; i < length; i++) {
            digitMassive[i] = i;
        }
    }

    @Override
    public void sort() {
        for (int j = digitMassive.length - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                if (digitMassive[i] > digitMassive[i + 1]) {
                    swap(i, i + 1);
                }
            }
        }
    }

    private void swap(int x, int y) {
        int t = digitMassive[x];
        digitMassive[x] = digitMassive[y];
        digitMassive[y] = t;
    }
}
