package delivery.food.kotlindaggerdemo.dagger.component

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import delivery.food.kotlindaggerdemo.application.RTKApp
import delivery.food.kotlindaggerdemo.dagger.builder.ActivityBuilder
import delivery.food.kotlindaggerdemo.dagger.module.AppModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class, AndroidInjectionModule::class, ActivityBuilder::class))
interface AppComponent{

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(application: RTKApp):Builder

        fun build(): AppComponent
    }

    fun inject(app:RTKApp)
}