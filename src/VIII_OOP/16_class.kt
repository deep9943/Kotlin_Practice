package VIII_OOP

//fun main(args: Array<String>){
//    var obj = Student()
//    obj.name = "Deep"
//    println("Student name is ${obj.name}")
//}
//
//class Student{
//    //properties
//    var name: String = "Deepanshu"
//
//    //executed immediate after "obj" creation means object creation above in main function
//    init {
//        println("Student name is $name")
//    }
//}



//=======================================================making constructor


//fun main(args: Array<String>){
//    var obj = Student("Deepanshu")
//}
//
////class Student constructor(name: String){
////    init {
////        println("Student name is $name")
////    }
////}
//
////no statement ca be written outside the init only inside init
//class Student(name: String){
//    init {
//        println("Student name is $name")
//    }
//}


//===================================================================


//fun main(args: Array<String>){
//    var obj = Student("Deepanshu")
//}
//
////class Student(_name: String){
////    var name: String = "Deep"
////    init {
////        println("Name is ${this.name}")
////        this.name = _name
////        println("Name is $name")
////    }
////}
//
//class Student(var _name: String = "Deep"){
//    init {
//        println("Name is $_name")
//        this._name = "Deep"
//        println("Name is $_name")
//    }
//}