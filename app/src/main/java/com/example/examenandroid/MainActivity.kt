package com.example.examenandroid

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        class TascaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        }

        object TasquesRepository {
            val tasques = listOf(
                Tasca(1, "Preparar presentació", Categoria.Feina, "25/01/2026", Estat.EnCurs),
                Tasca(2, "Revisar emails", Categoria.Feina, "25/01/2026", Estat.NoComencada),
                Tasca(3, "Sopar familiar", Categoria.Familia, "26/01/2026", Estat.NoComencada),
                Tasca(4, "Comprar regal aniversari", Categoria.Familia, "28/01/2026", Estat.EnCurs),
                Tasca(5, "Anar al gimnàs", Categoria.Personal, "25/01/2026", Estat.Finalitzada),
                Tasca(6, "Llegir llibre", Categoria.Personal, "27/01/2026", Estat.EnCurs),
                Tasca(7, "Reunió equip", Categoria.Feina, "26/01/2026", Estat.NoComencada),
                Tasca(8, "Trucar mare", Categoria.Familia, "25/01/2026", Estat.Finalitzada)
            )
        }

    }
}