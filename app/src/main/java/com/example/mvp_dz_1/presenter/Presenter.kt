package com.example.mvp_dz_1.presenter

import com.example.mvp_dz_1.model.Model
import com.example.mvp_dz_1.ui.UiInterface

const val BTN_1 = "bt1"
const val BTN_2 = "bt2"
const val BTN_3 = "bt3"

class Presenter(private val view : UiInterface) {
    private val model = Model()

    fun counterClick(bt: String){
        when(bt){
            BTN_1 -> {
                val nextValue = model.returnString()
                view.setText(nextValue)
            }
            BTN_2 -> {
                val nextValue = model.returnString()
                view.setText(nextValue)
            }
            BTN_3 -> {
                val nextValue = model.returnString()
                view.setText(nextValue)
            }
        }
    }

}