package delivery.food.kotlindaggerdemo.dagger.component

import android.app.Activity
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import delivery.food.kotlindaggerdemo.application.RTKApp
import delivery.food.kotlindaggerdemo.dagger.builder.ActivityBuilder
import delivery.food.kotlindaggerdemo.dagger.module.AppModule
import delivery.food.kotlindaggerdemo.ui.MainActivity.view.MainActivity
import javax.inject.Singleton


@Component(modules = arrayOf(AppModule::class, AndroidSupportInjectionModule::class, ActivityBuilder::class))
interface AppComponent{

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(application: RTKApp):Builder

        fun build(): AppComponent
    }


    fun inject(app:RTKApp)
}