package com.gastoncisneros.horoscopeapp.presentation.horoscope

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gastoncisneros.horoscopeapp.R
import com.gastoncisneros.horoscopeapp.databinding.FragmentHoroscopeBinding

class HoroscopeFragment : Fragment() {

    private var _bindig: FragmentHoroscopeBinding? = null;
    private val binding get() = _bindig!!;

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _bindig = FragmentHoroscopeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}