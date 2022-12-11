public class HeapSorter implements Sorter {

    private final int[] digitMassive;

    public HeapSorter(int length) {
        digitMassive = new int[length];

        for (int i = 0; i < length; i++) {
            digitMassive[i] = i;
        }
    }

    @Override
    public void sort() {
        for (int h = digitMassive.length / 2 - 1; h >= 0; h--) {

            heapify(h, digitMassive.length);
        }
        for (int j = digitMassive.length - 1; j > 0; j--) {
            swap(0, j);
            heapify(0, j);
        }
    }

    private void heapify(int root, int length) {
        int currentRoot = root;
        int leftElement = 2 * currentRoot + 1;
        int rightElement = leftElement + 1;
        if (leftElement < length && digitMassive[leftElement] > digitMassive[currentRoot]) currentRoot = leftElement;
        if (rightElement <  length && digitMassive[rightElement] > digitMassive[currentRoot]) currentRoot = rightElement;
        if (currentRoot == root) return;
        swap(root, currentRoot);
        heapify(currentRoot,length);
    }

    private void swap(int x, int y) {
        int t = digitMassive[x];
        digitMassive[x] = digitMassive[y];
        digitMassive[y] = t;
    }
}
