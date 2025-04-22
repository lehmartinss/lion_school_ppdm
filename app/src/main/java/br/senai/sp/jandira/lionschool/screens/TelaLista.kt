package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
                Text(
                    text = stringResource(R.string.name),
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(color = 0xFF3347B0)

                )
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .background(Color(0xFFF9B036), CircleShape)
                        .wrapContentSize(Alignment.Center)
                ){
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
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 15.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.SpaceAround
            ){
                Button(
                    onClick = {},
                    shape = RoundedCornerShape(90.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color( 0XFF3347B0)
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
                        containerColor = Color( 0XFFFFC23D)
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
                        containerColor = Color( 0XFFFFC23D)
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

        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun TelaListaPreview() {
    TelaLista()
}