package kg.nurik.sambo.data.repository

import kg.nurik.sambo.data.api.Api
import kg.nurik.sambo.data.model.CurseListCategories

interface Repository {
    suspend fun loadData(limit: Int, page: Int, order: String): CurseListCategories
}

class RepositoryImpl(private val network: Api): Repository {
    override suspend fun loadData(limit: Int, page: Int, order: String): CurseListCategories {
        return network.loadData(limit = limit, page = page, order = "{\"rank\":\"asc\"}")
    }
}