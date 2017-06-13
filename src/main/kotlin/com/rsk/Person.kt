package com.rsk

interface Signatory {
    fun sign()
}


class Person(val name: String, var age: Int) : Signatory {
    override fun sign() = println("$name can sign documents at the age of $age")
}

fun main(args: Array<String>) {
    val p = Person("John", 33)
    p.sign()
}