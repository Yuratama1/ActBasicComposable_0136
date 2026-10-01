package com.example.praktikum3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasLogin(modifier: Modifier = Modifier) {

    Box(
        modifier = modifier.fillMaxSize()
    ) {

        // Background
        Image(
            painter = painterResource(
                id = R.drawable.background_login
            ),
            contentDescription = "Background Login",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        // Content
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    top = 28.dp,
                    start = 16.dp,
                    end = 16.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {

            // Judul
            Text(
                text = "Login",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF0066FF)
            )

            Spacer(
                modifier = Modifier.height(4.dp)
            )

            // Deskripsi
            Text(
                text = "Ini adalah halaman login",
                fontSize = 11.sp,
                color = Color.White
            )

            Spacer(
                modifier = Modifier.height(18.dp)
            )

            // LOGO UMY
            Image(
                painter = painterResource(
                    id = R.drawable.logo_umy
                ),
                contentDescription = "Logo UMY",
                modifier = Modifier.size(150.dp)
            )

            Spacer(
                modifier = Modifier.height(96.dp)
            )

            // LABEL NAMA
            Text(
                text = "Nama",
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Red
            )

            Spacer(
                modifier = Modifier.height(2.dp)
            )

            // NAMA MAHASISWA
            Text(
                text = "Yuratama Fadhilah Nugroho",
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF0066FF)
            )

            // NIM
            Text(
                text = "20240140136",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            Spacer(
                modifier = Modifier.height(12.dp)
            )

            // FOTO
            Image(
                painter = painterResource(
                    id = R.drawable.foto_saya
                ),
                contentDescription = "Foto mahasiswa",
                modifier = Modifier
                    .size(220.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
        }
    }
}