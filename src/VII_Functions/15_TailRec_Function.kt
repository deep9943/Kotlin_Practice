package VII_Functions

import java.math.BigInteger

//use recursion in more optimized way
//        prevent stack overflow exception by saving memory
//use keyword "tailrec"

fun main(args: Array<String>){
    println(getFibonacciNumber(100, BigInteger("1"), BigInteger("0")))
    println(getFibonacciNumber(10000, BigInteger("1"),BigInteger("0")))
}

tailrec fun getFibonacciNumber(n: Int, a: BigInteger, b: BigInteger): BigInteger{
    if(n==0) return b
    else
        return getFibonacciNumber(n-1, a+b, a)
}