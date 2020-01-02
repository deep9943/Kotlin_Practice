//=================================if as an expression=====================================================
fun main(args : Array<String>){
    val a = 2
    val b = 4
    var greater : Int = if (a>b){
                            println("a is greater")
                            a
                        }else{
                            println("b is greater")
                            b
                        }

    print(greater)
}