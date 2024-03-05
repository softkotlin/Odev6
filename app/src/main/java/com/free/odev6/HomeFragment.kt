package com.free.odev6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.free.odev6.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        val icerikListesi = ArrayList<Icerik>()
        val i1 = Icerik(1,"Market ve Su","rv1")
        val i2 = Icerik(2,"Oynadıkça Kazan","rv2")
        val i3 = Icerik(3,"Hemen Başvur","rv3")
        val i4 = Icerik(4,"Nike","rv4")
        val i5 = Icerik(5,"Ramazan Alışverişi","rv5")
        val i6 = Icerik(6,"Acale Et Kaçırma","rv6")
        val i7 = Icerik(7,"Hepsipay","rv7")
        val i8 = Icerik(8,"U.S. Polo Assn.","rv8")

        icerikListesi.add(i1)
        icerikListesi.add(i2)
        icerikListesi.add(i3)
        icerikListesi.add(i4)
        icerikListesi.add(i5)
        icerikListesi.add(i6)
        icerikListesi.add(i7)
        icerikListesi.add(i8)

        val icerikAdapter = IcerikAdapter(requireContext(),icerikListesi)
        binding.icerikRV.adapter = icerikAdapter

        binding.icerikRV.layoutManager =
            StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL)

        return binding.root
    }

}