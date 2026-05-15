package A;
public class ContainerWater {

    public static void main(String[] args) {

        int[] arr = {1, 5, 4, 3};

        int left = 0;
        int right = arr.length - 1;
        int maxArea = 0;

        while (left < right) {

            int height = Math.min(arr[left], arr[right]);
            int width = right - left;
            int area = height * width;

            maxArea = Math.max(maxArea, area);

            if (arr[left] < arr[right])
                left++;
            else
                right--;
        }

        System.out.println(maxArea);
    }
}
