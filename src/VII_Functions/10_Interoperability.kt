//fun VII_Functions.main(args: Array<String>){
//    var area = VII_Functions.myJavaFile.area(10, 5)
//    println("printing area from the kotlin file $area")
//}
//
//fun VII_Functions.add(a: Int, b: Int): Int{
//    return a+b
//}



//======================================giving custom name to the kotlin file========================================
@file: JvmName("MyKotlinFile")

package VII_Functions

fun main(args: Array<String>){
    var area = myJavaFile.area(10, 5)
    println("printing area from the kotlin file $area")
}

fun add(a: Int, b: Int): Int{
    return a+b
}