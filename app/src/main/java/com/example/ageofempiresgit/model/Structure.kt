package com.example.ageofempiresgit.model

class Structure( name: String, id: Int, isFavorite:Boolean ,val age: String ): AOEobject(name, id, isFavorite){
    override fun getInfo():String{
        return "This $name is a structure from the $age age"
    }
}