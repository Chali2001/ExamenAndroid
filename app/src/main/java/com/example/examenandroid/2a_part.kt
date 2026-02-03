

// Exemple de com navegar al fragment passant l'ID amb Bundle
/*

// A TasquesAdapter, afegir listener de click al constructor

private val onTascaClick: (Tasca) -> Unit

// Cridar al listener al lloc apropiat
holder.itemView.setOnClickListener { onTascaClick(tasca) }


// Des del TasquesFragment, quan creem l'adapter, caldrà passar aquest bloc de codi:


val fragment = EditarTascaFragment()
fragment.arguments = bundle


    