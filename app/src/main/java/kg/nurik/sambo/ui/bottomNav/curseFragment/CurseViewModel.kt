package kg.nurik.sambo.ui.bottomNav.curseFragment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kg.nurik.sambo.data.repository.Repository
import kotlinx.coroutines.launch

class CurseViewModel(private val repository: Repository) : ViewModel() {

    fun loadCategories(limit: Int, page: Int, order: String) {
        viewModelScope.launch {
            val result = repository.loadData(limit, page, order)

        }
    }

}