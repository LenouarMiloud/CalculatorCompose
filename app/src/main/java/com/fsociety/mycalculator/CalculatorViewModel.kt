package com.fsociety.mycalculator

import android.util.Log
import androidx.lifecycle.ViewModel

class CalculatorViewModel : ViewModel() {

    fun onButtonClick(btn: String){
        Log.i("Clicked Button",btn)
    }



}