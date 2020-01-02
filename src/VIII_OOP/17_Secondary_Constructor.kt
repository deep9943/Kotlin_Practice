package VIII_OOP

//need to call the primary constructor explicitly in the secondary constructor
//parameter written in secondary constructor are not part of the properties of the class by default but we can make it
//you can not declare variable i.e.-var or val while declaring parameter for the secondary constructor
//you can not use the properties defined by the secondary constructor inside the init block
//the body of the secondary constructor is call after init block

fun main(args: Array<String>){
    var obj1 = Student("Deep", 9)
    var obj2 = Student(10)
    println(obj1.id)
    println(obj2.name)
}

class Student(var name: String){
    var id: Int = -1
    init {
        println("Name is $name and id is $id")
    }

    constructor(str: String, id: Int): this(str){
        this.id = id
    }

    constructor(id: Int): this("Deepanshu"){
        this.id = id
    }
}