package org.d3if4090.myapplication


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class SegitigaFragment : Fragment() {


    class RulesFragment : Fragment() {
        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                                  savedInstanceState: Bundle?): View? {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.segitiga, container, false)
        }
    }
}
