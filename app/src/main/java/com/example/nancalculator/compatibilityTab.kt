package com.example.nancalculator

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageButton
import android.widget.PopupWindow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class compatibilityTab : AppCompatActivity() {

    private lateinit var zodiacText: TextView
    private lateinit var titleText: TextView

    private lateinit var showPopupInstruct: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compatibility_tab)

        zodiacText = findViewById(R.id.zodiacTextView)
        titleText = findViewById(R.id.titleTextView)

        showPopupInstruct = findViewById(R.id.instructButton2)
        showPopupInstruct.setOnClickListener {
            showPopup()
        }

        val zodiac1 = intent.getStringExtra("zodiac1")
        val zodiac2 = intent.getStringExtra("zodiac2")

        val title = "$zodiac1 & $zodiac2"
        titleText.text = title

        val compatibilityText = when {
            zodiac1 == "Aries" && zodiac2 == "Aries" -> "50% Compatible"
            zodiac1 == "Aries" && zodiac2 == "Aquarius" -> "78% Compatible"
            zodiac1 == "Aries" && zodiac2 == "Cancer" -> "42% Compatible"
            zodiac1 == "Aries" && zodiac2 == "Capricorn" -> "47% Compatible"
            zodiac1 == "Aries" && zodiac2 == "Gemini" -> "83% Compatible"
            zodiac1 == "Aries" && zodiac2 == "Leo" -> "97% Compatible"
            zodiac1 == "Aries" && zodiac2 == "Libra" -> "85% Compatible"
            zodiac1 == "Aries" && zodiac2 == "Pisces" -> "67% Compatible"
            zodiac1 == "Aries" && zodiac2 == "Sagittarius" -> "93% Compatible"
            zodiac1 == "Aries" && zodiac2 == "Scorpio" -> "50% Compatible"
            zodiac1 == "Aries" && zodiac2 == "Taurus" -> "38% Compatible"
            zodiac1 == "Aries" && zodiac2 == "Virgo" -> "63% Compatible"

            zodiac1 == "Taurus" && zodiac2 == "Aries" -> "38% Compatible"
            zodiac1 == "Taurus" && zodiac2 == "Taurus" -> "65% Compatible"
            zodiac1 == "Taurus" && zodiac2 == "Gemini" -> "33% Compatible"
            zodiac1 == "Taurus" && zodiac2 == "Cancer" -> "97% Compatible"
            zodiac1 == "Taurus" && zodiac2 == "Leo" -> "73% Compatible"
            zodiac1 == "Taurus" && zodiac2 == "Virgo" -> "90% Compatible"
            zodiac1 == "Taurus" && zodiac2 == "Libra" -> "65% Compatible"
            zodiac1 == "Taurus" && zodiac2 == "Scorpio" -> "88% Compatible"
            zodiac1 == "Taurus" && zodiac2 == "Aquarius" -> "58% Compatible"
            zodiac1 == "Taurus" && zodiac2 == "Sagittarius" -> "30% Compatible"
            zodiac1 == "Taurus" && zodiac2 == "Capricorn" -> "98% Compatible"
            zodiac1 == "Taurus" && zodiac2 == "Pisces" -> "85% Compatible"

            zodiac1 == "Gemini" && zodiac2 == "Aries" -> "83% Compatible"
            zodiac1 == "Gemini" && zodiac2 == "Taurus" -> "33% Compatible"
            zodiac1 == "Gemini" && zodiac2 == "Gemini" -> "60% Compatible"
            zodiac1 == "Gemini" && zodiac2 == "Cancer" -> "65% Compatible"
            zodiac1 == "Gemini" && zodiac2 == "Leo" -> "88% Compatible"
            zodiac1 == "Gemini" && zodiac2 == "Virgo" -> "68% Compatible"
            zodiac1 == "Gemini" && zodiac2 == "Libra" -> "93% Compatible"
            zodiac1 == "Gemini" && zodiac2 == "Scorpio" -> "28% Compatible"
            zodiac1 == "Gemini" && zodiac2 == "Aquarius" -> "85% Compatible"
            zodiac1 == "Gemini" && zodiac2 == "Sagittarius" -> "60% Compatible"
            zodiac1 == "Gemini" && zodiac2 == "Capricorn" -> "68% Compatible"
            zodiac1 == "Gemini" && zodiac2 == "Pisces" -> "53% Compatible"

            zodiac1 == "Cancer" && zodiac2 == "Aries" -> "42% Compatible"
            zodiac1 == "Cancer" && zodiac2 == "Taurus" -> "97% Compatible"
            zodiac1 == "Cancer" && zodiac2 == "Gemini" -> "65% Compatible"
            zodiac1 == "Cancer" && zodiac2 == "Cancer" -> "75% Compatible"
            zodiac1 == "Cancer" && zodiac2 == "Leo" -> "35% Compatible"
            zodiac1 == "Cancer" && zodiac2 == "Virgo" -> "90% Compatible"
            zodiac1 == "Cancer" && zodiac2 == "Libra" -> "43% Compatible"
            zodiac1 == "Cancer" && zodiac2 == "Scorpio" -> "94% Compatible"
            zodiac1 == "Cancer" && zodiac2 == "Aquarius" -> "27% Compatible"
            zodiac1 == "Cancer" && zodiac2 == "Sagittarius" -> "53% Compatible"
            zodiac1 == "Cancer" && zodiac2 == "Capricorn" -> "83% Compatible"
            zodiac1 == "Cancer" && zodiac2 == "Pisces" -> "98% Compatible"

            zodiac1 == "Leo" && zodiac2 == "Aries" -> "97% Compatible"
            zodiac1 == "Leo" && zodiac2 == "Taurus" -> "73% Compatible"
            zodiac1 == "Leo" && zodiac2 == "Gemini" -> "88% Compatible"
            zodiac1 == "Leo" && zodiac2 == "Cancer" -> "35% Compatible"
            zodiac1 == "Leo" && zodiac2 == "Leo" -> "45% Compatible"
            zodiac1 == "Leo" && zodiac2 == "Virgo" -> "35% Compatible"
            zodiac1 == "Leo" && zodiac2 == "Libra" -> "97% Compatible"
            zodiac1 == "Leo" && zodiac2 == "Scorpio" -> "58% Compatible"
            zodiac1 == "Leo" && zodiac2 == "Aquarius" -> "68% Compatible"
            zodiac1 == "Leo" && zodiac2 == "Sagittarius" -> "93% Compatible"
            zodiac1 == "Leo" && zodiac2 == "Capricorn" -> "35% Compatible"
            zodiac1 == "Leo" && zodiac2 == "Pisces" -> "38% Compatible"

            zodiac1 == "Virgo" && zodiac2 == "Aries" -> "63% Compatible"
            zodiac1 == "Virgo" && zodiac2 == "Taurus" -> "90% Compatible"
            zodiac1 == "Virgo" && zodiac2 == "Gemini" -> "68% Compatible"
            zodiac1 == "Virgo" && zodiac2 == "Cancer" -> "90% Compatible"
            zodiac1 == "Virgo" && zodiac2 == "Leo" -> "35% Compatible"
            zodiac1 == "Virgo" && zodiac2 == "Virgo" -> "65% Compatible"
            zodiac1 == "Virgo" && zodiac2 == "Libra" -> "68% Compatible"
            zodiac1 == "Virgo" && zodiac2 == "Scorpio" -> "88% Compatible"
            zodiac1 == "Virgo" && zodiac2 == "Aquarius" -> "30% Compatible"
            zodiac1 == "Virgo" && zodiac2 == "Sagittarius" -> "48% Compatible"
            zodiac1 == "Virgo" && zodiac2 == "Capricorn" -> "95% Compatible"
            zodiac1 == "Virgo" && zodiac2 == "Pisces" -> "88% Compatible"

            zodiac1 == "Libra" && zodiac2 == "Aries" -> "85% Compatible"
            zodiac1 == "Libra" && zodiac2 == "Taurus" -> "65% Compatible"
            zodiac1 == "Libra" && zodiac2 == "Gemini" -> "93% Compatible"
            zodiac1 == "Libra" && zodiac2 == "Cancer" -> "43% Compatible"
            zodiac1 == "Libra" && zodiac2 == "Leo" -> "97% Compatible"
            zodiac1 == "Libra" && zodiac2 == "Virgo" -> "68% Compatible"
            zodiac1 == "Libra" && zodiac2 == "Libra" -> "75% Compatible"
            zodiac1 == "Libra" && zodiac2 == "Scorpio" -> "35% Compatible"
            zodiac1 == "Libra" && zodiac2 == "Aquarius" -> "90% Compatible"
            zodiac1 == "Libra" && zodiac2 == "Sagittarius" -> "73% Compatible"
            zodiac1 == "Libra" && zodiac2 == "Capricorn" -> "55% Compatible"
            zodiac1 == "Libra" && zodiac2 == "Pisces" -> "88% Compatible"

            zodiac1 == "Scorpio" && zodiac2 == "Aries" -> "50% Compatible"
            zodiac1 == "Scorpio" && zodiac2 == "Taurus" -> "88% Compatible"
            zodiac1 == "Scorpio" && zodiac2 == "Gemini" -> "28% Compatible"
            zodiac1 == "Scorpio" && zodiac2 == "Cancer" -> "94% Compatible"
            zodiac1 == "Scorpio" && zodiac2 == "Leo" -> "58% Compatible"
            zodiac1 == "Scorpio" && zodiac2 == "Virgo" -> "88% Compatible"
            zodiac1 == "Scorpio" && zodiac2 == "Libra" -> "35% Compatible"
            zodiac1 == "Scorpio" && zodiac2 == "Scorpio" -> "80% Compatible"
            zodiac1 == "Scorpio" && zodiac2 == "Aquarius" -> "73% Compatible"
            zodiac1 == "Scorpio" && zodiac2 == "Sagittarius" -> "28% Compatible"
            zodiac1 == "Scorpio" && zodiac2 == "Capricorn" -> "95% Compatible"
            zodiac1 == "Scorpio" && zodiac2 == "Pisces" -> "97% Compatible"

            zodiac1 == "Aquarius" && zodiac2 == "Aries" -> "78% Compatible"
            zodiac1 == "Aquarius" && zodiac2 == "Taurus" -> "58% Compatible"
            zodiac1 == "Aquarius" && zodiac2 == "Gemini" -> "85% Compatible"
            zodiac1 == "Aquarius" && zodiac2 == "Cancer" -> "27% Compatible"
            zodiac1 == "Aquarius" && zodiac2 == "Leo" -> "68% Compatible"
            zodiac1 == "Aquarius" && zodiac2 == "Virgo" -> "30% Compatible"
            zodiac1 == "Aquarius" && zodiac2 == "Libra" -> "90% Compatible"
            zodiac1 == "Aquarius" && zodiac2 == "Scorpio" -> "73% Compatible"
            zodiac1 == "Aquarius" && zodiac2 == "Aquarius" -> "45% Compatible"
            zodiac1 == "Aquarius" && zodiac2 == "Sagittarius" -> "90% Compatible"
            zodiac1 == "Aquarius" && zodiac2 == "Capricorn" -> "68% Compatible"
            zodiac1 == "Aquarius" && zodiac2 == "Pisces" -> "45% Compatible"

            zodiac1 == "Sagittarius" && zodiac2 == "Aries" -> "93% Compatible"
            zodiac1 == "Sagittarius" && zodiac2 == "Taurus" -> "30% Compatible"
            zodiac1 == "Sagittarius" && zodiac2 == "Gemini" -> "60% Compatible"
            zodiac1 == "Sagittarius" && zodiac2 == "Cancer" -> "53% Compatible"
            zodiac1 == "Sagittarius" && zodiac2 == "Leo" -> "93% Compatible"
            zodiac1 == "Sagittarius" && zodiac2 == "Virgo" -> "48% Compatible"
            zodiac1 == "Sagittarius" && zodiac2 == "Libra" -> "73% Compatible"
            zodiac1 == "Sagittarius" && zodiac2 == "Scorpio" -> "28% Compatible"
            zodiac1 == "Sagittarius" && zodiac2 == "Aquarius" -> "90% Compatible"
            zodiac1 == "Sagittarius" && zodiac2 == "Sagittarius" -> "45% Compatible"
            zodiac1 == "Sagittarius" && zodiac2 == "Capricorn" -> "60% Compatible"
            zodiac1 == "Sagittarius" && zodiac2 == "Pisces" -> "63% Compatible"

            zodiac1 == "Capricorn" && zodiac2 == "Aries" -> "47% Compatible"
            zodiac1 == "Capricorn" && zodiac2 == "Taurus" -> "98% Compatible"
            zodiac1 == "Capricorn" && zodiac2 == "Gemini" -> "68% Compatible"
            zodiac1 == "Capricorn" && zodiac2 == "Cancer" -> "83% Compatible"
            zodiac1 == "Capricorn" && zodiac2 == "Leo" -> "35% Compatible"
            zodiac1 == "Capricorn" && zodiac2 == "Virgo" -> "95% Compatible"
            zodiac1 == "Capricorn" && zodiac2 == "Libra" -> "55% Compatible"
            zodiac1 == "Capricorn" && zodiac2 == "Scorpio" -> "95% Compatible"
            zodiac1 == "Capricorn" && zodiac2 == "Aquarius" -> "68% Compatible"
            zodiac1 == "Capricorn" && zodiac2 == "Sagittarius" -> "60% Compatible"
            zodiac1 == "Capricorn" && zodiac2 == "Capricorn" -> "75% Compatible"
            zodiac1 == "Capricorn" && zodiac2 == "Pisces" -> "88% Compatible"

            zodiac1 == "Pisces" && zodiac2 == "Aries" -> "67% Compatible"
            zodiac1 == "Pisces" && zodiac2 == "Taurus" -> "85% Compatible"
            zodiac1 == "Pisces" && zodiac2 == "Gemini" -> "53% Compatible"
            zodiac1 == "Pisces" && zodiac2 == "Cancer" -> "98% Compatible"
            zodiac1 == "Pisces" && zodiac2 == "Leo" -> "38% Compatible"
            zodiac1 == "Pisces" && zodiac2 == "Virgo" -> "88% Compatible"
            zodiac1 == "Pisces" && zodiac2 == "Libra" -> "88% Compatible"
            zodiac1 == "Pisces" && zodiac2 == "Scorpio" -> "97% Compatible"
            zodiac1 == "Pisces" && zodiac2 == "Aquarius" -> "45% Compatible"
            zodiac1 == "Pisces" && zodiac2 == "Sagittarius" -> "63% Compatible"
            zodiac1 == "Pisces" && zodiac2 == "Capricorn" -> "88% Compatible"
            zodiac1 == "Pisces" && zodiac2 == "Pisces" -> "60% Compatible"



            else -> "Compatibility information not available."
        }
        zodiacText.text = compatibilityText

    }

    fun onHomeButtonClick (view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun showPopup() {
        val inflater = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val popupView = inflater.inflate(R.layout.activity_instructions_tab2, null)

        val width = 1000
        val height = 1000

        val instructWindow = PopupWindow(popupView, width, height, true)
        instructWindow.showAtLocation(popupView, Gravity.CENTER, 0, 0)

    }
}