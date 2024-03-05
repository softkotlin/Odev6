package com.free.odev6

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.free.odev6.databinding.IcerikItemBinding

class IcerikAdapter (var mContext: Context, var icerikListesi:List<Icerik>)
    : RecyclerView.Adapter<IcerikAdapter.IcerikTasarimTutucu>(){
    inner class IcerikTasarimTutucu(var tasarim:IcerikItemBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IcerikTasarimTutucu {
        val binding = IcerikItemBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return IcerikTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: IcerikTasarimTutucu, position: Int) {
        val icerik = icerikListesi.get(position)
        val t = holder.tasarim

        t.resim.setImageResource(
            mContext.resources.getIdentifier(icerik.resim,"drawable",mContext.packageName))

        t.aciklama.text = "${icerik.aciklama}"

    }

    override fun getItemCount(): Int {
        return icerikListesi.size
    }
}