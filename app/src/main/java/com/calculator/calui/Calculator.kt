package com.calculator.calui

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.calculator.R
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp


@Composable
fun myCalculatorUI() {


    val context = LocalContext.current

    val number = remember {
        mutableStateOf("")
    }



    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.black))
    ) {


        Column(modifier = Modifier.padding(10.sdp)) {

            IconButton(
                onClick = {
                    Toast.makeText(context, "Hello", Toast.LENGTH_SHORT).show()
                },
                content = {
                    Icon(
                        painter = painterResource(id = R.drawable.brightness),
                        contentDescription = "Image Brightness"
                    )
                },
                modifier = Modifier
                    .background(colorResource(id = R.color.white))
            )


            Spacer(modifier = Modifier.padding(30.sdp))

            TextField(
                value = number.value,
                onValueChange = { number.value = it },
                modifier = Modifier
                    .padding(10.sdp)
                    .fillMaxWidth()
                    .height(70.sdp)
                    .background(Color.White),
                colors = TextFieldDefaults.textFieldColors(colorResource(id = R.color.black)),
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number)
            )

        }

        Box(
            modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp)
                    .align(alignment = Alignment.BottomCenter)
                    .clip(RoundedCornerShape(15.sdp, 15.sdp, 0.sdp, 0.sdp))
            ) {

                Row(
                    modifier = Modifier.padding(10.sdp),
                    verticalAlignment = Alignment.Bottom
                ) {

                    Column(
                        modifier = Modifier
                            .padding(10.sdp)
                    ) {

                        Button(
                            onClick = {
                                number.value
                            },
                            content = {
                                Text(text = "C", color = Color.Green, fontSize = 15.ssp)
                            },
                            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.white))
                        )

                        Spacer(modifier = Modifier.padding(10.sdp))

                        Button(
                            onClick = {
                                number.value
                            },
                            content = {
                                Text(text = "7", color = Color.Black, fontSize = 15.ssp)
                            },
                            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.white))
                        )

                        Spacer(modifier = Modifier.padding(10.sdp))

                        Button(
                            onClick = {
                                number.value
                            },
                            content = {
                                Text(text = "4", color = Color.Black, fontSize = 15.ssp)
                            },
                            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.white))
                        )

                        Spacer(modifier = Modifier.padding(10.sdp))

                        Button(
                            onClick = {
                                number.value
                            },
                            content = {
                                Text(text = "1", color = Color.Black, fontSize = 15.ssp)
                            },
                            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.white))
                        )

                        Spacer(modifier = Modifier.padding(10.sdp))

                        Button(
                            onClick = {
                                number.value
                            },
                            content = {
                                Text(text = "00", color = Color.Black, fontSize = 15.ssp)
                            },
                            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.white))
                        )
                    }

                    Column(
                        modifier = Modifier.padding(10.sdp)
                    ) {

                        Button(
                            onClick = {
                                number.value
                            },
                            content = {
                                Text(text = "8", color = Color.Black, fontSize = 15.ssp)
                            },
                            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.white))
                        )

                        Spacer(modifier = Modifier.padding(10.sdp))

                        Button(
                            onClick = {
                                number.value
                            },
                            content = {
                                Text(text = "5", color = Color.Black, fontSize = 15.ssp)
                            },
                            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.white))
                        )

                        Spacer(modifier = Modifier.padding(10.sdp))

                        Button(
                            onClick = {
                                number.value
                            },
                            content = {
                                Text(text = "2", color = Color.Black, fontSize = 15.ssp)
                            },
                            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.white))
                        )

                        Spacer(modifier = Modifier.padding(10.sdp))

                        Button(
                            onClick = {
                                number.value
                            },
                            content = {
                                Text(text = "0", color = Color.Black, fontSize = 15.ssp)
                            },
                            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.white))
                        )
                    }

                    Column(
                        modifier = Modifier.padding(10.sdp)
                    ) {

                        Button(
                            onClick = {
                                number.value
                            },
                            content = {
                                Text(text = "9", color = Color.Black, fontSize = 15.ssp)
                            },
                            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.white))
                        )

                        Spacer(modifier = Modifier.padding(10.sdp))

                        Button(
                            onClick = {
                                number.value
                            },
                            content = {
                                Text(text = "6", color = Color.Black, fontSize = 15.ssp)
                            },
                            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.white))
                        )

                        Spacer(modifier = Modifier.padding(10.sdp))

                        Button(
                            onClick = {
                                number.value
                            },
                            content = {
                                Text(text = "3", color = Color.Black, fontSize = 15.ssp)
                            },
                            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.white))
                        )

                        Spacer(modifier = Modifier.padding(10.sdp))

                        Button(
                            onClick = {
                                number.value
                            },
                            content = {
                                Text(text = ".", color = Color.Black, fontSize = 15.ssp)
                            },
                            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.white))
                        )
                    }

                    Column(
                        modifier = Modifier.padding(10.sdp)
                    ) {

                        Button(
                            onClick = {
                                number.value = 0.toString()
                            },
                            content = {
                                Text(text = "/", color = Color.Red, fontSize = 15.ssp)
                            },
                            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.white))
                        )

                        Spacer(modifier = Modifier.padding(10.sdp))

                        Button(
                            onClick = {
                                number.value
                            },
                            content = {
                                Text(text = "x", color = Color.Red, fontSize = 15.ssp)
                            },
                            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.white))
                        )

                        Spacer(modifier = Modifier.padding(10.sdp))

                        Button(
                            onClick = {
                                number.value
                            },
                            content = {
                                Text(text = "-", color = Color.Red, fontSize = 15.ssp)
                            },
                            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.white))
                        )

                        Spacer(modifier = Modifier.padding(10.sdp))

                        Button(
                            onClick = {
                                number.value
                            },
                            content = {
                                Text(text = "+", color = Color.Red, fontSize = 15.ssp)
                            },
                            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.white))
                        )

                        Spacer(modifier = Modifier.padding(10.sdp))

                        Button(
                            onClick = {
                                number.value
                            },
                            content = {
                                Text(text = "=", color = Color.Red, fontSize = 15.ssp)
                            },
                            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.white))
                        )
                    }

                }

            }
        }

    }

}
