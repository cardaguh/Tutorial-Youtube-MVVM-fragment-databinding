package co.cyclopsapps.passfromactivitytofragmentdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import co.cyclopsapps.passfromactivitytofragmentdatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        /*val btnMessage = findViewById<Button>(R.id.btnShowMessage)

        btnMessage.setOnClickListener {
            Toast.makeText(this, "Hola Mundo Activity!", Toast.LENGTH_SHORT).show()
        }*/

        /*binding.btnShowMessage.setOnClickListener {
            Toast.makeText(this, "Hola Mundo Activity!", Toast.LENGTH_SHORT).show()
        }*/
    }
}