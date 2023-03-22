package com.rabi.kudmi.rabindramodelview

import androidx.lifecycle.ViewModel

class MyViewModel(e:Int):ViewModel() {
    var a:Int = e;

     fun update()
    {
        a++;
    }
     fun get():Int
    {
        return  a;
    }
}