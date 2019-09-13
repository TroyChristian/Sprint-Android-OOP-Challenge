package com.example.ageofempiresgit.model

class Technology(name:String, id:Int, isFavorite:Boolean, val cost: Int, val resource: String): AOEobject(name, id, isFavorite){
    override fun getInfo(): String{
    return "This $name cost $cost of $resource to build"}
}