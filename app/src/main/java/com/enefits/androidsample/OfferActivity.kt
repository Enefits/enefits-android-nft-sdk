package com.enefits.androidsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.enefits.androidsample.databinding.ActivityOffersBinding

class OfferActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOffersBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOffersBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar!!.hide()

        binding.ivBack.setOnClickListener {
            onBackPressed()
        }

        val offers  = intent.getStringExtra("offers")
        if (offers != null){
            binding.tvOffers.text = offers
        }
    }
}
