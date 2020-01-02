//=============================================================function=====================================
//fun VII_Functions.main(args : Array<String>){
//    var nameOfPerson : String
//    nameOfPerson = "Deepanshu"
//    display(nameOfPerson)
//}
//
//fun display(name : String){
//    print(name)
//}



//========================================================function with class==========================================
//fun VII_Functions.main(args : Array<String>){
//    var obj = myClass()
//    obj.display("Deepanshu")
//}
//
//class myClass{
//    fun display(name : String){
//        print(name)
//    }
//}



//=======================================declaring variable value inside the VII_Functions.main function=============================
//fun VII_Functions.main(args : Array<String>){
//    var nameOfPerson: String
//    nameOfPerson = "Deepanshu"
//
//    var obj = myClass()
//    obj.display(nameOfPerson)
//}
//
//class myClass{
//    fun display(name : String){
//        print(name)
//    }
//}



//================================another way of declaring value but with the same variable name as mentioned in class=============================
//fun VII_Functions.main(args : Array<String>){
//    var obj = myClass()
//    obj.name = "Deepanshu"
//    obj.display(obj.name)
//}
//
//class myClass{
//    var name :String = ""
//    fun display(name : String){
//        print(name)
//    }
//}



//======================================string interpolation===================================================
//fun VII_Functions.main(args : Array<String>){
//    var obj = myClass()
//    obj.name = "Deep"
//
//    var num1 : Int = 1
//    var num2 : Int = 2
//
//    println("The value of the name is ${obj.name}....")
//    print("The sum of $num1 and $num2 is ${num1+num2}")
//}
//
//class myClass{
//    var name : String = ""
//}