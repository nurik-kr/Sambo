package kg.nurik.sambo.ui.main.curseFragment

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kg.nurik.sambo.R
import kg.nurik.sambo.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_curse.*

class CurseFragment : BaseFragment() {
    override fun getViewId() = R.layout.fragment_curse

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       setupSpinner()
    }

    private fun setupSpinner() {
        val cities = resources.getStringArray(R.array.Cities)
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_dropdown_item, cities)
        spinner.adapter = adapter
        spinner.setSelection(0, false)

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?, view: View?, position: Int, id: Long
            ) {
                Toast.makeText(requireContext(), getString(R.string.selected_item) + cities[position], Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }
    }
}