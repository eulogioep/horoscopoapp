package com.eulogioep.horoscopoapp.ui.horoscope.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.eulogioep.horoscopoapp.domain.model.HoroscopeInfo

class HoroscopeAdapter(private var horoscopeList: List<HoroscopeInfo> = emptyList()) :
    RecyclerView.Adapter<HoroscopeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HoroscopeViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = horoscopeList.size

    override fun onBindViewHolder(holder: HoroscopeViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}