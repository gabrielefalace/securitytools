package com.rsk

class Calculator(val output: Result){
    fun  add(i: Int, i1: Int): Int {
        return i+i1
    }

}


interface Result {
    fun write(answer: Int)
}

class NullResult : Result {
    override fun write(answer: Int) {

    }
}