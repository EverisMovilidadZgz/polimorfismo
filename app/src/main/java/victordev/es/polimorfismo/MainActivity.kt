package victordev.es.polimorfismo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import victordev.es.polimorfismo.interfaces.MainKotlin

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mainJava = MainJava()
        mainJava.run()

        var mainKotlin = MainKotlin()
        mainKotlin.run()
    }
}
