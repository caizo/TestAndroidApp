package com.example.saludapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.saludapp.databinding.SouthParkCharacterBinding
import com.squareup.picasso.Picasso


/**
 * El adapter lo que tiene que hacer es pillar la vista de cada item, en este caso es
 * 'south_park_character.xml' y pasarle los datos de cada item incluidos en la dataClass
 */

class SouthParkAdapter(private val southParkDataClasses: List<SouthParkDataClass>):RecyclerView.Adapter<SouthParkAdapter.SouthParkHolder>(){


    /**
     * Crea el 'Holder' a partir de cada item 'SouthParkCharacterBinding'
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SouthParkHolder {
        val li = LayoutInflater.from(parent.context) /** Esta clase nos permite crear vistas */
        val itemBinding = SouthParkCharacterBinding.inflate(li,parent,false)
        return SouthParkHolder(itemBinding)
    }

    /**
     * Renderiza el elemento de la posición dada
     */
    override fun onBindViewHolder(holder: SouthParkHolder, position: Int) {
        holder.render(southParkDataClasses[position])
    }

    /**
     * Retorna el tamaño de la lista
     */
    override fun getItemCount(): Int = southParkDataClasses.size


    /**
     * El parametro view en este método es 'activity_recycler_view.xml'
     */
    class SouthParkHolder(private val itemBinding:SouthParkCharacterBinding):RecyclerView.ViewHolder(itemBinding.root){
        fun render(dataClass: SouthParkDataClass){
            itemBinding.tvSouthParkCharacterName.text = dataClass.name
            Picasso.get().load(dataClass.url).into(itemBinding.ivSouthParkCharacterImage)

        }
    }
}