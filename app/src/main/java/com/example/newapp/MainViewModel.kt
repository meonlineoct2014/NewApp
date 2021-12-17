package com.example.newapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MainViewModel : ViewModel() {
     var quoteTex =  MutableLiveData("This is default text")

    fun setQuote() {
        quoteTex.value = generateQuote()
    }

    fun generateQuote() = "The Lucky number is " + Random.nextInt()
}