//fun VII_Functions.main(args : Array<String>){
//    val x = 2
//    when(x){
//        0, 1 -> println("x value is or 1")
//        2 -> {
//            println("x value is 2")
//            println("yes")
//        }
//        else ->{
//            println("x value is unknown")
//            println("even I don't know it's value")
//        }
//    }
//}



//=======================================range in when statement====================================================
//fun VII_Functions.main(args : Array<String>){
//    val x = 12
//    when(x){
//        !in 1..20 -> println("x value is or 1")
//        in 1..20 -> {
//            println("x value is 2")
//            println("yes")
//        }
//        else ->{
//            println("x value is unknown")
//            println("even I don't know it's value")
//        }
//    }
//}



//===================================when as an expression====================================================
//fun VII_Functions.main(args : Array<String>){
//    val x = 3
//    var str : String = when(x){
//        1 -> "x is 1"
//        2 -> "x is 2"
//        else -> {
//            "x is unknown"
//            "still not found"
//        }
//    }
//    println(str)
//}