package antoniojoseuchoa.com.projetojetpackcompose

import android.content.Context
import android.graphics.Paint.Style
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import antoniojoseuchoa.com.projetojetpackcompose.ui.theme.ProjetoJetpackComposeTheme
import antoniojoseuchoa.com.projetojetpackcompose.ui.theme.Typography
import org.intellij.lang.annotations.JdkConstants.FontStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjetoJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.surface
                ) {
                      val list = listOf(Cliente("antonio", "antonio@gmail.com"),
                          Cliente("maria", "maria@gmail.com"),
                          Cliente("jose", "jose@gmail.com"))

                    MainScreen(list)
                }
            }
        }
    }
}

@Composable
fun MainScreen(names: List<Cliente>) {
    LazyColumn(Modifier.padding(bottom = 16.dp)){
            items(names){  item ->
                  Text(text = "${item.nome}")
                  Text(text = "${item.email}", Modifier.padding(bottom = 16.dp))
            }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ProjetoJetpackComposeTheme {
       MainScreen(names = listOf())
    }
}


