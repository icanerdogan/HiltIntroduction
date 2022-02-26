package com.icanerdogan.daggerwithhiltintroduction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    // Bu şekilde kullanıldığında Field Injection olarak tanımlanıyor!
    @Inject
    lateinit var lars : Musician

    @Inject
    lateinit var myClass : ClassExample

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 2 Injection var : FieldInjection ve Constructor Injection

        lars.sing()

        // Hiçbir anottaion olmadığında MyInterface nereden initalize edilmediğini görmüyor
        println(myClass.myFunction())
    }
}

@AndroidEntryPoint
class FragmentExample : Fragment(){
    @Inject
    lateinit var kirk : Musician
}