package com.example.ageofempiresgit

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ageofempiresgit.dummy.DummyContent
import com.example.ageofempiresgit.dummy.DummyContent.masterList
import com.example.ageofempiresgit.model.AOEobject
import com.example.ageofempiresgit.model.squire

import kotlinx.android.synthetic.main.activity_item_detail.*
import kotlinx.android.synthetic.main.item_detail.*
import kotlinx.android.synthetic.main.item_detail.view.*
import kotlinx.android.synthetic.main.item_detail.view.item_detail

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a [ItemListActivity]
 * in two-pane mode (on tablets) or a [ItemDetailActivity]
 * on handsets.
 */
class ItemDetailFragment : Fragment() {
    private lateinit var listener: OnFragmentOneInteractionListener
    /**
     * The dummy content this fragment is presenting.
     */
    private var item: AOEobject? = squire

    override fun onAttach(context: Context){
        super.onAttach(context)
        if(context is ItemDetailFragment.OnFragmentOneInteractionListener){
            listener = context}}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            if (it.containsKey(ARG_ITEM_ID)) {
                // Load the dummy content specified by the fragment
                // arguments. In a real-world scenario, use a Loader
                // to load content from a content provider.


                item = it.getSerializable(ARG_ITEM_ID) as? AOEobject

                val dff = it.getSerializable(ARG_ITEM_ID) as? AOEobject
                activity?.toolbar_layout?.let { layout ->
                    // TODO 11: S05M02-13 set up the item from the objec
                }
            }
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.item_detail, container, false)

        // Show the dummy content as text in a TextView.
        //item?.let {
            //rootView.item_detail.text = it.details
        //}

        return rootView
    }


    companion object {
        /**
         * The fragment argument representing the item ID that this fragment
         * represents.
         */
        const val ARG_ITEM_ID = "item_id"
    }


    interface OnFragmentOneInteractionListener{
        fun onFragOneInteraction(data: String)
    }
}

