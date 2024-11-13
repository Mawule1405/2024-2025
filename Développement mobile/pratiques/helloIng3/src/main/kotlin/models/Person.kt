package models

class Person(val name : String, val city : String, val age : Int ) {

    fun PersonToString(){
        println("Person(name= ${this.name}  , city= ${this.city} , age= ${this.age})");
    }

}