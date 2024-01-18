public class TeemoAttacking {

    public static int findDuration(int[] timeSeries, int duration){
        int poisoned = duration;

        for (int i=1; i<timeSeries.length; i++){

            if (timeSeries[i-1]+duration >= timeSeries[i]){
                poisoned += timeSeries[i] - timeSeries[i-1];
            }else {
                poisoned += duration;
            }
        }
        return poisoned;
    }

    public static void main(String[] args) {
        int[] nums = {1,4};
        System.out.println(findDuration(nums, 2));
    }
}
