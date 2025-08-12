package riqinho.com.fundamentos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.core.Spring
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import riqinho.com.fundamentos.ui.theme.FundamentosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FundamentosTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Inicial(Modifier.padding(innerPadding))
                }
            }
        }
    }

    @Composable
    fun TextCustomizado(texto: String, modifier: Modifier = Modifier) {
        Text(
            text = texto,
            modifier = modifier
        )
    }

    @Composable
    fun Inicial(modifier: Modifier = Modifier) {
        TextCustomizado(
            "Primeira função composable",
            modifier
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun PreviewFuncaoInicial() {
        FundamentosTheme {
            Inicial()
        }
    }
}
