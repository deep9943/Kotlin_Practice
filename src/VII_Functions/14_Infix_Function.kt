package VII_Functions

//infix function can be a member function or extension function
//all infix function are extension function but all extension function are not infix
//they have one parameter, more than two parameters are not allowed
//they have prefix of "infix"


fun main(args: Array<String>){
    var num1: Int = 4
    var num2: Int = 6
    var result1: Int = num1.greaterNum(num2)
    var result2: Int = num1 greaterNum num2
    println("this number is greater $result1")
    println("this number is greater $result2")
    println("Both are same")
}

infix fun Int.greaterNum(num: Int): Int{
    if(this > num)
        return this
    else
        return num
}