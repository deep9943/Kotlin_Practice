package VII_Functions

fun main(args: Array<String>){
    findVol(length = 2, breadth = 3, height = 4)
    findVol(height = 1, length = 2, breadth = 3)
}

fun findVol(length: Int, breadth: Int, height: Int){
    println("length is $length")
    println("Breadth is $breadth")
    println("height is $height")
}