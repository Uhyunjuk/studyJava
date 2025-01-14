package sec05.chap02.ex02;

public class IntArrayInfo {

    int count;
    int max;
    int min;
    int sum;
    double average;

    IntArrayInfo(int[] nums) {
        count = nums.length;
        max = nums[0];
        min = nums[0];

        for (int num : nums) {
            max = max > num ? max : num;
            min = min < num ? min : num;
            sum += num;
        }
        // 소수부 잃지 않도록 소수 곱해주기
        average = 1.0 * sum / nums.length;
    }
}
