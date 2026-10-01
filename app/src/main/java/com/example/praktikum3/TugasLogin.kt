package com.example.praktikum3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasLogin(modifier: Modifier) {

    Box(
        modifier = modifier.fillMaxSize()
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Login",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(
                modifier = Modifier.height(20.dp)
            )

            Text(
                text = "Ini adalah halaman login"
            )

            Spacer(
                modifier = Modifier.height(20.dp)
            )

            Image(
                painter = painterResource(
                    id = R.drawable.logo_umy
                ),
                contentDescription = "Logo Universitas",
                modifier = Modifier.size(100.dp)
            )

            Spacer(
                modifier = Modifier.height(20.dp)
            )

            Text(
                text = "Nama",
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Yuratama Fadhilah Nugroho",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "20240140136",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(
                modifier = Modifier.height(20.dp)
            )

            Image(
                painter = painterResource(
                    id = R.drawable.foto_saya
                ),
                contentDescription = "Foto mahasiswa",
                modifier = Modifier
                    .size(150.dp)
                    .clip(CircleShape)
            )

        }

    }
}