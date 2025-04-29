package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun TelaLista(){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
                .padding(horizontal = 15.dp, vertical = 15.dp)

        ) {
            Row(
                modifier = Modifier
                    .padding(top = 60.dp),

                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.Start

            ) {
                Image(
                    painterResource(id = R.drawable.logo_image),
                    contentDescription = stringResource(
                        R.string.logo_description
                    ),
                    modifier = Modifier
                        .size(75.dp)

                )
                Column(
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = stringResource(R.string.name1),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(color = 0xFF3347B0)
                    )
                    Text(
                        text = stringResource(R.string.name2),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(color = 0xFF3347B0)
                    )
                }
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .background(Color(0xFFF9B036), CircleShape)
                        .wrapContentSize(Alignment.Center)
                ) {
                    Text(
                        text = stringResource(R.string.ds2),
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color(0xFF3347B0)
                    )
                }
            }
            HorizontalDivider(
                modifier = Modifier
                    .padding(
                        top = 10.dp,
                        start = 20.dp,
                        end = 20.dp
                    ),
                color =
                Color(color = 0xFFFFC23D)
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                shape = RoundedCornerShape(10.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xFFFFC23D),
                    focusedBorderColor = Color(0xFFFFC23D)
                ),
                label = {
                    Text(text = stringResource(R.string.student))
                },
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "",
                        tint = Color.Gray
                    )
                },
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 15.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Button(
                    onClick = {},
                    shape = RoundedCornerShape(90.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0XFF3347B0)
                    )
                ) {
                    Text(
                        text = stringResource(R.string.todos),
                        color = Color(0xF5FAFAFA)
                    )
                }
                Button(
                    onClick = {},
                    shape = RoundedCornerShape(90.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0XFFFFC23D)
                    )
                ) {
                    Text(
                        text = stringResource(R.string.cursando),
                        color = Color(0XFF3347B0)
                    )
                }
                Button(
                    onClick = {},
                    shape = RoundedCornerShape(90.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0XFFFFC23D)
                    )
                ) {
                    Text(
                        text = stringResource(R.string.Finalizado),
                        color = Color(0XFF3347B0)
                    )
                }
            }
            Row(
                modifier = Modifier
                    .padding(top = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.lion_graduation),
                    contentDescription = " list ",
                    modifier = Modifier
                        .size(30.dp)
                )
                Text(
                    text = stringResource(R.string.student_list),
                    fontSize = 20.sp,
                    color = Color(0xFF3347B0),
                    fontWeight = FontWeight.Bold
                )
            }
            Box(
                modifier = Modifier
                    .
                    .height(175.dp)
                    .padding(10.dp)
            ) {
                // Fundo amarelo lateral
                Box(
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .background(
                            Color(0xFFFFC23D),
                            RoundedCornerShape(topStart = 15.dp, bottomStart = 15.dp)
                        )
                )
                // Card principal
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .padding(start = 10.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFACB1E5)
                    )
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(start = 15.dp, top = 15.dp, end = 15.dp, bottom = 8.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            Image(
                                modifier = Modifier
                                    .size(60.dp)
                                    .clip(CircleShape),
                                painter = painterResource(R.drawable.img1),
                                contentDescription = "",
                            )
                            Spacer(modifier = Modifier.width(10.dp))
                            Column {
                                Text(
                                    text = stringResource(R.string.img1Name),
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp,
                                    color = Color.White
                                )
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(
                                        painter = painterResource(R.drawable.documento),
                                        contentDescription = "",
                                        tint = Color.White,
                                        modifier = Modifier.size(14.dp)
                                    )
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Text(
                                        text = stringResource(R.string.img1Numero),
                                        fontSize = 14.sp,
                                        color = Color.White
                                    )
                                }
                            }
                        }
                        Spacer(modifier = Modifier.weight(1f))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.End,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.data),
                                contentDescription = "",
                                tint = Color.White,
                                modifier = Modifier.size(14.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Box(
                                modifier = Modifier
                                    .background(Color(0xFF2B62D1), RoundedCornerShape(4.dp))
                                    .padding(horizontal = 8.dp, vertical = 2.dp)
                            ) {
                                Text(
                                    text = stringResource(R.string.data1),
                                    fontSize = 12.sp,
                                    color = Color(0xFFFFC23D),
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                }



                Box(
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .background(Color(0xFFFFC23D),
                            RoundedCornerShape(topStart = 15.dp, bottomStart = 15.dp))
                )
                // Card principal
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .padding(start = 10.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFACB1E5)
                    )
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(start = 15.dp, top = 15.dp, end = 15.dp, bottom = 8.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            Image(
                                modifier = Modifier
                                    .size(60.dp)
                                    .clip(CircleShape),
                                painter = painterResource(R.drawable.img1),
                                contentDescription = "",
                            )
                            Spacer(modifier = Modifier.width(10.dp))
                            Column {
                                Text(
                                    text = stringResource(R.string.img1Name),
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp,
                                    color = Color.White
                                )
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(
                                        painter = painterResource(R.drawable.documento),
                                        contentDescription = "",
                                        tint = Color.White,
                                        modifier = Modifier.size(14.dp)
                                    )
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Text(
                                        text = stringResource(R.string.img1Numero),
                                        fontSize = 14.sp,
                                        color = Color.White
                                    )
                                }
                            }
                        }
                        Spacer(modifier = Modifier.weight(1f))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.End,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.data),
                                contentDescription = "",
                                tint = Color.White,
                                modifier = Modifier.size(14.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Box(
                                modifier = Modifier
                                    .background(Color(0xFF2B62D1), RoundedCornerShape(4.dp))
                                    .padding(horizontal = 8.dp, vertical = 2.dp)
                            ) {
                                Text(
                                    text = stringResource(R.string.data1),
                                    fontSize = 12.sp,
                                    color = Color(0xFFFFC23D),
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun TelaListaPreview() {
    TelaLista()
}