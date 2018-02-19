package delivery.food.kotlindaggerdemo.dagger.builder

import dagger.Module
import dagger.android.ContributesAndroidInjector
import delivery.food.kotlindaggerdemo.ui.MainActivity.MainActModule
import delivery.food.kotlindaggerdemo.ui.MainActivity.view.MainActivity


@Module
abstract class ActivityBuilder {


    @ContributesAndroidInjector(modules = arrayOf(MainActModule::class))
    abstract fun bindMainAct(): MainActivity


}