package com.example.prjmetrix

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import  androidx.compose.runtime.Composable
import  androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.offset

@Composable
fun HomeScreen() {

   Box(
      modifier = Modifier.fillMaxSize()
   ) {

      // Room background
      Image(
         painter = painterResource(id = R.drawable.img_10),
         contentDescription = "Room background",
         modifier = Modifier
            .fillMaxWidth()
            .height(786.dp)
            .align(Alignment.TopStart),
         contentScale = ContentScale.Fit
      )

      // Avatar
      Image(
         painter = painterResource(id = R.drawable.base_body_f),
         contentDescription = "Avatar",
         modifier = Modifier
            .fillMaxWidth()
            .height(500.dp)
            .align(Alignment.Center),
         contentScale = ContentScale.FillHeight
      )

      // =========================
      // CLOTHING
      // =========================

      Image(
         painter = painterResource(id = R.drawable.top2),
         contentDescription = "Avatar top",
         modifier = Modifier
            .fillMaxWidth()
            .height(500.dp)
            .align(Alignment.Center),
         contentScale = ContentScale.FillHeight
      )

      Image(
         painter = painterResource(id = R.drawable.bottom2),
         contentDescription = "Avatar bottom",
         modifier = Modifier
            .fillMaxWidth()
            .height(500.dp)
            .align(Alignment.Center),
         contentScale = ContentScale.FillHeight
      )


      // =========================
      // FACE
      // =========================

      Image(
         painter = painterResource(id = R.drawable.base_white_eyes),
         contentDescription = "Avatar eyes base",
         modifier = Modifier
            .fillMaxWidth()
            .height(500.dp)
            .align(Alignment.Center),
         contentScale = ContentScale.FillHeight
      )

      Image(
         painter = painterResource(id = R.drawable.eyes_lashes1),
         contentDescription = "Avatar eyes and lashes",
         modifier = Modifier
            .fillMaxWidth()
            .height(500.dp)
            .align(Alignment.Center),
         contentScale = ContentScale.FillHeight
      )

      Image(
         painter = painterResource(id = R.drawable.eye1c),
         contentDescription = "Avatar eye colour",
         modifier = Modifier
            .fillMaxWidth()
            .height(500.dp)
            .align(Alignment.Center),
         contentScale = ContentScale.FillHeight
      )

      Image(
         painter = painterResource(id = R.drawable.lash_1),
         contentDescription = "Avatar lashes",
         modifier = Modifier
            .fillMaxWidth()
            .height(500.dp)
            .align(Alignment.Center),
         contentScale = ContentScale.FillHeight
      )

      Image(
         painter = painterResource(id = R.drawable.nose_2),
         contentDescription = "Avatar nose",
         modifier = Modifier
            .fillMaxWidth()
            .height(500.dp)
            .align(Alignment.Center),
         contentScale = ContentScale.FillHeight
      )


      // =========================
      // EYEBROWS
      // =========================

      Image(
         painter = painterResource(id = R.drawable.neutro_eyebrows1),
         contentDescription = "Avatar eyebrows",
         modifier = Modifier
            .fillMaxWidth()
            .height(240.dp)
            .align(Alignment.Center)
            .offset(y = (-150).dp),
         contentScale = ContentScale.FillHeight
      )


      // =========================
      // HAIR
      // =========================

      Image(
         painter = painterResource(id = R.drawable.hair_1),
         contentDescription = "Avatar hair",
         modifier = Modifier
            .width(240.dp)
            .height(243.dp)
            .align(Alignment.TopCenter)
            .offset(y = (142).dp),
         contentScale = ContentScale.FillHeight
      )

      Image(
         painter = painterResource(id = R.drawable.extention_hair),
         contentDescription = "Avatar hair extensions",
         modifier = Modifier
            .width(240.dp)
            .height(243.dp)
            .align(Alignment.Center)
            .offset(y = (-142).dp),
         contentScale = ContentScale.FillHeight
      )


      // =========================
      // SHOES
      // =========================

      Image(
         painter = painterResource(id = R.drawable.shoe_4),
         contentDescription = "Avatar shoes",
         modifier = Modifier
            .fillMaxWidth()
            .height(500.dp)
            .align(Alignment.Center),
         contentScale = ContentScale.FillHeight
      )

      // =========================
// MOUTH
// =========================

      Image(
         painter = painterResource(id = R.drawable.grin_mouth),
         contentDescription = "Avatar mouth",
         modifier = Modifier
            .width(240.dp)
            .height(243.dp)
            .align(Alignment.Center)
            .offset(y = (-155).dp),
         contentScale = ContentScale.FillHeight
      )

      Image(
         painter = painterResource(id = R.drawable.lipstick6_grin),
         contentDescription = "Avatar lipstick",
         modifier = Modifier
            .width(245.dp)
            .height(245.dp)
            .align(Alignment.Center)
            .offset(y = (-155).dp),
         contentScale = ContentScale.FillHeight
      )

      // =========================
// CLOTHING ACCESSORY
// =========================

      Image(
         painter = painterResource(id = R.drawable.top_real1),
         contentDescription = "Avatar clothing accessory",
         modifier = Modifier
            .width(111.dp)
            .height(140.dp)
            .align(Alignment.Center)
            .offset(y = (-44).dp),
         contentScale = ContentScale.Fit
      )

      // =========================
// ROOM DECORATION
// =========================

      Image(
         painter = painterResource(id = R.drawable.blue_lamp),
         contentDescription = "Blue lamp",
         modifier = Modifier
            .width(92.dp)
            .height(354.dp)
            .align(Alignment.CenterStart)
            .offset(x = 26.dp, y = 100.dp),
         contentScale = ContentScale.Fit
      )
   }
}