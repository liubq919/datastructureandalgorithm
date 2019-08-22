package arrays;

public class ContainerWithMostWater {

    public static void main(String[] args) {

        int[] allNums = {1, 5, 9, 4, 11, 9};

        System.out.println ( maxArea ( allNums ) );

    }

    private static int maxArea(int[] height) {

        int left = 0, right = height.length -1;
        int maxArea = 0;

        while (left < right) {

            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));

            if (height[left] < height[right])
                left++;
            else
                right--;
        }

        return maxArea;
    }
}
