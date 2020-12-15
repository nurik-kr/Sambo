package kg.nurik.sambo.ui.bottomNav.userFragment

import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.shape.CornerFamily
import kg.nurik.sambo.R
import kotlinx.android.synthetic.main.fragment_user.*
import java.io.File

class UserFragment : BaseUserPhotoFragment() {

    private val bottomSheatDialog by lazy {
        BottomSheatFragment() {
            when (it) {
                UserPhotoType.GALLERY -> pickPhotoFromGalleryWithPermissionCheck()
                UserPhotoType.CAMERA -> shootPhotoWithPermissionCheck()
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_user, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imageCorners()
        setupListener()
    }

    private fun imageCorners() {
        resources.getDimension(R.dimen.imageRadius)
        val shape = photoUser.shapeAppearanceModel.toBuilder()
            .setAllCorners(CornerFamily.ROUNDED,120f)
            .build()
        photoUser.shapeAppearanceModel = shape
    }

    private fun setupListener() {
        tvIzmenitPhoto.setOnClickListener {
                bottomSheatDialog.show(childFragmentManager, "TAG")
        }
    }

    override fun showPhoto(file: File) {
        val bitmap = BitmapFactory.decodeFile(file.absolutePath)
        photoUser.setImageBitmap(bitmap)
    }
}