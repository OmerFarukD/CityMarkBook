package com.qubitfaruk.citymarkbook

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.qubitfaruk.citymarkbook.databinding.RecyclerRowBinding

class CityMarkAdaptor(val cityMarkList: ArrayList<CityMark>):RecyclerView.Adapter<CityHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityHolder {
        val binding=RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CityHolder(binding)
    }

    override fun onBindViewHolder(holder: CityHolder, position: Int) {
       holder.binding.recyclerRowTextView.text=cityMarkList.get(position).name

        holder.itemView.setOnClickListener{
            val intent=Intent(holder.itemView.context,DetailsActivity::class.java)
            intent.putExtra("cityMarkList",cityMarkList.get(position))
            holder.itemView.context.startActivity(intent)

        }
    }

    override fun getItemCount(): Int {
        return cityMarkList.size
    }
}