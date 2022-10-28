package com.example.statemanagerexample.aFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.statemanagerexample.R
import com.example.statemanagerexample.Util.AuthGender
import com.example.statemanagerexample.databinding.FragmentABinding


class AFragment : Fragment() {


    private var _binding: com.example.statemanagerexample.databinding.FragmentABinding? = null
    private val binding  get() = _binding!!
    private lateinit var viewModel: AFragmentViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        _binding = FragmentABinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(requireActivity()).get(AFragmentViewModel::class.java)

        with(viewModel) {
            registerGenderPageViewStateLiveData.observe(viewLifecycleOwner) {
                with(binding) {
                    aFragmentViewstate = it
                    executePendingBindings()
                }
            }
        }

        handleViewOptions()

    }

    private fun handleViewOptions() {
        with(binding){
            cardViewMan.setOnClickListener { viewModel.onGenderSelected(authGender = AuthGender.MAN)
                val navigationController = Navigation.findNavController(it)
                navigationController.navigate(R.id.action_AFragment_to_BFragment)    }
            cardViewWoman.setOnClickListener { viewModel.onGenderSelected(authGender = AuthGender.WOMAN)
                val navigationController = Navigation.findNavController(it)
                navigationController.navigate(R.id.action_AFragment_to_BFragment)
            }

                }
    }
}