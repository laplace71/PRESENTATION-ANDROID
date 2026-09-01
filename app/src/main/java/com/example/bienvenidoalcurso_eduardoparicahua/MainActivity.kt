package com.example.bienvenidoalcurso_eduardoparicahua

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bienvenidoalcurso_eduardoparicahua.ui.theme.BienvenidoAlCursoEduardoParicahuaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BienvenidoAlCursoEduardoParicahuaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color(0xFFD7E8D4)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "Logo de Android",
                modifier = Modifier.size(150.dp)
            )

            Text(
                text = "Eduardo Paricahua",
                fontSize = 32.sp,
                color = Color(0xFF1B1B1B)
            )

            Text(
                text = "Estudiante de Desarrollo de Software",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1F6B38)
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF1C1B1F))
                .padding(vertical = 32.dp, horizontal = 28.dp),
            verticalArrangement = Arrangement.spacedBy(18.dp)
        ) {
            ContactRow(
                symbol = "☎",
                text = "+51 991279686"
            )

            ContactRow(
                symbol = "✉",
                text = "eduardo.13pm@gmail.com"
            )

            ContactRow(
                symbol = "⌖",
                text = "Arequipa, Perú"
            )
        }
    }
}

@Composable
fun ContactRow(
    symbol: String,
    text: String
) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = symbol,
            color = Color(0xFF9CFF9D),
            fontSize = 25.sp,
            modifier = Modifier.size(25.dp)
        )

        Spacer(modifier = Modifier.size(20.dp))

        Text(
            text = text,
            color = Color.White,
            fontSize = 15.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBusinessCard() {
    BienvenidoAlCursoEduardoParicahuaTheme {
        BusinessCard()
    }
}