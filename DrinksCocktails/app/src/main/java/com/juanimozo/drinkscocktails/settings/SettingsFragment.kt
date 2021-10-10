package com.juanimozo.drinkscocktails.settings

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.juanimozo.drinkscocktails.R
import com.juanimozo.drinkscocktails.settings.language.Language
import com.juanimozo.drinkscocktails.settings.language.LanguagePreferences

class SettingsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_settings, container, false)

        val settingsList = setSettingsList(LanguagePreferences(requireContext()))

        // RecyclerView
        val settingsRV: RecyclerView = view.findViewById(R.id.SettingsRecyclerView)
        settingsRV.layoutManager = LinearLayoutManager(requireContext())
        val settingsListAdapter = SettingsListAdapter(settingsList) { item ->
            showSettingsDetails(item)
        }
        settingsRV.adapter = settingsListAdapter

        return view
    }

    fun showSettingsDetails(item: SettingsItemModel) {
        when (item.position) {
            // Navigate to LanguageSettingsFragment
            0 -> findNavController().navigate(SettingsFragmentDirections.actionSettingsFragmentToLanguageSettingsFragment())
            // Navigate to UnitsSettingsFragment
            1 -> findNavController().navigate(SettingsFragmentDirections.actionSettingsFragmentToUnitsSettingsFragment())
            // Navigate to ThemeSettingsFragment
            2 -> findNavController().navigate(SettingsFragmentDirections.actionSettingsFragmentToThemeSettingsFragment())
        }
    }

    fun setSettingsList(langPref: LanguagePreferences): List<SettingsItemModel> {
        var settingsList: List<SettingsItemModel>
        val language = langPref.getLanguagePrefs()

        when (language) {
            Language.en -> settingsList = settingsRepository()
            Language.es -> settingsList = settingsRepositorySpanish()
        }

        return settingsList
    }

}