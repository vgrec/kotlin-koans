/**
 * Author vgrec created on 31.05.17.
 */

fun main(args: Array<String>) {
    println(test(4, 10, "30"))

    val list = listOf(1, 3, 4, 5)
    println(list.joinToString(prefix = "{", postfix = "}"))
}

fun test(a: Int, b: Int = 0, text: String = ""): Int {
    return a + b + text.toInt()
}