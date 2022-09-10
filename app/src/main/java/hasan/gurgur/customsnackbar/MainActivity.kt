package hasan.gurgur.customsnackbar

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import com.google.android.material.snackbar.Snackbar
import hasan.gurgur.customsnackbar.databinding.ActivityMainBinding
import hasan.gurgur.customsnackbar.databinding.CustomSnackbarBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShowSnackbar.setOnClickListener {

            showCustomSnackBar("You Clicked Button", binding.myContainer)
        }

    }


}