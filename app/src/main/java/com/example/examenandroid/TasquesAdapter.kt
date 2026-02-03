package com.example.examenandroid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TasquesAdapter(private val onTascaClick: (Tasca) -> Unit) : RecyclerView.Adapter<TasquesAdapter.TascaViewHolder>() {

    private var tasques = listOf<Tasca>()

    fun setTasques(novesTasques: List<Tasca>) {
        tasques = novesTasques
        notifyDataSetChanged()
    }
    class TascaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvNom: TextView = itemView.findViewById(R.id.tvNom)
        val tvCategoria: TextView = itemView.findViewById(R.id.tvCategoria)
        val tvData: TextView = itemView.findViewById(R.id.tvData)
        val tvEstat: TextView = itemView.findViewById(R.id.tvEstat)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TascaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_tasca, parent, false)
        return TascaViewHolder(view)
    }

    override fun onBindViewHolder(holder: TascaViewHolder, position: Int) {
        val tasca = tasques[position]
        holder.tvNom.text = tasca.nom
        holder.tvCategoria.text = tasca.categoria as CharSequence?
        holder.tvData.text = tasca.data
        holder.tvEstat.text = tasca.estat as CharSequence?
        holder.itemView.setOnClickListener { onTascaClick(tasca) }
    }

    override fun getItemCount(): Int = tasques.size
}