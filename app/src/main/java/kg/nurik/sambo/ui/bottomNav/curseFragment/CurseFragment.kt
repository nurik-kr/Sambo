package kg.nurik.sambo.ui.bottomNav.curseFragment

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import kg.nurik.sambo.R
import kg.nurik.sambo.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_curse.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class CurseFragment : BaseFragment() {

    override fun getViewId() = R.layout.fragment_curse
    private val vm by viewModel<CurseViewModel>()
    private val adapter = RvCurseAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        RecyclerView.adapter = adapter

        vm.dataCategories.observe(viewLifecycleOwner, Observer {
            adapter.update(it)
        })
        setupSpinner()
    }

    private fun setupSpinner() {
        spinnerParent.setOnClickListener {
            val bottomCurce = BottomSheatFragmentCurse(vm.dataCategories.value)
            bottomCurce.show(childFragmentManager, "TAG")
        }
    }
}