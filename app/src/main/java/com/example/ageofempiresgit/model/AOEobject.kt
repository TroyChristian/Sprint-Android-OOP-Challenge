package com.example.ageofempiresgit.model

import java.io.Serializable

abstract class  AOEobject(
    open val name:String? = null, open val id: Int
):Serializable{
    open fun getInfo(): String?{
        return "This object is from age of Empires its called a $name"

    }
}