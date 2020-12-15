package kg.nurik.sambo.ui.bottomNav.curseFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kg.nurik.sambo.R
import kg.nurik.sambo.data.model.Rows
import kotlinx.android.synthetic.main.item_spinner_curse.*

open class BottomSheatFragmentCurse(private val value: List<Rows>?) : BottomSheetDialogFragment() {

    //    private val vm by viewModel<CurseViewModel>()
    private val adapter = RvCurseAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.item_spinner_curse, container, false)
//        vm.loadCategories()


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerViewSpinner.adapter = adapter

        adapter.update(value)

    }
}