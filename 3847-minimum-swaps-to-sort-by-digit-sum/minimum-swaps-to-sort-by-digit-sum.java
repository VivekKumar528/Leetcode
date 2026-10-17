class Solution {
    public int digitSum(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }

    public int minSwaps(int[] nums) {
        int[] copyArr = new int[nums.length];

        for (int i = 0; i < nums.length; i++)
            copyArr[i] = nums[i];
        HashMap<Integer, Integer> originalIndex = new HashMap<>(); // ele -> idx
        for (int i = 0; i < nums.length; i++) {
            int ele = nums[i];
            int idx = i;
            originalIndex.put(ele, idx);
        }
        Integer[] sorted = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sorted[i] = nums[i];
        }
        Arrays.sort(sorted, (a, b) -> {
            int aDigitSum = digitSum(a);
            int bDigitSum = digitSum(b);
            if (aDigitSum != bDigitSum)
                return Integer.compare(digitSum(a), digitSum(b));
            else
                return Integer.compare(a, b);
        });

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int expectedVal = sorted[i];
            int currVal = copyArr[i];
            if (expectedVal == currVal)
                continue;
            int idx = originalIndex.get(expectedVal);
            copyArr[i] = expectedVal;
            copyArr[idx] = currVal;
            originalIndex.put(expectedVal, i);
            originalIndex.put(currVal, idx);

            count++;

        }

        return count;

    }
}