package kg.nurik.sambo.di

import kg.nurik.sambo.BuildConfig.BASE_URL
import kg.nurik.sambo.data.api.Api
import kg.nurik.sambo.data.api.ApiImpl
import kg.nurik.sambo.data.remote.RetrofitBuilder
import kg.nurik.sambo.data.repository.Repository
import kg.nurik.sambo.data.repository.RepositoryImpl
import kg.nurik.sambo.ui.bottomNav.curseFragment.CurseViewModel
import kg.nurik.sambo.ui.bottomNav.mainFragment.MainFragmentViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val MVModules = module {
    viewModel { CurseViewModel(get()) }
    viewModel { MainFragmentViewModel(get()) }
}

val RepositoryModules = module {
    single { RetrofitBuilder.buildRetrofit(BASE_URL) }
    single<Repository> { RepositoryImpl(get()) }
}

val ApiModules = module {
    single<Api> { ApiImpl(get()) }
}

val modules = listOf(MVModules, ApiModules, RepositoryModules)