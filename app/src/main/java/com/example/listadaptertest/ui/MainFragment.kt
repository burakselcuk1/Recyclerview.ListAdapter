package com.example.listadaptertest.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.listadaptertest.R
import com.example.listadaptertest.adapter.MyAdapter
import com.example.listadaptertest.databinding.FragmentMainBinding
import com.example.listadaptertest.model.ItemType
import com.example.listadaptertest.model.ListItem


class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    private val myAdapter = MyAdapter()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerView.adapter = myAdapter

        val items = listOf(
            ListItem("1", "Item 1", ItemType.TYPE_ONE),
            ListItem("2", "Item 2", ItemType.TYPE_THREE),
            ListItem("3", "Item 3", ItemType.TYPE_ONE),
            ListItem("4", "Item 4", ItemType.TYPE_TWO),
            ListItem("5", "Item 4", ItemType.TYPE_THREE)
        )

        myAdapter.submitList(items)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    }

