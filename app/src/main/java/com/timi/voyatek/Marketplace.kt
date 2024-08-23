package com.timi.voyatek

import android.graphics.Typeface
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.text.style.RelativeSizeSpan
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Marketplace : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marketplace)

//        val activitiesButton: Button = findViewById(R.id.activitiesButton)
//
//        // Retrieve string resources
//        val activitiesText: String = getString(R.string.activities_text)
//        val poppinsMedium: String = getString(R.string.poppins_medium)
//        val poppinsRegular: String = getString(R.string.poppins_regular)
//
//        // Create a SpannableString with the formatted text
//        val spannableString = SpannableString(activitiesText)
//
//        // Set span for the first line (poppins_medium, size 16sp)
//        spannableString.setSpan(TypefaceSpan(poppinsMedium), 0, 32, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
//        spannableString.setSpan(RelativeSizeSpan(1.2f), 0, 32, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE) // Increase size by 20%
//
//        // Set span for the second line (poppins_regular, size 12sp)
//        spannableString.setSpan(TypefaceSpan(poppinsRegular), 33, spannableString.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
//        spannableString.setSpan(RelativeSizeSpan(0.8f), 33, spannableString.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE) // Decrease size by 20%
//
//        // Set the formatted text to the button
//        activitiesButton.text = spannableString
//    }
}

//// Custom span class to apply typeface
//class TypefaceSpan(private val typefaceName: String) : TypefaceSpan("") {
//
//    override fun updateDrawState(ds: TextPaint) {
//        applyTypeface(ds)
//    }
//
//    override fun updateMeasureState(paint: TextPaint) {
//        applyTypeface(paint)
//    }
//
//    private fun applyTypeface(paint: Paint) {
//        val oldTypeface = paint.typeface
//        val newTypeface = Typeface.createFromAsset(paint.context.assets, typefaceName)
//        paint.typeface = newTypeface ?: oldTypeface
//    }
}
