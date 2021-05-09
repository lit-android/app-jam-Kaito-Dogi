package app.myoji.nickname.appjam

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count = 0

        button.setOnClickListener {
            count = count + 1
            textView.text = count.toString()
        }
    }

}
