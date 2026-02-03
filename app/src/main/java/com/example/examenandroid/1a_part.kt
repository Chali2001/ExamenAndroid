package com.example.examenandroid

// Models
data class Tasca(
val id: Int,
val nom: String,
val categoria: Categoria,
val data: String,
val estat: Estat
)

sealed class Categoria(val nom: String) {
object Feina : Categoria("Feina")
object Familia : Categoria("Família")
object Personal : Categoria("Personal")
}

sealed class Estat(val nom: String) {
object NoComencada : Estat("No començada")
object EnCurs : Estat("En curs")
object Finalitzada : Estat("Finalitzada")
}

// Object amb llistat de tasques
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

// Adapter per RecyclerView
class TasquesAdapter : RecyclerView.Adapter<TascaViewHolder>() {

    private var tasques = listOf<Tasca>()

    fun setTasques(novesTasques: List<Tasca>) {
        tasques = novesTasques
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TascaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_tasca, parent, false)
        return TascaViewHolder(view)
    }

    override fun onBindViewHolder(holder: TascaViewHolder, position: Int) {
        holder.renderitza(tasques[position])
    }

}
// Holder per a Tasca
class TascaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

}


// Fragment Tasques



// Layout XML: fragment_tasques.xml
/*
<?xml version="1.0" encoding="utf-8"?>

<com.google.android.material.appbar.MaterialToolbar
android:background="?attr/colorPrimary"
android:elevation="4dp"
app:title="Les meves tasques"
app:titleTextColor="@android:color/white" />

<com.google.android.material.chip.ChipGroup
app:checkedChip="@id/chipTotes"
app:singleSelection="true">

<com.google.android.material.chip.Chip
android:id="@+id/chipTotes"
style="@style/Widget.Material3.Chip.Filter"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Totes" />

<com.google.android.material.chip.Chip
android:id="@+id/chipFeina"
style="@style/Widget.Material3.Chip.Filter"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Feina" />

<com.google.android.material.chip.Chip
android:id="@+id/chipFamilia"
style="@style/Widget.Material3.Chip.Filter"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Família" />

<com.google.android.material.chip.Chip
android:id="@+id/chipPersonal"
style="@style/Widget.Material3.Chip.Filter"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Personal" />

</com.google.android.material.chip.ChipGroup>


<androidx.recyclerview.widget.RecyclerView
android:clipToPadding="false"
android:padding="8dp" />
*/

// Layout XML: item_tasca.xml
/*
<?xml version="1.0" encoding="utf-8"?>
<com.google.android.material.card.MaterialCardView
xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:layout_margin="8dp"
app:cardElevation="2dp"
app:cardCornerRadius="8dp">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:padding="16dp">

        <TextView
            android:id="@+id/tvNom"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:textSize="18sp"
            android:textStyle="bold"
            android:textColor="@android:color/black" />

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal"
            android:layout_marginTop="8dp">

            <TextView
                android:id="@+id/tvCategoria"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:textSize="14sp"
                android:textColor="@android:color/darker_gray" />

            <TextView
                android:id="@+id/tvData"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:textSize="14sp"
                android:textColor="@android:color/darker_gray" />

        </LinearLayout>

        <TextView
            android:id="@+id/tvEstat"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="4dp"
            android:textSize="14sp"
            android:textStyle="bold" />

    </LinearLayout>

</com.google.android.material.card.MaterialCardView>
*/

// build.gradle (app)
/*
dependencies {
    ...
    implementation 'androidx.core:core-ktx:1.12.0'
    implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'com.google.android.material:material:1.11.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    implementation 'androidx.recyclerview:recyclerview:1.3.2'
    ...
}
*/


