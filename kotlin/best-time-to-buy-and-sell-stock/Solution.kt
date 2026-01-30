class Solution {
    fun maxProfit(prices: IntArray): Int {
        var minPrice = prices[0]
        var maxProfit = 0

        for (i in 1 until prices.size) {
            maxProfit = maxOf(maxProfit, prices[i]-minPrice)
            minPrice = minOf(minPrice, prices[i])
        }

        return maxProfit
    }
}
