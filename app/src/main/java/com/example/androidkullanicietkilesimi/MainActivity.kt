package com.example.androidkullanicietkilesimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import android.widget.Toast
import com.example.androidkullanicietkilesimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonNormal.setOnClickListener(){
            Toast.makeText(this@MainActivity,"Normal mesaj",Toast.LENGTH_LONG).show()
        }
        binding.buttonOzel.setOnClickListener(){
            val tasarim = layoutInflater.inflate(R.layout.toast_tasarim,null)
            val mesaj= tasarim.findViewById(R.id.textViewMesaj) as TextView
             mesaj.text = "Özel Mesaj"
            val toastOzel =Toast(applicationContext)
            toastOzel.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.CENTER_VERTICAL,0,0)
            toastOzel.duration= Toast.LENGTH_LONG
            toastOzel.show()
        }

    }
}