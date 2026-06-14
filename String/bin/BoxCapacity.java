package A;

public class BoxCapacity {

    public static void main(String[] args) {

        int[] capacity = {1,5,3,1,7};
        int itemSize = 3;

        int minCapacity = Integer.MAX_VALUE;
        int index = -1;

        for(int i = 0; i < capacity.length; i++) {

            if(capacity[i] >= itemSize && capacity[i] < minCapacity) {
                minCapacity = capacity[i];
                index = i;
            }
        }

        System.out.println(index);
    }
}