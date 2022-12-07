public class InsertionSorter implements Sorter {

    private int[] digitMassive;

    public InsertionSorter(int length) {

        digitMassive = new int[length];

        for (int i = 0; i < length; i++) {
            digitMassive[i] = i;
        }
    }

    @Override
    public void sort() {

        int i;

        for (int j = 1; j < digitMassive.length; j++) {
            int temp = digitMassive[j];
            for (i = j - 1; i >= 0 && digitMassive[i] > temp; i--) {
                digitMassive[i + 1] = digitMassive[i];
            }
            digitMassive[i + 1] = temp;
        }
    }
}
