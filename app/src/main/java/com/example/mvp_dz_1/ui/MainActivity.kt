package com.example.mvp_dz_1.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mvp_dz_1.R
import com.example.mvp_dz_1.databinding.ActivityMainBinding
import com.example.mvp_dz_1.presenter.BTN_1
import com.example.mvp_dz_1.presenter.BTN_2
import com.example.mvp_dz_1.presenter.BTN_3
import com.example.mvp_dz_1.presenter.Presenter

class MainActivity : AppCompatActivity() , UiInterface {

    private lateinit var binding : ActivityMainBinding
    private val presenter = Presenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listener = View.OnClickListener {
            when(it.id){
                R.id.buttonCounter1 -> {
                    presenter.counterClick(BTN_1)
                }
                R.id.buttonCounter2 -> {
                    presenter.counterClick(BTN_2)
                }
                R.id.buttonCounter3 -> {
                    presenter.counterClick(BTN_3)
                }
            }
        }

        binding.buttonCounter1.setOnClickListener(listener)
        binding.buttonCounter2.setOnClickListener(listener)
        binding.buttonCounter3.setOnClickListener(listener)
    }

    override fun setText(text: String) {
        when(2){
            0 -> binding.buttonCounter1.text = text
            1 -> binding.buttonCounter2.text = text
            2 -> binding.buttonCounter3.text = text
        }
    }
}