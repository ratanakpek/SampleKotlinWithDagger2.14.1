package delivery.food.kotlindaggerdemo.ui.MainActivity.view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import dagger.android.AndroidInjection
import delivery.food.kotlindaggerdemo.R
import delivery.food.kotlindaggerdemo.ui.LoginActivity.view.LoginActivity
import delivery.food.kotlindaggerdemo.ui.MainActivity.presenter.MainView
import delivery.food.kotlindaggerdemo.ui.MainActivity.presenter.callback.MainActPresenterCallback
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainView {

    @Inject
    lateinit var app: Intent

    @Inject
    lateinit var ctn:Context

    @Inject
    lateinit var viewCallback: MainActPresenterCallback

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)



        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewCallback.callView()




        startActivity(intent.setClass(this, LoginActivity::class.java))
    }

    override fun getHello() {
        Toast.makeText(ctn, "Hello World!", Toast.LENGTH_LONG).show()
    }

}
