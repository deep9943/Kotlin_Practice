package VIII_OOP

//by default all class in kotlin are public in nature
//all classes in kotlin are "final" therefore can not be inherit
//so to make use of inheritance we make a class "open"


//fun main(ars: Array<String>){
//    var dog = Dog()
//    dog.color = "color1"
//    dog.breed = "bread1"
//    dog.bark()
//    dog.eat()
//
//    var animal = Animal()
//    animal.color = "color2"
//    animal.eat()
//}
//
//open class Animal {
//    var color: String = ""
//    fun eat(){
//        println("Eat")
//        println("4---------${this.color}")
//        println("5---------${color}")
//    }
//}
//
//class Dog: Animal(){
//    var breed: String = ""
//    fun bark(){
//        println("Bark")
//        println("1-----${this.color}")
//        println("2-----${this.breed}")
//        println("3-----$breed")
//    }
//}
//
//class Cat: Animal(){
//    var age: Int = -1
//    fun meow(){
//        println("Meow")
//    }
//}