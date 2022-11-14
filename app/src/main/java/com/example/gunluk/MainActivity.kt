package com.example.gunluk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import androidx.fragment.app.Fragment
import com.example.gunluk.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(GunlukEkleFragment())

       binding.navid.setOnItemSelectedListener{

           when(it.itemId){
               R.id.im_home -> replaceFragment(GunlukEkleFragment())
               R.id.im_add -> replaceFragment(ListFragment())
               R.id.im_profile -> replaceFragment(Profile())

               else ->{

               }
           }
            true

       }

    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()

    }
}
