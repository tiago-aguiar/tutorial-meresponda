package co.tiagoaguiar.meresponda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val res = arrayOf("Sim", "Não conte com isso!", "Talvez")
    val random = Random.Default

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            if (editText.text.isEmpty()) {
                textView.text = "Faça a sua pergunta"
            } else {
                val index = random.nextInt(3)
                textView.text = res[index]
            }
        }
    }
}
