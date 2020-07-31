/**
 * Utility class which performs various operations with integer arrays.
 */
public class ArrayOperations {
    private final int[] numbers;      // array that needs to be sorted.
    private final int[] unsorted;     // reference array which stays unsorted.

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
        this.unsorted = numbers.clone();
    }

    /* **********************************************************
     *   Please implement the following methods.                 *
     *   It is intended that they are not static.                *
     * ***********************************************************/

    /**
     * Prints out the numbers array.
     */

    public void print() {
        for ( int element : numbers) {
            System.out.print (element + " ");
        }

    }

    /**
     * @return the sorted numbers array.
     */


    public int[] sort() {
        int temp;
        for (int i= 1; i < numbers.length; i++) {
            for (int j=0; j<numbers.length-1; j++) {
                if (numbers[j]>numbers[j+1]) {
                    temp = numbers[j];
                    numbers[j]= numbers [j+1];
                    numbers[j+1]= temp;
                }
            }
        }
        System.out.println(numbers);
        return numbers;
    }

    /**
     * Choose some sorting algorithm you like.
     * Some examples with pseudo code can be found here:
     *
     * @return the sorted array in reverted order
     * @see <a href="sorting algortihms">http://faculty.cs.niu.edu/~hutchins/csci241/sorting.htm</a>
     */
    public int[] revertSort() {

       int[] numb = sort();
        numb = reverse(numb);

        return numb;
    }

    /**
     * @return the unsorted array in reverted order.
     */
    public int[] reverted() {

        return reverse(this.numbers);

    }

    /**
     * @param value which should be searched for.
     * @return true if the array contains the value, false otherwise.
     */
    public boolean contains(int value) {
        for(int i=0; i < numbers.length; i++) {
            if (value == numbers[i]) {
                return true;
            }
        }
        return false;
    }

    /**
     * @return the average value of all elements summed up.
     */
    public double average() {
        double sum=0;
        for ( int i=0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum / numbers.length;
    }

    /**
     * @return the average value of all elements summed up, but without the highest and the lowest value.
     */
    public double trimmedMean() {
        int [] numbers= sort();
        double sum=0;
        for ( int i=1; i < numbers.length-1; i++) {
            sum = sum + numbers[i];
        }

        return sum / numbers.length-1;
    }

    /**
     * @return the max value of the array. In the array [1,9,3] max would be 9.
     */
    public int maxValue() {
        int [] numbers= sort();
        return numbers[numbers.length-1];
    }

    /**
     * @return the min value of the array. In the array [1,9,3] min would be 1.
     */
    public int minValue() {
        int [] numbers= sort();
        return numbers[0];
    }
    
     /* **********************************************************
     *   Feel free to add as many private helper methods as      *
     *   you like.                                               *
     * ***********************************************************/

    private int[] reverse(int[] numbers) {
        int[] temp = new int[numbers.length];
        for ( int i = numbers.length-1; i >= 0; i--) {
            temp[numbers.length-1 -i] = numbers[i];
        }
        return temp;
    }
}
