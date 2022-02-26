package com.icanerdogan.daggerwithhiltintroduction

import com.google.gson.Gson
import javax.inject.Inject

class ClassExample
@Inject
// Burada Inject edilen kısım MyInterfaceten üreteilen sınıfın MyInterface olarak atanması
constructor(private val myInterfaceImplementor : MyInterface, private val gson : Gson)
{
    fun myFunction() : String{
        return "Working: ${myInterfaceImplementor.myPrintFunction()}"
    }
}