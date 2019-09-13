package com.example.ageofempiresgit.model

class Unit(override val name:String, override val id:Int, val description:String): AOEobject(name,id){
    override fun getInfo():String{
        return "This Unit is a $name, $description"
    }

}