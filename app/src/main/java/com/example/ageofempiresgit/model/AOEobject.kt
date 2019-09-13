package com.example.ageofempiresgit.model

import java.io.Serializable

abstract class  AOEobject(
    open val name:String? = null, open val id: Int, open var isFavorite: Boolean = false
):Serializable{
    open fun getInfo(): String?{
        return "This object is from age of Empires its called a $name"

    }
}

/*
class Civilization(   name:String,id:Int, isFavorite:Boolean val expansion: String, val army_type:String): AOEobject(name, id){
    override fun getInfo():String{
        return "This is the $name civilization introduced in expansion: $expansion, they utilize a $army_type army type"
    }
}\*

 */

var Frank = Civilization("Franks", 6, false, "Age of Kings", "Cavalry")
var Hun = Civilization("Huns", 8, false, "The Conquerors", "Cavalry")

//name, id, age:string
var lumberCamp = Structure("Lumber Camp", 6,  false, "Dark")
var miningCamp = Structure("Mining Camp", 8, false, "Dark")

//name id, cost: int, resource:string

var squire = Technology("Squires", 11, false, 200, "food")
var champion = Technology("Champion", 12, false, 750, "food")

//name, id, isfavorite, description, armor

var trebuchet = Unit("Trebuchet", 22, false,  "Powerful siege weapon used to destroy buildings and walls from long distance. Cannot fire on close units. Must be packed to move and unpacked to attack. Can cut paths through forests. Unpack time: 0:11", "1/150")
var cannonGalleon = Unit("Cannon Galleon", 24, false,"Long-range warship used to attack targets on shore to establish beachhead. Fires slowly and has minimum range",
    "0/6")

val empireObjects = listOf(Frank, Hun, lumberCamp, miningCamp, squire, champion, trebuchet, cannonGalleon)
