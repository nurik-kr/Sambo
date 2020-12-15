package kg.nurik.sambo.data.repository

import kg.nurik.sambo.data.api.Api
import kg.nurik.sambo.data.model.CurseListCategories
import kg.nurik.sambo.data.model.Rows
import retrofit2.Response

interface Repository {
    suspend fun loadData(): Response<CurseListCategories>
}

class RepositoryImpl(private val network: Api): Repository {
    override suspend fun loadData(): Response<CurseListCategories> {


        return network.loadData()
    }
}