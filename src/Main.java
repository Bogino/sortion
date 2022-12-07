public class Main {

    public static void main(String[] args) {

        for (int i = 10; i < 1_000_000; i *= 10) {

            long start;

            Sorter bubbleSorter = new BubbleSorter(i);
            start = System.currentTimeMillis();
            bubbleSorter.sort();
            System.out.printf("Сортировка пузырьком для %s элементов: %s ms\n", i, System.currentTimeMillis() - start);

            Sorter insertionSorter = new InsertionSorter(i);
            start = System.currentTimeMillis();
            insertionSorter.sort();
            System.out.printf("Сортировка вставкой для %s элементов: %s ms\n", i, System.currentTimeMillis() - start);

            Sorter shellSorter = new ShellSorter(i);
            start = System.currentTimeMillis();
            shellSorter.sort();
            System.out.printf("Сортировка shell для %s элементов: %s ms\n", i, System.currentTimeMillis() - start);

            System.out.println("\n");
        }
    }
}
