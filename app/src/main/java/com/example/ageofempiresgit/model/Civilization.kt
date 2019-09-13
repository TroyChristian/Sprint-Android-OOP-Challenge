package com.example.ageofempiresgit.model

class Civilization( override val  name:String, override val  id:Int, val expansion: String, val army_type:String): AOEobject(name, id){
    override fun getInfo():String{
        return "This is the $name civilization introduced in expansion: $expansion, they utilize a $army_type army type"
    }
}