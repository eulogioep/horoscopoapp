package com.eulogioep.horoscopoapp.data.providers

import com.eulogioep.horoscopoapp.domain.model.HoroscopeInfo
import com.eulogioep.horoscopoapp.domain.model.HoroscopeInfo.*
import javax.inject.Inject

class HoroscopeProvider @Inject constructor(){
    fun getHoroscopes(): List<HoroscopeInfo> {
        return listOf(
            Aries,
            Taurus,
            Gemini,
            Cancer,
            Leo,
            Virgo,
            Libra,
            Scorpio,
            Sagittarius,
            Capricorn,
            Aquarius,
            Pisces
        )
    }

}