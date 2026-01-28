class Solution {
    fun validMountainArray(arr: IntArray): Boolean {
        if (arr.size < 3) {
            return false
        }

        var i = 0
        val n = arr.size

        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++
        }

        if (i == 0 || i == n-1) {
            return false
        }

        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++
        }

        return i == n-1
    }
}
