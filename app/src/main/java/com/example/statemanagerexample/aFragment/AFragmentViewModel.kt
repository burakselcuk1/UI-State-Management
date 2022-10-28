package com.example.statemanagerexample.aFragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.statemanagerexample.Util.AuthGender

class AFragmentViewModel: ViewModel() {

    private val _registerGenderPageViewStateLiveData: MutableLiveData<AFragmentPageViewState> = MutableLiveData()

    val registerGenderPageViewStateLiveData: LiveData<AFragmentPageViewState> = _registerGenderPageViewStateLiveData

    init {
        _registerGenderPageViewStateLiveData.value = AFragmentPageViewState()
    }


    fun onGenderSelected(authGender: AuthGender) {
        _registerGenderPageViewStateLiveData.value = registerGenderPageViewStateLiveData.value?.copy(authGender = authGender)

    }

}