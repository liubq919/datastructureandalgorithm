package arrays;

public class RemoveDuplicatesInSortedArray {

    public static void main(String[] args) {

        int[] allNums = {4, 4, 8, 8, 9, 9, 11};

        System.out.println ( removeDuplicates ( allNums ) );

    }

    public static int removeDuplicates(int[] A) {

        /* handle empty list */
        if ( A.length == 0 )
            return 0;

        int j = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[j])
                A[++j] = A[i];
        }

        return ++j;
    }
}
