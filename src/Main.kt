import i_introduction._4_Lambdas.JavaCode4

/**
 * Author vgrec created on 31.05.17.
 */

fun main(args: Array<String>) {
    higherOrderFunc(100, { println("Hello What") })


    val sum = { x: Int, y: Int -> x + y }
    println(sum(100, 100))

    val sum2: (Int, Int) -> Int = { x, y -> x + y }
    println(sum2(20, 20))

    val test = JavaCode4()
    val list = listOf(1, 2, 3)
    println(test.task4(list))

}


fun test(a: Int, b: Int = 0, text: String = ""): Int {
    return a + b + text.toInt()
}

fun higherOrderFunc(a: Int, func: (text: String) -> Unit) {
    func.invoke("Yes")
}