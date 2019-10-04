package garcia.maria.aleatorio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val ArregloRetos = arrayOf(0,1,2,3,4,5,6,7,8,9,10)


        btnadivina.setOnClickListener {

            var variable = ArregloRetos.random()

            val rnds = (0..10).random()



            val numero = num.text.toString()



            if (rnds.equals(variable)){

                val i = Intent(applicationContext,  verrdadero::class.java)
                i.putExtra("numimagen",'1')
                startActivity(i)


            }else{

                val i = Intent(applicationContext,  falso::class.java)
                i.putExtra("numimagen",'2')
                startActivity(i)

            }


        }




    }

}
