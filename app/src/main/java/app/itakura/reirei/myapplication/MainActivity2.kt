package app.itakura.reirei.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*
import kotlin.random.Random

class MainActivity2 : AppCompatActivity() {

    var random: Random = Random

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val number = random.nextInt(100)


            when {
                15>number -> {
                    numberTextView.text = "0個"
                }
                30>number -> {
                    numberTextView.text = "1個"
                }
                70>=number -> {
                    numberTextView.text = "2個"
                }
                90>=number-> {
                    numberTextView.text = "3個"
                }
                number > 90 -> {
                    numberTextView.text = "5個"

                }
            }



        }



    }
