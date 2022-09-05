package com.qubitfaruk.citymarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.qubitfaruk.citymarkbook.databinding.ActivityDetailsBinding
import com.qubitfaruk.citymarkbook.databinding.ActivityMainBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val intent=intent
        val cityMark=intent.getSerializableExtra("cityMarkList") as CityMark

        binding.cityText.text=cityMark.cityName
        binding.name.text=cityMark.name
        binding.imageView.setImageResource(cityMark.image)

    }
}