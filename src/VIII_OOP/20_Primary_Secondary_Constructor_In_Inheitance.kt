package VIII_OOP


//fun main(args: Array<String>){
//    var dogObj = Dog("Black", "Pug")
//}
//
//open class Animal(var color: String){
//    init {
//        println("From animal init--${color}")
//    }
//}
//
//class Dog(color: String, var breed: String): Animal(color){
//    init {
//        println("From Dog init--${breed}")
//    }
//}



//============================================



//fun main(args: Array<String>){
//    var dogObj = Dog("Black", "Pug")
//}
//
//open class Animal(var color: String){
//    init {
//        println("From animal init--${color}")
//    }
//}
//
//class Dog(color: String, var breed: String): Animal(color){
//    init {
//        println("From Dog init--${breed}")
//    }
//}



//=============================use secondary constructor instead of primary constructor

//fun main(args: Array<String>){
//    var dogObj = Dog("Black", "Pug")
//}
//
//open class Animal{
//    var color: String = ""
//    constructor(color: String){
//        this.color = color
//        println("From animal $color")
//    }
//}
//
//class Dog: Animal{
//    var bread: String = ""
//    constructor(color: String, bread: String): super(color){
//        this.bread = bread
//        println("from dog $bread and $color")
//    }
//}