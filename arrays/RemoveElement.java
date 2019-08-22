package arrays;

public class RemoveElement {

    public static void main(String[] args) {

        int[] allNums = {-1, 0, 1, 2, -1, -4};

        System.out.println ( removeElement ( allNums, -1 ) );

    }

    public static int removeElement(int[] A, int num)
    {

        /* handle empty list */
        if ( A.length == 0 ) return 0;

        int slow = 0;

        for ( int fast = 0; fast < A.length; fast++ )
        {
            if(A[fast] != num)
                A[slow++] = A[fast];
        }

        return slow;
    }
}
