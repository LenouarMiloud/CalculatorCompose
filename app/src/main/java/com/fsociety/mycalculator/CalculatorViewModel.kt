package com.fsociety.mycalculator

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculatorViewModel : ViewModel() {

    //this is a variable for entering data
    private val _equationText = MutableLiveData("")
    val equationText : LiveData<String> = _equationText

    //variable to show the result
    private val _resultText = MutableLiveData("0")
    val resultText : LiveData<String> = _resultText

    fun onButtonClick(btn: String){
        Log.i("Clicked Button",btn)
        //make the logic of the calculator
        _equationText.value?.let {
            if(btn == "AC"){
                _equationText.value = ""
                _resultText.value = ""
            }
            if(btn == "C"){
                if(it.isNotEmpty()){
                    _equationText.value = it.substring(0,it.length-1)
                    return
                }
            }
            if(btn == "="){
                _equationText.value = _resultText.value
            }
            _equationText.value = it+btn

            //Calculte the result
            Log.i("Equation",_equationText.value.toString())

        }
    }
}
















