package com.juanimozo.drinkscocktails.settings

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.juanimozo.drinkscocktails.R

class SettingsListAdapter(
    private val items: List<SettingsItemModel>,
    private val listener: (SettingsItemModel) -> Unit
) : RecyclerView.Adapter<SettingsListAdapter.SettingsListViewHolder>() {

    class SettingsListViewHolder(
        view: View
    ) : RecyclerView.ViewHolder(view) {

        val settingsIcon = view.findViewById<ImageView>(R.id.settingsListIcon)
        val settingsTitle = view.findViewById<TextView>(R.id.settingsListTitle)
        val settingsDescription = view.findViewById<TextView>(R.id.settingsListDescription)

        fun bind(itemModel: SettingsItemModel) {
            settingsIcon.setImageResource(itemModel.icon)
            settingsTitle.text = itemModel.title
            settingsDescription.text = itemModel.description
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SettingsListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_settings, parent, false)
        return SettingsListViewHolder(view)
    }

    // Bind data with the ViewHolder
    override fun onBindViewHolder(holder: SettingsListViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
        holder.itemView.setOnClickListener { listener(item) }
    }

    override fun getItemCount() = items.size
}