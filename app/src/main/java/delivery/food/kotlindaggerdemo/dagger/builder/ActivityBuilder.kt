package delivery.food.kotlindaggerdemo.dagger.builder

import dagger.Module
import dagger.android.ContributesAndroidInjector
import delivery.food.kotlindaggerdemo.MainActivity


@Module
abstract class ActivityBuilder{


    @ContributesAndroidInjector
    abstract fun bindMainAct (): MainActivity
}