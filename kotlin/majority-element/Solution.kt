class Solution {
    fun majorityElement(nums: IntArray): Int {
        val numCount = mutableMapOf<Int, Int>()

        for (num in nums) {
            val newCount = numCount.getOrDefault(num, 0) + 1
            numCount[num] = newCount
            if (newCount > nums.size / 2) {
                return num
            }
        }

        return -1
    }
}
