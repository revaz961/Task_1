/*
working console application
 */

fun main() {
    while (true) {
        println(
            """
            |1.GCD                   2.LCM           3.Contain symbol
            |4.Recursive Sum         5.Reverse       6.Palindrome
            |7.Palindrome words       0.Exit
        """.trimMargin()
        )

        print("Select action: ")
        var selected: Int?
        try {
            selected = readLine()?.toInt()
        } catch (ex: NumberFormatException) {
            println("Please Enter correct number.\n")
            continue
        }
        println()

        when (selected) {
            0 -> {
                println("Bye bye.")
                break
            }
            1 -> {
                println("GCD(firstNumber: Int, secondNumber: Int): Int")
                print("Enter first number: ")
                val firstNumber = try {
                    readLine()?.toInt()
                } catch (ex: java.lang.NumberFormatException) {
                    null
                }
                print("Enter second number: ")
                val secondNumber = try {
                    readLine()?.toInt()
                } catch (ex: java.lang.NumberFormatException) {
                    null
                }
                if (firstNumber == null || secondNumber == null) {
                    println("Incorrect input!!! \ntry again.\n")
                    continue
                } else
                    println("GCD($firstNumber, $secondNumber) = ${Task.getGCD(firstNumber, secondNumber)}\n")
            }
            2 -> {
                println("LCM(firstNumber: Int, secondNumber: Int): Int")
                print("Enter first number: ")
                val firstNumber = try {
                    readLine()?.toInt()
                } catch (ex: java.lang.NumberFormatException) {
                    null
                }
                print("Enter second number: ")
                val secondNumber = try {
                    readLine()?.toInt()
                } catch (ex: java.lang.NumberFormatException) {
                    null
                }
                if (firstNumber == null || secondNumber == null) {
                    println("Incorrect input!!! \ntry again.\n")
                    continue
                } else
                    println("LCM1($firstNumber, $secondNumber) = ${Task.getLCM(firstNumber, secondNumber)}\n")
            }
            3 -> {
                println("containSymbol(x: String, y: Char): Boolean")
                print("Enter string: ")
                val str = readLine().toString()
                print("Enter symbol: ")
                val symbol = readLine()
                if (symbol?.length != 1) {
                    println("Incorrect input!!! \ntry again.\n")
                    continue
                } else {
                    println("containSymbol(\"$str\", \'${symbol[0]}\') = ${Task.containSymbol(str, symbol[0])}\n")
                }
            }
            4 -> {
                println("recursiveSum(from: Int, to: Int): Int")
                print("Enter first number: ")
                val firstNumber = try {
                    readLine()?.toInt()
                } catch (ex: java.lang.NumberFormatException) {
                    null
                }
                print("Enter second number: ")
                val secondNumber = try {
                    readLine()?.toInt()
                } catch (ex: java.lang.NumberFormatException) {
                    null
                }
                if (firstNumber == null || secondNumber == null) {
                    println("Incorrect input!!! \ntry again.\n")
                    continue
                } else
                    println(
                        "recursiveSum($firstNumber, $secondNumber) = ${
                            Task.recursiveSum(
                                firstNumber,
                                secondNumber
                            )
                        }\n"
                    )
            }
            5 -> {
                println("reverseInt(x: Int): Int")
                print("Enter Number: ")
                val number = try {
                    readLine()?.toInt()
                } catch (ex: java.lang.NumberFormatException) {
                    null
                }
                if (number == null) {
                    println("Incorrect input!!! \ntry again.\n")
                    continue
                } else {
                    println("reverseInt($number) = ${Task.reverseInt(number)}\n")
                }
            }
            6 -> {
                println("isPalindrome(x: String): Boolean")
                print("Enter string: ")
                val str = readLine().toString()
                println("isPalindrome(\"$str\") = ${Task.isPalindrome(str)}\n")

            }
            7 -> {
                println("isPalindromeAllWord(x: String): Boolean")
                print("Enter string: ")
                val str = readLine().toString()
                println("isPalindrome(\"$str\") = ${Task.isPalindromeAllWord(str)}\n")

            }
            else -> {
                println("Select correct action!!!\n")
                continue
            }
        }
    }
}