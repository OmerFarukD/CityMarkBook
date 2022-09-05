package com.qubitfaruk.citymarkbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.qubitfaruk.citymarkbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var cityMarkList: ArrayList<CityMark>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val arslantepe=CityMark("Arslantepe Höyüğü","Malatya",R.drawable.arslantepe)
        val nemrut=CityMark("Nemrut Dağı","Adıyaman",R.drawable.nemrut)
        val gobekliTepe=CityMark("Göbekli Tepe","Şanlıurfa", R.drawable.gobeklitepe)

        val intent=Intent(this@MainActivity,DetailsActivity::class.java)
        cityMarkList=ArrayList<CityMark>()

        cityMarkList.add(arslantepe)
        cityMarkList.add(nemrut)
        cityMarkList.add(gobekliTepe)
        intent.putExtra("cityMarkList",cityMarkList)
        binding.recyclerView.layoutManager=LinearLayoutManager(this)
        val cityMarkAdaptor=CityMarkAdaptor(cityMarkList)
        binding.recyclerView.adapter=cityMarkAdaptor
    }
}