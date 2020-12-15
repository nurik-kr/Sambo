package kg.nurik.sambo.data.api

import kg.nurik.sambo.data.model.CurseListCategories
import kg.nurik.sambo.data.remote.SamboService
import retrofit2.Response

interface Api {
    suspend fun loadData(): Response<CurseListCategories>
}

class ApiImpl(private val service: SamboService) : Api {

    override suspend fun loadData():Response<CurseListCategories>{
        return service.loadCategories(limit = 20, page = 1, order = "{\"rank\":\"asc\"}")
    }

}