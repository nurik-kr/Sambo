package kg.nurik.sambo.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class OnBoardModel(val image: Int, val title: String) : Parcelable