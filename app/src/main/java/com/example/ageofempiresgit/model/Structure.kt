package com.example.ageofempiresgit.model

class Structure(override val name: String, override val id: Int, val age: String ): AOEobject(name, id){
    override fun getInfo():String{
        return "This $name is a structure from the $age age"
    }
}