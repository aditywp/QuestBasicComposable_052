package com.example.basiccompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basiccompose.ui.theme.BasicComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BasicComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompose(
                        adit = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BasicCompose(adit: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(text = "Indonesia",
            modifier = adit,
            fontSize = 70.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold
        )

        Text(text = "Versus",
            style = TextStyle(
                fontSize = 60.sp,
                fontStyle = FontStyle.Italic,
                color = Color.Blue
            )
        )

        Image(painter = painterResource(id = R.drawable.fifaaaaaaa),
            contentDescription = null,
            modifier = Modifier.size(200.dp)
        )

        Text(text = "Nama",
            style = TextStyle(
                fontSize = 20.sp,
                fontStyle = FontStyle.Italic
            )
        )

        Text(text = "Aditya Wirajaya Permono",
            style = TextStyle(
                fontSize = 25.sp,
                fontStyle = FontStyle.Italic,
                color = Color.Magenta
            )
        )

        Text(text = "20220140052",
            style = TextStyle(
                fontSize = 50.sp,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight
                    .Bold
            )
        )

        Image(painter = painterResource(id = R.drawable.krs),
            contentDescription = null,
            modifier = Modifier
                .size(300.dp)
                .clip(RoundedCornerShape(200.dp))
        )

    }

}

