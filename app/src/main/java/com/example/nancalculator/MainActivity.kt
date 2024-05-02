package com.example.nancalculator

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.ImageButton
import android.widget.PopupWindow
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private lateinit var v1: AutoCompleteTextView
    private lateinit var v2: AutoCompleteTextView

    private lateinit var showPopupInstruct: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showPopupInstruct = findViewById(R.id.instructButton2)
        showPopupInstruct.setOnClickListener {
            showPopup()
        }

        v1 = findViewById(R.id.v1)
        v2 = findViewById(R.id.v2)
        val signs = arrayListOf("Aries", "Aquarius", "Cancer", "Capricorn", "Gemini", "Leo", "Libra", "Pisces", "Sagittarius", "Scorpio", "Taurus", "Virgo")
        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, signs)
        v1.setAdapter(adapter)
        v2.setAdapter(adapter)

    }

    private fun showPopup() {
        val inflater = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val popupView = inflater.inflate(R.layout.activity_instructions_tab, null)

        val width = 1000
        val height = 1000

        val instructWindow = PopupWindow(popupView, width, height, true)
        instructWindow.showAtLocation(popupView, Gravity.CENTER, 0, 0)
    }

    fun onConfirmButton(view: View) {
        val zoomInAnimation = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
        view.startAnimation(zoomInAnimation)

        val selectedZodiac1 = v1.text.toString()
        val selectedZodiac2 = v2.text.toString()

        if (selectedZodiac1.isEmpty() && selectedZodiac2.isEmpty()) {
            Toast.makeText(this, "No Signs detected", Toast.LENGTH_SHORT).show()
        } else if (selectedZodiac1.isEmpty() or selectedZodiac2.isEmpty()) {
            Toast.makeText(this, "Please fill out both entry fields", Toast.LENGTH_SHORT).show()
        } else {
            val intent = Intent(this, compatibilityTab::class.java).apply {
                putExtra("zodiac1", selectedZodiac1)
                putExtra("zodiac2", selectedZodiac2)
            }
        startActivity(intent)
        }
    }
}