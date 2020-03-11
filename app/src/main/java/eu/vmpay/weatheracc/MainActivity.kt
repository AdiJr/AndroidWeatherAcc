package eu.vmpay.weatheracc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import eu.vmpay.weatheracc.ui.fragment.SplashFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, SplashFragment.newInstance())
                    .commitNow()
        }
    }
}