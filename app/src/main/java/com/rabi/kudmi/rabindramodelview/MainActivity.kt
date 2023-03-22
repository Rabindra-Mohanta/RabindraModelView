package com.rabi.kudmi.rabindramodelview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var textView:TextView;
    lateinit var myViewModel: MyViewModel;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
        myViewModel = ViewModelProvider(this,MyViewModelFactory(3)).get(MyViewModel::class.java)
        textView.setText(""+myViewModel.get()+"");
    }

    fun OnButtonClick(view: View) {

        setText();

    }
    private fun setText()
    {
        myViewModel.update()
        textView.setText(""+myViewModel.get()+"")
    }
}