package com.example.ageofempiresgit.model

class Civilization(   name:String,id:Int, isFavorite:Boolean, val expansion: String, val army_type:String): AOEobject(name, id, isFavorite){
    override fun getInfo():String{
        return "This is the $name civilization introduced in expansion: $expansion, they utilize a $army_type army type"
    }
}