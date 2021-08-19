package com.example.age_experi

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        health.setOnClickListener {
            val intent = Intent(this, healthTips::class.java)
            startActivity(intent)
        }
    }

    fun openDateTimePicker(view: View) {
        var c=Calendar.getInstance()


        DatePickerDialog(this, DatePickerDialog.OnDateSetListener{datePicker, yy,mm, dd ->
            var dt ="$dd/${mm+1}/$yy"
            TimePickerDialog(this, TimePickerDialog.OnTimeSetListener{timePicker, hh ,mi ->
                dt += "  $hh:$mi"
                editTextTextPersonName.setText(dt)
            },  c.get(Calendar.HOUR) , c.get(Calendar.MINUTE),false ).show()


        },
                c.get(Calendar.YEAR),c.get(Calendar.MONTH),c.get(Calendar.DAY_OF_MONTH)).show()



    }

    fun calculateAge(view: View) {
        var today=Date()
        var dobs= editTextTextPersonName.text.toString()
        var sdf = SimpleDateFormat("dd/MM/yyyy HH:mm")
        var dob = sdf.parse(dobs)

        var yesrs = ((today.time - dob.time)/86400000)/365
        var mth = ((today.time - dob.time)/86400000)/30
        var days = (today.time - dob.time)/86400000
        var hours =(today.time - dob.time)%86400000/3600000
        var minutes = (today.time - dob.time)%86400000%3600000/60000
        var sec = (today.time - dob.time)%86400000%3600000%60000/1000

        textView3.visibility = View.VISIBLE
        textView3.setText("Years = $yesrs\nMonths = $mth\nDays = $days\nHours = $hours\nMinutes = $minutes\nSeconds = $sec")

    }
}