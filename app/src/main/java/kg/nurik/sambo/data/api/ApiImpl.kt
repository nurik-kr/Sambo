package kg.nurik.sambo.data.api

import androidx.lifecycle.viewModelScope
import kg.nurik.sambo.data.model.CurseListCategories
import kg.nurik.sambo.data.model.Rows
import kg.nurik.sambo.data.remote.SamboService
import kotlinx.coroutines.launch

interface Api {
    suspend fun loadData(limit: Int, page: Int, order: String): CurseListCategories
}

class ApiImpl(private val service: SamboService) : Api {
    override suspend fun loadData(limit: Int, page: Int, order: String): CurseListCategories {
      return service.loadCategories(limit = limit, page = page, order = "{\"rank\":\"asc\"}")
    }

}