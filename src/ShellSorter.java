public class ShellSorter implements Sorter {

    private int[] digitMassive;

    public ShellSorter(int length) {

        digitMassive = new int[length];

        for (int i = 0; i < length; i++) {
            digitMassive[i] = i;
        }
    }

    @Override
    public void sort() {
        for (int gap = digitMassive.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < digitMassive.length; i++) {
                for (int j = i; j > gap && digitMassive[j - gap] > digitMassive[j]; j -= gap) {
                    swap(j, j - gap);
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
