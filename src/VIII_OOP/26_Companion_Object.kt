package VIII_OOP

//campanion objects are same as "object" but declared within a class

fun main(args: Array<String>){
    println(myClass.count)
    println(myClass.typeOfCustomer())
}

class myClass{
    companion object{
        var count: Int = 1                          //behave like static
        fun typeOfCustomer(): String{               //behave like static
            return "Indian"
        }
    }
}