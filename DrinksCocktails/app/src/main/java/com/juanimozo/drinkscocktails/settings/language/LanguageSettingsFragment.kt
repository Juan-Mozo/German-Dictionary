package com.juanimozo.drinkscocktails.settings.language

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.card.MaterialCardView
import com.juanimozo.drinkscocktails.MainActivity
import com.juanimozo.drinkscocktails.R
import com.juanimozo.drinkscocktails.databinding.FragmentLanguageSettingsBinding
import java.util.*

class LanguageSettingsFragment : Fragment() {

    // Binding
    private var _binding: FragmentLanguageSettingsBinding? = null
    private val binding get() = _binding!!

    // To setLocale()
    lateinit var locale: Locale
    lateinit var currentLanguage: Language
    private var currentLang: Language? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLanguageSettingsBinding.inflate(inflater, container, false)
        val view = binding.root

        // Languages
        val english = Language.en
        val spanish = Language.es

        // ViewModel
        val application = requireNotNull(this.activity).application
        val viewModelFactory = LanguageSettingsViewModelFactory(application)
        val LanguageSettingsViewModel = ViewModelProvider(this, viewModelFactory).get(LanguageSettingsViewModel::class.java)

        // currentLanguageObserver
        val currentLanguageObserver = Observer<Language> { viewState ->
            when (viewState) {
                english -> {
                    binding.englishCard.setChecked(true)
                    binding.englishCard.setBackgroundColor(resources.getColor(R.color.apricot_peach50))
                }
                spanish -> {
                    binding.spanishCard.setChecked(true)
                    binding.spanishCard.setBackgroundColor(resources.getColor(R.color.apricot_peach50))
                }
            }
        }
        LanguageSettingsViewModel.viewState.observe(viewLifecycleOwner, currentLanguageObserver)

        currentLanguage = LanguagePreferences(requireContext()).getLanguagePrefs()

        // Change language to English
        binding.englishCard.setOnClickListener {
            LanguagePreferences(requireContext()).updateLanguagePrefs(english)
            Toast.makeText(requireContext(),"Language changed to English", Toast.LENGTH_SHORT).show()
            setLocale(english)
        }
        // Change language to Spanish
        binding.spanishCard.setOnClickListener {
            LanguagePreferences(requireContext()).updateLanguagePrefs(spanish)
            Toast.makeText(requireContext(),"Lenguaje cambiado al español", Toast.LENGTH_SHORT).show()
            setLocale(spanish)
        }

        return view
    }

    // Change resource language
    fun setLocale(localeName: Language) {
        if (localeName != currentLanguage) {
            // Resources
            locale = Locale(localeName.toString())
            val res = resources
            val dm = res.displayMetrics
            val conf = res.configuration
            conf.locale = locale
            res.updateConfiguration(conf, dm)

            // Refresh currentLanguage
            currentLanguage = localeName

            // Restart MainActivty
            val refresh = Intent(requireContext(), MainActivity::class.java)
            refresh.putExtra(currentLang.toString(), localeName)
            startActivity(refresh)
        } else {
            Toast.makeText(requireContext(), R.string.language_already_selected, Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
