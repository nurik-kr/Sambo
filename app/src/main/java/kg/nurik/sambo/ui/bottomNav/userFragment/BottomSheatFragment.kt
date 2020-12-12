package kg.nurik.sambo.ui.bottomNav.userFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kg.nurik.sambo.R
import kg.nurik.sambo.ui.bottomNav.userFragment.UserPhotoType.*
import kotlinx.android.synthetic.main.fragment_bottom_sheat.*


class BottomSheatFragment(
    private val listener: (type: UserPhotoType) -> Unit) : BottomSheetDialogFragment(){

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_bottom_sheat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       super.onViewCreated(view, savedInstanceState)
        openCamera.setOnClickListener {
            listener.invoke(CAMERA)
        }
        openGallery.setOnClickListener {
            listener.invoke(GALLERY)
        }
    }
}