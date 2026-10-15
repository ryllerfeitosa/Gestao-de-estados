package com.example.juros_simples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.core.view.WindowCompat.enableEdgeToEdge
import com.example.juros_simples.juros.JurosScreen
import com.example.juros_simples.juros.JurosScreenViewModel
import com.example.juros_simples.ui.theme.Juros_simplesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Juros_simplesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    JurosScreen(
                        modifier = Modifier.padding(innerPadding),
                        jurosScreenViewModel = JurosScreenViewModel()
                    )
                }
            }
        }
    }
}
