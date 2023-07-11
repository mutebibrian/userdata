package com.kotlinseries.userdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.kotlinseries.userdata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        var u1:User = User(1,"Tom","123")

binding.apply {


   tvuser.setText(u1.id)
  tvuser.setText(u1.name)
  tvuser.setText(u1.pass)
}








    }
}