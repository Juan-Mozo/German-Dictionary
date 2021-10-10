package com.juanimozo.drinkscocktails.settings.units

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.juanimozo.drinkscocktails.R
import com.juanimozo.drinkscocktails.databinding.FragmentUnitsSettingsBinding

class UnitsSettingsFragment : Fragment() {
    // Binding
    private var _binding: FragmentUnitsSettingsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUnitsSettingsBinding.inflate(inflater, container, false)
        val view = binding.root

        // Languages
        val ml = RecipeUnit.ml
        val oz = RecipeUnit.oz

        // ViewModel
        val application = requireNotNull(this.activity).application
        val viewModelFactory = UnitsSettingsViewModelFactory(application)
        val UnitsSettingsViewModel = ViewModelProvider(this, viewModelFactory).get(
            UnitsSettingsViewModel::class.java)

        // currentLanguageObserver
        val currentUnitObserver = Observer<RecipeUnit> { viewState ->
            when (viewState) {
                oz -> {
                    binding.ouncesCard.setChecked(true)
                    binding.ouncesCard.setBackgroundColor(resources.getColor(R.color.apricot_peach50))
                    // Change Units to ml
                    binding.mlCard.setOnClickListener {
                        UnitsPreferences(requireContext()).updateUnitsPrefs(ml)
                        Toast.makeText(requireContext(),R.string.units_changed_ml, Toast.LENGTH_SHORT).show()
                    }
                }
                ml -> {
                    binding.mlCard.setChecked(true)
                    binding.mlCard.setBackgroundColor(resources.getColor(R.color.apricot_peach50))
                    // Change Units to ounces
                    binding.ouncesCard.setOnClickListener {
                        UnitsPreferences(requireContext()).updateUnitsPrefs(oz)
                        Toast.makeText(requireContext(),R.string.units_changed_oz, Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
        UnitsSettingsViewModel.viewState.observe(viewLifecycleOwner, currentUnitObserver)

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}