import java.util.Arrays;

public class JavaArray {
    public static void main(String[] args) {
        // Copying Arrays
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[9];

        System.arraycopy(copyFrom, 2, copyTo, 1, 7);

        System.out.println(new String(copyTo));
        System.out.println(copyTo);
        System.out.println(Arrays.toString(copyTo));
        System.out.println("\n");

        // Another Copying Arrays example
        String[] cpyFrom = {"Muhammad", "Abid", "Hasan", "Saimon", "Miad"};
        String[] cpyTo = {"abc", "bcd", "efg", "hij", "xyz"};

        System.arraycopy(cpyFrom, 1, cpyTo, 1, 3);

        System.out.println(Arrays.toString(cpyTo));
        System.out.println("\n");



        // Array Manipulations

        /*
         one is java.util.Arrays.copyOfRange. Similar to arrayCopy but
         this method does not require you to create the destination array before calling the method,
         because the destination array is returned by the method
        */
        char[] copyFrom2 = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };

        char[] copyTo1 = Arrays.copyOfRange(copyFrom2, 2, 9); //(copyFrom, startIndex, toLength);
        char[] copyTo2 = Arrays.copyOf(copyFrom, 5);

        System.out.println(copyTo1);
        System.out.println(copyTo2);
        System.out.println("\n");

        // sort(), parallelSort() and binarySearch()
        // If input list is not sorted, the results are undefined.
        // If there are duplicates, there is no guarantee which one will be found.
        int[] smallData = {23,7,3,90,54,98,12,6,89};
        int[] bigData = {23,7,3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,
                3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,3,90,54,98,
                12,6,89,7,3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,3,
                90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,
                3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,3,90,54,98,
                12,6,89,7,3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,3,7,3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,
                3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,3,90,54,98,
                12,6,89,7,3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,3,7,3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,
                3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,3,90,54,98,
                12,6,89,7,3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,3,7,3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,
                3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,3,90,54,98,
                12,6,89,7,3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,3,7,3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,
                3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,3,90,54,98,
                12,6,89,7,3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,3,7,3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,
                3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,3,90,54,98,
                12,6,89,7,3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,3,7,3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,
                3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,3,90,54,98,
                12,6,89,7,3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,3,7,3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,
                3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,3,90,54,98,
                12,6,89,7,3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,3,7,3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,
                3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,3,90,54,98,
                12,6,89,7,3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,3,7,3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,
                3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,3,90,54,98,
                12,6,89,7,3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,3,7,3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,
                3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,3,90,54,98,
                12,6,89,7,3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,3,7,3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,
                3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,3,90,54,98,
                12,6,89,7,3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,3,7,3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,
                3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,3,90,54,98,
                12,6,89,7,3,90,54,98,12,6,89,7,3,90,54,98,12,6,89,7,3};

        Arrays.sort(cpyFrom);
        Arrays.sort(copyFrom2);

        /*
        * sort() works fast on smaller dataset. (Dual-Pivot Quicksort concept)
        * parallelSort() works fast on large dataset. (Fork/Join Concept)
        * for comparison and to know more details, follow these link.
        * https://www.geeksforgeeks.org/java-8-arrays-parallelsort-method-with-examples/
        * https://www.baeldung.com/java-arrays-sort-vs-parallelsort
        * to check impact, check ParallelSortVsSort.java
        * */
        long startTime = System.nanoTime();
        Arrays.sort(bigData);
        long endTime = System.nanoTime();
        System.out.println("Time for sort: " + (endTime - startTime));

        startTime = System.nanoTime();
        Arrays.parallelSort(bigData);
        endTime = System.nanoTime();
        System.out.println("Time for Parallel Sort: " + (endTime - startTime));


        System.out.println(Arrays.toString(cpyFrom));
        System.out.println(copyFrom2);
        // new way of printing using foreach loop
        Arrays.stream(smallData).forEach(num -> System.out.print(num + " "));
        System.out.println();

        System.out.println("\ni is found at " + Arrays.binarySearch(copyFrom2, 'i'));
        System.out.println("Miad is found at " + Arrays.binarySearch(cpyFrom, "Miad"));
        System.out.println("54 is found at " + Arrays.binarySearch(smallData, 54));
        System.out.println("\n");


        // comparing - equals() and deepEquals()
        int[] numArr2 = {1, 2, 4};
        int[] numArr3 = {1, 4, 2};
        int[] numArr4 = {1, 4, 2};

        // Using == on array will not give the desired result and it will compare them as objects.
        System.out.println("== method: " + (numArr3 == numArr4)); // false

        System.out.println("equals() method: " + Arrays.equals(numArr3, numArr4)); // true
        System.out.println("equals() method: " + Arrays.equals(numArr2, numArr3)); // false

        Object[] numArr5 = {numArr3};
        Object[] numArr6 = {numArr4};

        // Seems to be true but alas! it will print false.
        System.out.println("equals() method(Object): " + Arrays.equals(numArr5, numArr6)); // false

        // introducing deepEquals(). It iterates over each value of an array and deep compare using any overridden equals method.
        // require type Object[]. doesn't work with int[], float[] etc etc.
        System.out.println("deepEquals() method: " + Arrays.deepEquals(numArr5, numArr6)); // true


    }

}
