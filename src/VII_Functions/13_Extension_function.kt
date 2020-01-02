package VII_Functions

fun main(args: Array<String>){
    val str1: String = "hello "
    val str2: String = "world"
    var str3: String = "Hey "
    println(str3.combine(str1, str2))

    var num1: Int = 4
    var num2: Int = 6
    println("this number is greater ${num2.greaterNumber(num1)}")
}

fun String.combine(s1: String, s2:String): String{
    return this+s1+s2
//    this refer to str1
}

fun Int.greaterNumber(num: Int): Int{
    if(this > num)
        return this
    else
        return num
}


//properties
//        they can become part of your own class--------like student, employee
//        they can become part of predefined classes-----like string, int, array

//advantage
//        reduce code
//        code is much cleaner and easy to read