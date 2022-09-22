package android.example.com

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
           listOf (Box_one,box_two_text,Box_three,Box_four,Box_five,constraint_layout,Red_button,
               yellow_button,Green_button)

        for (item in clickableViews) {
            item.setOnClickListener { makeitcoloured(it) }

        }
    }


    private fun makeitcoloured (view: View)  {
        when (view.id) {

            R.id.Box_one -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.LTGRAY)

            R.id.Box_three -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.Box_four -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.Box_five -> view.setBackgroundResource(android.R.color.holo_green_light)

            R.id.Red_button -> Box_three.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> Box_four.setBackgroundResource(R.color.my_yellow)
            R.id.Green_button -> Box_five.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.YELLOW)
        }
    }

}