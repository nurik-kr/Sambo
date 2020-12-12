package kg.nurik.sambo

import android.app.Application
import kg.nurik.sambo.di.modules
import org.koin.core.context.startKoin

class SamboApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules
        }
    }
}