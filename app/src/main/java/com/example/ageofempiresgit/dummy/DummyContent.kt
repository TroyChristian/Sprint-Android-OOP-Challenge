package com.example.ageofempiresgit.dummy

import com.example.ageofempiresgit.model.AOEobject
import com.example.ageofempiresgit.model.empireObjects
import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object AOEobject {

    /**
     * An array of sample (dummy) items.
     */
    val ITEMS = empireObjects

    /**
     * A map of sample (dummy) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, AOEobject> = HashMap()

    private val COUNT = 25

    init {
        // Add some sample items.
        for (i in 1..COUNT) {
            addItem(createAOEobjectitem(i))
        }
    }

    private fun addItem(item: AOEobject) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id.toString(), item)
    }

    private fun createDummyItem(position: Int): DummyItem {
        return DummyItem(position.toString(), "Item " + position, makeDetails(position))
    }

    private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
        builder.append("Details about Item: ").append(position)
        for (i in 0..position - 1) {
            builder.append("\nMore details information here.")
        }
        return builder.toString()
    }

    /**
     * A dummy item representing a piece of content.
     */
    /*data class DummyItem(val id: String, val content: String, val details: String) {
        override fun toString(): String = content*/
    }
//}
