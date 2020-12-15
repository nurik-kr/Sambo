package kg.nurik.sambo.ui.bottomNav.curseFragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kg.nurik.sambo.data.model.Rows
import kg.nurik.sambo.data.remote.SamboService
import kg.nurik.sambo.data.repository.Repository
import kotlinx.coroutines.launch

class CurseViewModel() : ViewModel() {

    val dataCategories = MutableLiveData<List<Rows>>()

    init {
        loadCategories()
    }

    fun loadCategories() {
//        viewModelScope.launch {
//            val result = repository.loadData()
//            if (result.isSuccessful) dataCategories.postValue(result.body()?.rows)
//        }
    }
}
