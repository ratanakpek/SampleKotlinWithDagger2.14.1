package delivery.food.kotlindaggerdemo.ui.MainActivity

import android.content.Context
import android.content.Intent
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjector
import delivery.food.kotlindaggerdemo.application.RTKApp
import delivery.food.kotlindaggerdemo.ui.MainActivity.presenter.MainView
import delivery.food.kotlindaggerdemo.ui.MainActivity.presenter.callback.MainActPresenterCallback
import delivery.food.kotlindaggerdemo.ui.MainActivity.presenter.impl.MainActPresenter
import delivery.food.kotlindaggerdemo.ui.MainActivity.view.MainActivity
import javax.inject.Inject


@Module
class MainActModule  {


    @Provides
    fun provideIntent(): Intent {
        return Intent()
    }

    @Provides
    fun provideContext(app: RTKApp): Context {
        return app.applicationContext
    }

    @Provides
    fun provideMainView(activity: MainActivity): MainView {
        return activity
    }

    @Provides
    fun provideMainActPresenterCallback(mainView:MainView): MainActPresenterCallback {
        return MainActPresenter(mainView)
    }


}