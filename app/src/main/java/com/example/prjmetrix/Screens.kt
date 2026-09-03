package com.example.prjmetrix

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import  androidx.compose.runtime.Composable
import  androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Article
import androidx.compose.material.icons.filled.Article
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

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
            .height(700.dp)
            .align(Alignment.TopStart),
         contentScale = ContentScale.FillHeight
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

      // =========================
// ACTION BUTTONS
// =========================

      Box(
         modifier = Modifier
            .width(65.dp)
            .height(70.dp)
            .align(Alignment.TopEnd)
            .offset(
               x = (-40).dp,
               y = 218.dp
            )
      ) {
         androidx.compose.material3.Card(
            modifier = Modifier.fillMaxSize(),
            shape = androidx.compose.foundation.shape.CircleShape,
            colors = androidx.compose.material3.CardDefaults.cardColors(
               containerColor = androidx.compose.ui.graphics.Color.White.copy(alpha = 0.75f)
            )
         ) {
            // We'll put the actual icon here later
         }
      }

      Box(
         modifier = Modifier
            .width(65.dp)
            .height(70.dp)
            .align(Alignment.TopEnd)
            .offset(
               x = (-40).dp,
               y = 320.dp
            )
      ) {
         androidx.compose.material3.Card(
            modifier = Modifier.fillMaxSize(),
            shape = androidx.compose.foundation.shape.CircleShape,
            colors = androidx.compose.material3.CardDefaults.cardColors(
               containerColor = androidx.compose.ui.graphics.Color.White.copy(alpha = 0.75f)
            )
         ) {
            // Icon later
         }
      }

      Box(
         modifier = Modifier
            .width(65.dp)
            .height(70.dp)
            .align(Alignment.TopEnd)
            .offset(
               x = (-40).dp,
               y = 424.dp
            )
      ) {
         androidx.compose.material3.Card(
            modifier = Modifier.fillMaxSize(),
            shape = androidx.compose.foundation.shape.CircleShape,
            colors = androidx.compose.material3.CardDefaults.cardColors(
               containerColor = androidx.compose.ui.graphics.Color.White.copy(alpha = 0.75f)
            )
         ) {
            // Icon later
         }
      }

// =========================
// HABIT CARDS
// =========================

      androidx.compose.material3.Card(
         modifier = Modifier
            .width(105.dp)
            .height(38.dp)
            .align(Alignment.TopEnd)
            .offset(
               x = (-25).dp,
               y = 272.dp
            ),
         shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
         colors = androidx.compose.material3.CardDefaults.cardColors(
            containerColor = androidx.compose.ui.graphics.Color.White.copy(alpha = 0.75f)
         ),
         elevation = androidx.compose.material3.CardDefaults.cardElevation(
            defaultElevation = 6.dp
         )
      ) {
         androidx.compose.foundation.layout.Row(
            modifier = Modifier
               .fillMaxSize()
               .padding(horizontal = 10.dp),
            verticalAlignment = Alignment.CenterVertically
         ) {

            Text(
               text = "💧",
               fontSize = 14.sp,
               modifier= Modifier.offset(y= (-2).dp)
            )

            Text(
               text = "Drink Water",
               modifier = Modifier.padding(start = 4.dp),
               fontSize = 9.sp,
               fontWeight = FontWeight.Bold,
               maxLines = 1


            )
         }
      }
      androidx.compose.material3.Card(
         modifier = Modifier
            .width(105.dp)
            .height(38.dp)
            .align(Alignment.TopEnd)
            .offset(
               x = (-21).dp,
               y = 376.dp
            ),
         shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
         colors = androidx.compose.material3.CardDefaults.cardColors(
            containerColor = androidx.compose.ui.graphics.Color.White.copy(alpha = 0.75f)
         ),
         elevation = androidx.compose.material3.CardDefaults.cardElevation(
            defaultElevation = 6.dp
         )
      ) {
         androidx.compose.foundation.layout.Row(
            modifier = Modifier
               .fillMaxSize()
               .padding(horizontal = 10.dp),
            verticalAlignment = Alignment.CenterVertically
         ) {

            Text(
               text = "🪥",
               fontSize = 14.sp
            )

            Text(
               text = "Brush Teeth",
               modifier = Modifier.padding(start = 4.dp),
               fontSize = 9.sp,
               fontWeight = FontWeight.Bold,
               maxLines = 1
            )
         }
      }

      androidx.compose.material3.Card(
         modifier = Modifier
            .width(105.dp)
            .height(38.dp)
            .align(Alignment.TopEnd)
            .offset(
               x = (-25).dp,
               y = 480.dp
            ),
         shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
         colors = androidx.compose.material3.CardDefaults.cardColors(
            containerColor = androidx.compose.ui.graphics.Color.White.copy(alpha = 0.75f)
         ),
         elevation = androidx.compose.material3.CardDefaults.cardElevation(
            defaultElevation = 6.dp
         )
      ) {
         androidx.compose.foundation.layout.Row(
            modifier = Modifier
               .fillMaxSize()
               .padding(horizontal = 10.dp),
            verticalAlignment = Alignment.CenterVertically
         ) {

            Text(
               text = "🏃",
               fontSize = 14.sp
            )

            Text(
               text = "Cardio",
               modifier = Modifier.padding(start = 4.dp),
               fontSize = 9.sp,
               fontWeight = FontWeight.Bold,
               maxLines = 1
            )
         }
      }
      // =========================
// BOTTOM NOTICE BOARD
// =========================

      androidx.compose.material3.Card(
         modifier = Modifier
            .fillMaxWidth()
            .height(220.dp)
            .padding(horizontal = 14.dp)
            .align(Alignment.BottomCenter)
            .offset(y = (-10).dp),

         shape = RoundedCornerShape(18.dp),

         colors = CardDefaults.cardColors(
            containerColor = Color.White.copy(alpha = 0.82f)
         ),

         elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp
         )
      ) {

         Column(
            modifier = Modifier
               .fillMaxSize()
               .verticalScroll(rememberScrollState())
               .padding(12.dp)
         ) {

            // =========================
            // HEADER
            // =========================

            androidx.compose.foundation.layout.Row(
               modifier = Modifier.fillMaxWidth(),
               verticalAlignment = Alignment.CenterVertically
            ) {

               Text(
                  text = "HAPPINESS: EXTREMELY DELULU ✨",
                  fontSize = 12.sp,
                  fontWeight = FontWeight.ExtraBold,
                  color = Color(0xFF43302E),
                  modifier = Modifier.weight(1f)
               )

               Text(
                  text = "⌃",
                  fontSize = 20.sp,
                  color = Color(0xFF64748B)
               )
            }

            Spacer(
               modifier = Modifier.height(8.dp)
            )

            // =========================
            // HAPPINESS PROGRESS
            // =========================

            LinearProgressIndicator(
               progress = { 0.85f },
               color = Color(0xFF00BCD4),
               modifier = Modifier
                  .fillMaxWidth()
                  .height(9.dp)
            )

            Spacer(
               modifier = Modifier.height(12.dp)
            )

            // =========================
            // REWARD / MOOD ROW
            // =========================

            androidx.compose.foundation.layout.Row(
               modifier = Modifier
                  .fillMaxWidth()
                  .horizontalScroll(rememberScrollState()),
               horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {

               listOf(
                  "😃",
                  "💕",
                  "🛍️",
                  "☕",
                  "🌸",
                  "📷",
                  "🎬"
               ).forEach { emoji ->

                  androidx.compose.material3.Card(
                     modifier = Modifier.size(36.dp),
                     shape = RoundedCornerShape(9.dp),
                     colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFE2E8F0)
                     ),
                     elevation = CardDefaults.cardElevation(
                        defaultElevation = 0.dp
                     )
                  ) {

                     Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                     ) {

                        Text(
                           text = emoji,
                           fontSize = 17.sp
                        )
                     }
                  }
               }
            }

            Spacer(
               modifier = Modifier.height(12.dp)
            )

            // =========================
            // TO-DO HEADER
            // =========================

            Text(
               text = "Natty's To-Do List",
               modifier = Modifier.fillMaxWidth(),
               textAlign = androidx.compose.ui.text.style.TextAlign.Center,
               fontSize = 12.sp,
               fontWeight = FontWeight.ExtraBold,
               color = Color(0xFF43302E)
            )

            Spacer(
               modifier = Modifier.height(8.dp)
            )

            // =========================
            // TO-DO ITEM
            // =========================

            NoticeTodoItem(
               text = "Drink water"
            )

            NoticeTodoItem(
               text = "Pick an outfit"
            )

            NoticeTodoItem(
               text = "Do homework"
            )

            NoticeTodoItem(
               text = "Go for a walk"
            )

            Spacer(
               modifier = Modifier.height(16.dp)
            )

         }


      }

      // =========================
// TOP GAME NAVBAR
// =========================
      JetpackTopNavbar(
         coins = 1250,

         onNewsClick = {
            // TODO: Open News
         },

         onProfileClick = {
            // TODO: Open Profile
         },

         onMoreClick = {
            // TODO: Open More menu
         }
      )
   }

}
@Composable
fun NoticeTodoItem(
   text: String
) {

   androidx.compose.foundation.layout.Row(
      modifier = Modifier
         .fillMaxWidth()
         .height(34.dp),

      verticalAlignment = Alignment.CenterVertically
   ) {

      Text(
         text = text,
         modifier = Modifier.weight(1f),
         fontSize = 10.sp,
         color = Color(0xFF333333)
      )

      Text(
         text = "🪙",
         fontSize = 14.sp
      )
   }
}
@Composable
fun JetpackTopNavbar(
   coins: Int,
   onNewsClick: () -> Unit,
   onProfileClick: () -> Unit,
   onMoreClick: () -> Unit
) {

   val barBlue = Color(0xFFB7D7EC)
   val buttonBlue = Color(0xFFDDF1FC)
   val coinBlue = Color(0xFFEAF8FF)
   val outlineBlue = Color(0xFF6688A7)
   val iconBlue = Color(0xFF405D7C)

   Surface(
      modifier = Modifier
         .fillMaxWidth()

         .height(90.dp),

      color = barBlue.copy(alpha = 0.90f),

      shadowElevation = 3.dp
   ) {

      Box(
         modifier = Modifier.fillMaxSize()
      ) {

         // ============================================
         // BOTTOM LINE
         // ============================================

         Box(
            modifier = Modifier
               .fillMaxWidth()
               .height(2.dp)
               .align(Alignment.BottomCenter)
               .background(
                  outlineBlue.copy(alpha = 0.9f)
               )
         )


         // ============================================
         // LEFT — NEWS
         // ============================================

         GameTinyButton(
            modifier = Modifier
               .align(Alignment.CenterStart)
               .offset(y = (23).dp)
               .padding(start = 12.dp),

            onClick = onNewsClick,

            backgroundColor = buttonBlue,
            outlineColor = outlineBlue
         ) {

            Icon(
               imageVector = Icons.Default.Article,
               contentDescription = "News",
               tint = iconBlue,
               modifier = Modifier.size(19.dp)
            )
         }


         // ============================================
         // RIGHT — PROFILE + MORE
         // ============================================

         Row(
            modifier = Modifier
               .align(Alignment.CenterEnd)
               .offset(y = (23).dp)
               .padding(end = 12.dp),

            verticalAlignment = Alignment.CenterVertically,

            horizontalArrangement = Arrangement.spacedBy(5.dp)
         ) {

            // PROFILE

            GameTinyButton(
               onClick = onProfileClick,

               backgroundColor = buttonBlue,
               outlineColor = outlineBlue
            ) {

               Icon(
                  imageVector = Icons.Default.Person,
                  contentDescription = "Profile",
                  tint = iconBlue,
                  modifier = Modifier.size(19.dp)
               )
            }


            // MORE

            GameTinyButton(
               onClick = onMoreClick,

               backgroundColor = buttonBlue,
               outlineColor = outlineBlue
            ) {

               Icon(
                  imageVector = Icons.Default.MoreVert,
                  contentDescription = "More",
                  tint = iconBlue,
                  modifier = Modifier.size(21.dp)
               )
            }
         }


         // ============================================
         // COINS — CENTER
         // ============================================

         GameTinyCoinDisplay(
            coins = coins,

            backgroundColor = coinBlue,

            outlineColor = outlineBlue,

            modifier = Modifier
               .align(Alignment.Center)
               .offset(y = (23).dp)
         )
      }
   }
}

@Composable
fun GameTinyButton(
   modifier: Modifier = Modifier,
   onClick: () -> Unit,
   backgroundColor: Color,
   outlineColor: Color,
   content: @Composable () -> Unit
) {

   Box(
      modifier = modifier
         .size(34.dp)
         .clip(RoundedCornerShape(9.dp))
         .background(outlineColor)
         .padding(2.dp)
         .clip(RoundedCornerShape(7.dp))
         .background(backgroundColor)
         .clickable {
            onClick()
         },

      contentAlignment = Alignment.Center
   ) {

      // Tiny glossy highlight

      Box(
         modifier = Modifier
            .fillMaxWidth()
            .height(7.dp)
            .align(Alignment.BottomCenter)
            .clip(RoundedCornerShape(6.dp))
            .background(
               Color.White.copy(alpha = 0.28f)
            )
      )

      content()
   }
}

@Composable
fun GameTinyCoinDisplay(
   coins: Int,
   backgroundColor: Color,
   outlineColor: Color,
   modifier: Modifier = Modifier
) {

   Box(
      modifier = modifier
         .width(110.dp)
         .height(34.dp)
         .clip(RoundedCornerShape(10.dp))
         .background(outlineColor)
         .padding(2.dp)
         .clip(RoundedCornerShape(8.dp))
         .background(backgroundColor),

      contentAlignment = Alignment.Center
   ) {

      // Glossy highlight

      Box(
         modifier = Modifier
            .fillMaxWidth()
            .height(7.dp)
            .align(Alignment.BottomCenter)
            .clip(RoundedCornerShape(6.dp))
            .background(
               Color.White.copy(alpha = 0.30f)
            )
      )

      Row(
         verticalAlignment = Alignment.CenterVertically,
         horizontalArrangement = Arrangement.Center
      ) {

         Text(
            text = "🪙",
            fontSize = 17.sp
         )

         Spacer(
            modifier = Modifier.width(5.dp)
         )

         Text(
            text = coins.toString(),
            color = Color(0xFF405D7C),
            fontSize = 16.sp,
            fontWeight = FontWeight.ExtraBold
         )
      }
   }
}