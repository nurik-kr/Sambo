package kg.nurik.sambo.data.remote

import kg.nurik.sambo.data.model.CurseListCategories
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface SamboService {

    @GET("api/v1/categories")
    suspend fun loadCategories(
        @Query("limit") limit: Int,
        @Query("page") page: Int,
        @Query("order") order: String
    ): CurseListCategories//Response<CurseListCategories>
}

//https://api.sambo.beta.trinitydigital.ru/api/v1/categories?limit=20&page=1&order=%20{%22rank%22:%22asc%22}