package br.com.ulbra.myapplication.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import br.com.ulbra.myapplication.databinding.FragmentCharactersBinding
import br.com.ulbra.myapplication.ui.adapter.CharacterAdapter
import br.com.ulbra.myapplication.ui.utils.Result
import br.com.ulbra.myapplication.ui.viewmodel.CharacterViewModel

class CharactersFragment : Fragment() {
    private lateinit var binding: FragmentCharactersBinding
    private lateinit var adapter: CharacterAdapter
    private val characterViewModel: CharacterViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCharactersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rc = binding.recyclerView
        adapter = CharacterAdapter()

        rc.adapter = adapter
        characterViewModel.characters.observe(viewLifecycleOwner) { result ->
            when(result) {
                is Result.Error -> println("error")
                Result.Loading -> {
                    binding.recyclerView.visibility = View.GONE
                    binding.loading.visibility = View.VISIBLE
                }
                is Result.Success -> {
                    adapter.submitList(result.data)
                    binding.recyclerView.visibility = View.VISIBLE
                    binding.loading.visibility = View.GONE
                }
            }
        }

    }
}