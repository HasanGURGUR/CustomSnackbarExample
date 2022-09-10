package hasan.gurgur.customsnackbar

import android.content.Context
import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import com.google.android.material.snackbar.Snackbar
import hasan.gurgur.customsnackbar.databinding.CustomSnackbarBinding

fun Context.showCustomSnackBar(message: String, container: View?) {
    container?.let {
        val snackView = View.inflate(this, R.layout.custom_snackbar, null)
        val binding = CustomSnackbarBinding.bind(snackView)
        val snackBar = Snackbar.make(container, "", Snackbar.LENGTH_LONG)
        snackBar.apply {
            (view as ViewGroup).addView(binding.root)
            view.setBackgroundColor(Color.TRANSPARENT)
            binding.tvMessage.text = message
            show()
        }
    }
}