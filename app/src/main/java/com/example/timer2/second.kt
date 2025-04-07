package com.example.timer2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.timer2.ui.theme.Timer2Theme
import android.view.View
import android.content.Intent


class second : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout2)
    }

    fun timer(view: View) {
        val intent = Intent(this, third::class.java)
        startActivity(intent)
    }
}
