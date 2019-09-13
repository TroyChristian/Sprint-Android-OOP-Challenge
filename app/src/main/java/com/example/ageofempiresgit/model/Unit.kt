package com.example.ageofempiresgit.model

class Unit( name:String,  id:Int, isFavorite:Boolean, val description:String, val armor:String): AOEobject(name,id, isFavorite){
    override fun getInfo():String{
        return "This Unit is a $name, $description"
    }

}