package com.example.bakwash

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name = findViewById<EditText>(R.id.name)
        val password = findViewById<EditText>(R.id.password)
        val address = findViewById<EditText>(R.id.address)
        val button = findViewById<Button>(R.id.btn)

        button.setOnClickListener{
          val text =  password.text.toString()
            val address = address.text.toString()
            var numcount=0
            var capitalize=0
            for (i in text){
                for (j in 0..9){
                    if (i.toString()==j.toString()){
                        numcount++;
                    }
                  for (k in address){
                      for (l in 'A'..'Z'){
                       if (k.toString()==l.toString()){
                              capitalize++;
                          }
                      }
                  }
                }
            }
          if (numcount<=8){
                Toast.makeText(this, "plese enter Password in one number", Toast.LENGTH_SHORT).show()
            }
         else  if(capitalize <=1 ){
               Toast.makeText(this, "One Capital later in address", Toast.LENGTH_SHORT).show()
           }
            else{
                val intent= Intent(this,MainActivity2::class.java)
               startActivity(intent)
           }
        }



    }

}