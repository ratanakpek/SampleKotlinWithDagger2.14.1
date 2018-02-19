package delivery.food.kotlindaggerdemo.ui.MainActivity.presenter.impl

import delivery.food.kotlindaggerdemo.ui.MainActivity.presenter.MainView
import delivery.food.kotlindaggerdemo.ui.MainActivity.presenter.callback.MainActPresenterCallback
import javax.inject.Inject

class MainActPresenter @Inject constructor(private var view: MainView) : MainActPresenterCallback {


    override fun callView() {
        view.getHello()
    }

}