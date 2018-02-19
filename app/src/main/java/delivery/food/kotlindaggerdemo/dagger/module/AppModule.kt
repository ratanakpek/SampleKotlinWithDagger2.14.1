package delivery.food.kotlindaggerdemo.dagger.module

import dagger.Module
import dagger.Provides
import delivery.food.kotlindaggerdemo.application.RTKApp
import javax.inject.Singleton

@Module
class AppModule() {


    @Provides
    fun provideText(): String = "Hello"

}