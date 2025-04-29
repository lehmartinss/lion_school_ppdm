package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Search
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun TelaCursos() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    listOf(
                        Color(0xFFFFFFFF),
                        Color(0xFFFFFFFF)
                    )
                )
            ),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 16.dp)

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
                ){
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
                    Text(text = stringResource(R.string.your_course))
                },
                trailingIcon =  {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "",
                        tint = Color.Gray
                    )
                } ,
            )
            Row (
                modifier = Modifier
                    .padding(top = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(id = R.drawable.lion_list),
                    contentDescription = " list ",
                    modifier = Modifier
                        .size(30.dp)
                )
                Text(
                    text = stringResource(R.string.course),
                    fontSize = 20.sp,
                    color = Color(0xFF3347B0),
                    fontWeight = FontWeight.Bold
                )
            }
            Column {
                Card(
                    modifier = Modifier
                        .height(190.dp)
                        .fillMaxWidth()
                        .padding(10.dp),
                    shape = RoundedCornerShape(12.dp),
                    border = BorderStroke(
                        width = 1.dp,
                        color = Color(0XFFFFC23D)
                    ),
                    colors = CardDefaults.cardColors(
                        containerColor =  Color(0XFF3347B0)
                    )

                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(start = 15.dp, bottom = 8.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Image(
                                painter = painterResource(R.drawable.programming),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(100.dp),
                            )
                            Text(
                                text = stringResource(R.string.DS),
                                fontWeight = FontWeight.Bold,
                                fontSize = 55.sp,
                                color = Color(0xFFF9B036)
                            )
                        }
                        Text(
                            text = stringResource(R.string.ds),
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFFFFFFF)
                        )
                        Text(
                            modifier = Modifier
                                .padding(top = 5.dp),
                            text = stringResource(R.string.text),
                            fontSize = 12.sp,
                            color = Color(0xFFFFFFFF)
                        )
                        Row(
                            modifier = Modifier
                                .padding(top = 15.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.watch_later),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(14.dp)

                            )
                            Text(
                                text = stringResource(R.string.semesters),
                                fontSize = 10.sp,
                                color = Color(0xFFFFFFFF),
                                modifier = Modifier
                                    .padding(5.dp)
                            )
                        }
                    }
                }
                Card(
                    modifier = Modifier
                        .height(190.dp)
                        .fillMaxWidth()
                        .padding(10.dp),
                    shape = RoundedCornerShape(12.dp),
                    border = BorderStroke(
                        width = 0.dp,
                        color = Color(0XFFFFC23D)
                    ),
                    colors = CardDefaults.cardColors(
                        containerColor =  Color(0XFF3347B0)
                    )

                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(start = 15.dp, bottom = 8.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Image(
                                painter = painterResource(R.drawable.internet),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(100.dp),
                                contentScale = ContentScale.Fit
                            )
                            Text(
                                text = stringResource(R.string.RDS),
                                fontWeight = FontWeight.Bold,
                                fontSize = 55.sp,
                                color = Color(0xFFF9B036)
                            )
                        }
                        Text(
                            text = stringResource(R.string.rds),
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFFFFFFF)
                        )
                        Text(
                            modifier = Modifier
                                .padding(top = 5.dp),
                            text = stringResource(R.string.text2),
                            fontSize = 12.sp,
                            color = Color(0xFFFFFFFF)
                        )
                        Row(
                            modifier = Modifier
                                .padding(top = 15.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.watch_later),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(20.dp)

                            )
                            Text(
                                text = stringResource(R.string.semesters),
                                fontSize = 15.sp,
                                color = Color(0xFFFFFFFF),
                                modifier = Modifier
                                    .padding(5.dp)


                            )
                        }
                    }
                }
                Card(
                    modifier = Modifier
                        .height(190.dp)
                        .fillMaxWidth()
                        .padding(10.dp),
                    shape = RoundedCornerShape(12.dp),
                    border = BorderStroke(
                        width = 0.dp,
                        color = Color(0XFFFFC23D)
                    ),
                    colors = CardDefaults.cardColors(
                        containerColor =  Color(0XFF3347B0)
                    )

                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(start = 15.dp, bottom = 8.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Image(
                                painter = painterResource(R.drawable.lion_chip),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(100.dp),
                                contentScale = ContentScale.Fit
                            )
                            Text(
                                text = stringResource(R.string.ELE),
                                fontWeight = FontWeight.Bold,
                                fontSize = 55.sp,
                                color = Color(0xFFF9B036)
                            )
                        }
                        Text(
                            text = stringResource(R.string.ele),
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFFFFFFF)
                        )
                        Text(
                            modifier = Modifier
                                .padding(top = 5.dp),
                            text = stringResource(R.string.text3),
                            fontSize = 12.sp,
                            color = Color(0xFFFFFFFF)
                        )
                        Row(
                            modifier = Modifier
                                .padding(top = 15.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.watch_later),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(20.dp)

                            )
                            Text(
                                text = stringResource(R.string.semesters),
                                fontSize = 15.sp,
                                color = Color(0xFFFFFFFF),
                                modifier = Modifier
                                    .padding(5.dp)


                            )
                        }
                    }

                }
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun TelaCursosPreview() {
    TelaCursos()
}