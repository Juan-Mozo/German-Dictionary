package com.juanimozo.drinkscocktails.settings.theme

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.juanimozo.drinkscocktails.MainActivity
import com.juanimozo.drinkscocktails.R
import com.juanimozo.drinkscocktails.databinding.FragmentThemeSettingsBinding

class ThemeSettingsFragment : Fragment() {

    // Binding
    private var _binding: FragmentThemeSettingsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentThemeSettingsBinding.inflate(inflater, container, false)
        val view = binding.root

        // Languages
        val lightTheme = Theme.Light
        val darkTheme = Theme.Dark
        val neonTheme = Theme.Neon

        // ViewModel
        val application = requireNotNull(this.activity).application
        val viewModelFactory = ThemeSettingsViewModelFactory(application)
        val ThemeSettingsViewModel = ViewModelProvider(this, viewModelFactory).get(
            ThemeSettingsViewModel::class.java)

        // currentLanguageObserver
        val currentThemeObserver = Observer<Theme> { viewState ->
            when (viewState) {
                lightTheme -> {
                    binding.lightThemeCard.setChecked(true)
                    binding.lightThemeCard.setBackgroundColor(resources.getColor(R.color.apricot_peach50))
                }
                darkTheme -> {
                    binding.darkThemeCard.setChecked(true)
                    binding.darkThemeCard.setBackgroundColor(resources.getColor(R.color.apricot_peach50))
                }
                neonTheme -> {
                    binding.neonThemeCard.setChecked(true)
                    binding.neonThemeCard.setBackgroundColor(resources.getColor(R.color.apricot_peach50))
                }
            }
        }
        ThemeSettingsViewModel.viewState.observe(viewLifecycleOwner, currentThemeObserver)

        // Change theme to Light
        binding.lightThemeCard.setOnClickListener {
            ThemePreferences(requireContext()).updateThemePrefs(lightTheme)
            Toast.makeText(requireContext(), R.string.theme_changed_light, Toast.LENGTH_LONG).show()
            restartActivity()
        }
        // Change theme to Dark
        binding.darkThemeCard.setOnClickListener {
            ThemePreferences(requireContext()).updateThemePrefs(darkTheme)
            Toast.makeText(requireContext(), R.string.theme_changed_dark, Toast.LENGTH_LONG).show()
            restartActivity()
        }
        // Change theme to Neon
        binding.neonThemeCard.setOnClickListener {
            ThemePreferences(requireContext()).updateThemePrefs(neonTheme)
            Toast.makeText(requireContext(), R.string.theme_changed_neon, Toast.LENGTH_LONG).show()
            restartActivity()
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun restartActivity() {
        // Restart MainActivty to apply theme changes
        val refresh = Intent(requireContext(), MainActivity::class.java)
        startActivity(refresh)
    }

}