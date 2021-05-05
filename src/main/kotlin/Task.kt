import kotlin.math.*

class Task {
    companion object {
        fun getGCD(firstNumber: Int, secondNumber: Int): Int {
            var maxNum: Int = max(abs(firstNumber), abs(secondNumber))
            var minNum: Int = min(abs(firstNumber), abs(secondNumber))

            while (maxNum % minNum != 0) {
                val temp = maxNum % minNum
                maxNum = minNum
                minNum = temp
            }

            return minNum
        }

        fun getLCM(firstNumber: Int, secondNumber: Int) =
            abs(firstNumber * secondNumber) / getGCD(firstNumber, secondNumber)

        fun containSymbol(str: String, symbol: Char) = str.contains(symbol)

        fun recursiveSum(from: Int = 0, to: Int = 100): Int {
            val num = if (from % 2 == 0) from else from + 1
            if (num >= to)
                return 0
            return num + recursiveSum(num + 2, to)
        }

        fun reverseInt(number: Int) =
            if (number >= 0) number.toString().reversed().toInt()
            else -(-number).toString().reversed().toInt()

        fun isPalindrome(str: String) = str.toLowerCase() == str.toLowerCase().reversed()

        fun isPalindromeAllWord(str: String) = str.toLowerCase().split(" ").all { el ->
            el.toLowerCase() == el.toLowerCase().reversed()
        }
    }
}