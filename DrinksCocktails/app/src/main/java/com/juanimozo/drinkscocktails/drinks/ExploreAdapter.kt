package com.juanimozo.drinkscocktails.drinks

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.juanimozo.drinkscocktails.DrinkRecipeItemModel
import com.juanimozo.drinkscocktails.R

class ExploreRecyclerViewAdapter(
    private val recipeModels: List<DrinkRecipeItemModel>,
    private val listener: (DrinkRecipeItemModel) -> Unit
) : RecyclerView.Adapter<ExploreRecyclerViewAdapter.DrinksListViewHolder>() {

    class DrinksListViewHolder(
        view: View
    ) : RecyclerView.ViewHolder(view) {

        val drinkNameText = view.findViewById<TextView>(R.id.drinkNameText)
        val drinkImageView = view.findViewById<ImageView>(R.id.drinkImage)

        fun bind(itemModel: DrinkRecipeItemModel) {
            drinkNameText.text = itemModel.name
            drinkImageView.setImageResource(itemModel.image)
        }
    }

//    companion object {
//        val DIFF_CONFIG = object : DiffUtil.ItemCallback<RecipeList>() {
//            //Devuelve solo si oldItem y newItem son lo mismo
//            override fun areItemsTheSame(oldItem: RecipeList, newItem: RecipeList): Boolean {
//                return oldItem === newItem
//            }
//
//            //Devuelve solo si el contenido entre oldItem y newItem son lo mismo
//            override fun areContentsTheSame(oldItem: RecipeList, newItem: RecipeList): Boolean {
//                return oldItem == newItem
//            }
//
//        }
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DrinksListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_drink_recipe, parent, false)
        return DrinksListViewHolder(view)
    }

    // Bind data with the ViewHolder
    override fun onBindViewHolder(holder: DrinksListViewHolder, position: Int) {
        val item = recipeModels[position]
        holder.bind(item)
        holder.itemView.setOnClickListener { listener(item) }
    }

    override fun getItemCount() = recipeModels.size
}
