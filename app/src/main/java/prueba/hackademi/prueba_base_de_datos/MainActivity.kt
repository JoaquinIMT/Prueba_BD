package prueba.hackademi.prueba_base_de_datos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val context = this

        btn_insert.setOnClickListener ({
            if (this.etvName.text.toString().length > 0 &&
                etvAge.text.toString().length > 0
            ) {
                var user = User(etvName.text.toString(), etvAge.text.toString().toInt())
                var db = DataBaseHandler(context)
                db.insertData(user)

            } else {
                Toast.makeText(context, "Porfavor llena toda la información", Toast.LENGTH_SHORT).show()

            }
        })


    }
}
