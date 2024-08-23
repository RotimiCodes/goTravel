package com.timi.voyatek

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import java.util.Calendar

class Activities : AppCompatActivity(), DatePickerDialog.OnDateSetListener {

    private var number = 0
    private lateinit var selectedDateTextView: TextView
    private lateinit var selectedDateTextView2: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_activities)



        selectedDateTextView = findViewById(R.id.selected_date_textView)
        selectedDateTextView2 = findViewById(R.id.selected_date_to)



        val actvBtn: Button = findViewById(R.id.back_btn)
        actvBtn.setOnClickListener {
            navigateToMarketPlace()
        }

        val searchBtn: Button = findViewById(R.id.search_destination)
        searchBtn.setOnClickListener {
            navigateToDest()
        }

        val subtract_btn: Button = findViewById(R.id.subtract_btn)
        subtract_btn.setOnClickListener {
            if (number > 0) { // Ensure number is not negative
                number-- // Decrease the number by 1
                updateNumberTextView() // Update the number TextView
            }
        }

        val add_btn: Button = findViewById(R.id.add_btn)
        add_btn.setOnClickListener {
            number++ // Increase the number by 1
            updateNumberTextView() // Update the number TextView
        }


        val add_btn2: Button = findViewById(R.id.add_btn_two)
        add_btn2.setOnClickListener {
            number++ // Increase the number by 1
            updateNumberTextView2() // Update the number TextView
        }

        val subtract_btn2: Button = findViewById(R.id.subtract_btn_two)
        subtract_btn2.setOnClickListener {
            if (number > 0) { // Ensure number is not negative
                number-- // Decrease the number by 1
                updateNumberTextView2() // Update the number TextView
            }
        }

        val selectStartDateButton: Button = findViewById(R.id.start_date)
        selectStartDateButton.setOnClickListener {
            showDatePickerDialogForStartDate()
        }

        val selectEndDateButton: Button = findViewById(R.id.end_date)
        selectEndDateButton.setOnClickListener {
            showDatePickerDialogForEndDate()
        }

        


    }

    private fun showDatePickerDialogForStartDate() {
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(this, this, year, month, day)
        datePickerDialog.show()
    }

    private fun showDatePickerDialogForEndDate() {
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { _, year, monthOfYear, dayOfMonth ->
            val selectedDate = "$dayOfMonth/${monthOfYear + 1}/$year"
            selectedDateTextView2.text = selectedDate
        }, year, month, day)
        datePickerDialog.show()
    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        val selectedDate = "$dayOfMonth/${month + 1}/$year"
        selectedDateTextView.text = selectedDate
    }

//    fun onDateSet2(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
//        // Handle the selected date here
//        val selectedDate = "$dayOfMonth/${month + 1}/$year"
//        selectedDateTextView2.text = "$selectedDate" // Update TextView with selected date
//    }



    // Function to update the number TextView with the current value of the number variable
    private fun updateNumberTextView() {
        val number_textView: TextView = findViewById(R.id.number_textView)
        number_textView.text = number.toString()
    }

    private fun updateNumberTextView2() {
        val number_textView2: TextView = findViewById(R.id.number_textView2)
        number_textView2.text = number.toString()
    }



    private fun navigateToMarketPlace() {
        val intent = Intent(this, Home::class.java)
        startActivity(intent)
    }


    private fun navigateToDest() {
        val intent2 = Intent(this, Destination::class.java)
        startActivity(intent2)
    }
}