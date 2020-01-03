package VIII_OOP


//interface is not a class it just a kind of service which should happen
//an interface contains normal as well as abstract method
//        what is defined in an interface is by default abstract in nature
//        therefore normal methods are public and open in nature not final
//        you cannot create instance of an interface also an interface does not have a constructor
//if there are two interface and one class is inheriting both interface and somehow both interface have same method name then it needs to be ob=verride in the derived class

fun main(args: Array<String>){
    var obj = myButton()
    obj.onTouch()
    obj.clicking()
    obj.sameMethod()
}

interface myInterfaceListener{
    var name: String
    fun onTouch()               //abstract method
    fun onClick(){              //normal method
        println("Optional that does not necessary to override")
    }
    fun clicking(){
        println("clicking from interface")
    }
    fun sameMethod(){
        println("from first interface")
    }
}

interface secondInterface{
    fun sameMethod(){
        println("from second interface")
    }
}

open class ExtraFeature{
    init {
        println("Extra feature from another class")
    }
}

class myButton:ExtraFeature(), myInterfaceListener, secondInterface{
    override var name: String = "Deepanshu"
    override fun onTouch() {
        println("compulsory to override this method")
    }

    override fun clicking() {
        super.clicking()
        println("clicking from derived class")
    }

    override fun sameMethod() {
        super<secondInterface>.sameMethod()
        println("same method from class")
    }
}