class Solution {
    fun runningSum(nums: IntArray): IntArray {
        val output = IntArray(nums.size)
        var runningSum = 0

        for (i in nums.indices) {
            runningSum += nums[i]
            output[i] = runningSum
        }

        return output
    }
}
