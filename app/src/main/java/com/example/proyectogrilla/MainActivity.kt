package com.example.proyectogrilla

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectogrilla.ui.theme.ProyectoGrillaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProyectoGrillaTheme {
               Surface(
                   modifier = Modifier.fillMaxSize(),
                   color = MaterialTheme.colorScheme.background
               ) {
                   TopicCard()

               }
            }
        }
    }
}




@Composable
fun TopicCard(
    modifier: Modifier = Modifier


) {
    Card (
        modifier = modifier
            .padding(4.dp)



    ) {
        Row (
            modifier = Modifier
        ) {
            Image(
                painter = painterResource(id = R.drawable.architecture),
                contentDescription = null,
                modifier = Modifier
                    .size(68.dp)

            )
            Column(
                modifier = Modifier
                    .padding(start = 16.dp, top = 16.dp, end = 16.dp)
            )
            {
                Text(
                    text = "Architecture",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier
                        .padding(bottom = 8.dp)

                )
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.ic_grid),
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.onBackground),
                        modifier = Modifier.
                        padding(end = 8.dp)
                    )
                    Text(
                        text = "123",
                        style = MaterialTheme.typography.labelLarge,
                    )
                }

            }

        }


    }


}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProyectoGrillaTheme {
        TopicCard()
    }
}