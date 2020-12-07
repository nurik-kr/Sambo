package kg.nurik.sambo.ui.main.userFragment

import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.shape.CornerFamily
import kg.nurik.sambo.R
import kotlinx.android.synthetic.main.fragment_user.*
import java.io.File

class UserFragment :  BaseUserPhotoFragment() {

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
            .setTopLeftCorner(CornerFamily.ROUNDED, 40f)
            .setTopRightCorner(CornerFamily.ROUNDED, 40f)
            .setBottomLeftCorner(CornerFamily.ROUNDED, 40f)
            .setBottomRightCorner(CornerFamily.ROUNDED, 40f)
            .build()
        photoUser.shapeAppearanceModel = shape
    }

    private fun setupListener() {
        tvIzmenitPhoto.setOnClickListener {
            shootPhotoWithPermissionCheck()
            pickPhotoFromGalleryWithPermissionCheck()
        }
    }

    override fun showPhoto(file: File) {
        val bitmap = BitmapFactory.decodeFile(file.absolutePath)
        photoUser.setImageBitmap(bitmap)
    }
}