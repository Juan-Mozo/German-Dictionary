package com.juanimozo.drinkscocktails.drinks.presentation.explore

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.juanimozo.drinkscocktails.R
import com.juanimozo.drinkscocktails.drinks.domain.model.DrinkRecipe

class ExploreAdapter(
    private val drinks: List<DrinkRecipe>,
    private val listener: (DrinkRecipe) -> Unit
): RecyclerView.Adapter<ExploreAdapter.drinkListViewHolder>() {

    class drinkListViewHolder(
        view: View
    ): RecyclerView.ViewHolder(view) {

        val drinkNameText = view.findViewById<TextView>(R.id.drinkNameText)
        val drinkImageView = view.findViewById<ImageView>(R.id.drinkImage)

        fun bind(item: DrinkRecipe) {
            drinkNameText.text = item.name
            drinkImageView.setImageResource(item.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): drinkListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_drink_recipe, parent, false)
        return drinkListViewHolder(view)
    }

    override fun onBindViewHolder(holder: drinkListViewHolder, position: Int) {
        val item = drinks[position]
        holder.bind(item)
        holder.itemView.setOnClickListener { listener(item) }
    }

    override fun getItemCount() = drinks.size
}