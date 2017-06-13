package com.rsk

interface Signatory {
    fun sign()
}


open class Person(val name: String, var age: Int, var isMarried: Boolean = false) : Signatory {

    // var isMarried = false

    // secondary constructor - calls the primary constructor
    // constructor(name: String, age: Int, isMarried: Boolean) : this(name, age) {
    //     this.isMarried = isMarried
    // }

    companion object {
        @JvmStatic
        fun staticall() {
            println("static stuff")
        }
    }


    override fun sign() = println("$name can sign documents at the age of $age")
}

class Student(name: String, age: Int) : Person(name, age) {
    init {
        if (name == "Jack" && age < 34) throw Exception("invalid age")
    }
}

data class User(val name: String, val id: Int)

fun main(args: Array<String>) {
    val p = Person("John", 33)
    p.sign()
    p.isMarried = true
    println("The person's name is ${p.name}")

    val kevin = User("Kevin", 1)
    println(kevin)

    // deconstruction for "data" objects
    val (name, id) = kevin
    println("Name was $name and id $id")

    // copying but modifying the id
    val otherUser = kevin.copy(id = 2)

    println(otherUser)

}