package VIII_OOP

//class can be abstract in nature
//        by default all abstract methods ae open in nature and also that methoda should not contain any body not even the curly braces
//        abstract methods can only be contain in a abstract class
//        abstract method properties should not be initiated
//        abstract method and properties need to be override in the derived class
//        you cannot create instance/objec of Abstract class
//role of abstract class is just to provide set of methods and properties
//abstract class are partially defined class


fun main(args: Array<String>){
    var indianObj = Indian()
}

abstract class Person{
    abstract var name: String
    abstract fun eat()
    open fun getHeight(){}
    fun goToSchool(){}
}

class Indian: Person(){
    override var name: String = "Deepanshu"
    override fun eat() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("working")
    }
}