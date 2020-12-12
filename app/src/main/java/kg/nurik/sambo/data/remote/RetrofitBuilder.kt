package kg.nurik.sambo.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {

     fun buildRetrofit(baseUrl: String): SamboService {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            //.client(getClient())
            .build()
            .create(SamboService::class.java)
    }

}