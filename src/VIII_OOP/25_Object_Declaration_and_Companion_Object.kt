package VIII_OOP

//we have just one instance of a class in whole application
//        if a class Student is declared singleton then we cannot create objects for this class
//        there exists only one object for this class by default
//in java it is "static" but in kotlin it is "object"
//it cannot have a constructor

//fun main(args: Array<String>){
//    CustomerData.count = 99
//    println(CustomerData.count)
//
//    println(CustomerData.typeOfCustomer())
//
//    CustomerData.myMethod("Deepanshu")
//}
//
//open class mySuperClass{
//    open fun myMethod(str: String){
//        println("Super Class")
//    }
//}
//
//object CustomerData: mySuperClass(){
//    var count: Int = 1                          //behave like static
//
//    fun typeOfCustomer(): String{               //behave like static
//        return "Indian"
//    }
//
//    override fun myMethod(str: String) {
//        super.myMethod(str)
//        println("CustomerData--$str")
//    }
//}