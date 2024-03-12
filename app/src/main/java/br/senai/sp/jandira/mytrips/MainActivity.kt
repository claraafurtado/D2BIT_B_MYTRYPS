package br.senai.sp.jandira.mytrips

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.ui.theme.MytripsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MytripsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(
    ) {

        Card(

            modifier = Modifier
                .height(40.dp)
                .width(150.dp)
                .padding(0.dp)
                .offset(x = 250.dp, y = -4.dp),
            shape = RoundedCornerShape(10.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFC490DA))

        ) {


        }

        Column(
            modifier = Modifier
                .height(1200.dp)
                .fillMaxWidth()
        ) {
            Column(

                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)

            ) {
                Text(
                    text = "Sing up",
                    textAlign = TextAlign.Justify,

                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 37.sp,
                    modifier = Modifier
                        .offset(x = 110.dp, y = 20.dp)
                        .padding(bottom = 40.dp),
                    color = Color(0xFFC490DA),


                    )
                Text(
                    text = "Create a new account",
                    textAlign = TextAlign.Start,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 15.sp,
                    modifier = Modifier
                        .offset(x = 100.dp, y = -20.dp)
                        .padding(bottom = 5.dp),
                    color = Color(0xFFCAC6CA)
                )

                Box(

                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp),
                    contentAlignment = Alignment.Center

                ){


                    Image(painter = painterResource(id = R.drawable.aaa),
                        contentDescription = "",
                        modifier = Modifier
                            .size(width = 200.dp, height = 200.dp)
                    )

                    Image(painter = painterResource(id = R.drawable.profile), contentDescription = "",
                        modifier = Modifier
                            .size(width = 150.dp, height = 80.dp)


                    )
                }
                Image(painter = painterResource(id = R.drawable.camera), contentDescription = "",
                    modifier = Modifier
                        .size(width = 30.dp, height =30.dp)
                        .offset(x = 200.dp, y = (-30.dp) )


                )




                OutlinedTextField(value = "usuário",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp),
                    leadingIcon ={
                        Icon(imageVector = Icons.Filled.Person,
                            contentDescription = "",
                            tint = Color(0xFFC490DA)
                        )
                    },

                    label = {
                        Text(text = "nome")
                    },
                    colors = OutlinedTextFieldDefaults.
                    colors(
                        focusedBorderColor = Color(0xFFC490DA),
                        unfocusedBorderColor =  Color(color = 0xFFC490DA),
                    ))
                Spacer(modifier = Modifier.height(16.dp))
                OutlinedTextField(value = "9999-9999",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp),
                    leadingIcon ={
                        Icon(imageVector = Icons.Filled.Call,
                            contentDescription = "",
                            tint = Color(0xFFC490DA)
                        )
                    },

                    label = {
                        Text(text = "telefone")
                    },
                    colors = OutlinedTextFieldDefaults.
                    colors(
                        focusedBorderColor = Color(0xFFC490DA),
                        unfocusedBorderColor =  Color(color = 0xFFC490DA),
                    ))


                Spacer(modifier = Modifier.height(16.dp))
                OutlinedTextField(value = "teste@email.com",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp),
                    leadingIcon ={
                        Icon(imageVector = Icons.Filled.Email,
                            contentDescription = "",
                            tint = Color(0xFFC490DA)
                        )
                    },

                    label = {
                        Text(text = "E-mail")
                    },
                    colors = OutlinedTextFieldDefaults.
                    colors(
                        focusedBorderColor = Color(0xFFC490DA),
                        unfocusedBorderColor =  Color(color = 0xFFC490DA),
                    ))
                Spacer(modifier = Modifier.height(16.dp))

                OutlinedTextField(value = "**********",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp),
                    leadingIcon ={
                        Icon(imageVector = Icons.Filled.Lock,
                            contentDescription = "",
                            tint = Color(0xFFC490DA)
                        )
                    },
                    label = {
                        Text(text = "Senha")
                    },
                    colors = OutlinedTextFieldDefaults.
                    colors(
                        focusedBorderColor = Color(0xFFC490DA),
                        unfocusedBorderColor =  Color(color = 0xFFC490DA),
                    ))

                Image(painter = painterResource(id = R.drawable.retangulo), contentDescription = "",
                    modifier = Modifier
                        .size(width = 30.dp, height = 30.dp)
                        .offset(x = 10.dp, y = 25.dp)

                )

                Spacer(modifier = Modifier.height(30.dp))

                Text(text ="over 18?",
                    fontSize = 15.sp,
                    color = Color(0xFF000000),
                    modifier = Modifier.offset(x = 50.dp, y =-30.dp),
                    fontWeight = FontWeight.Bold)

                Button(onClick = { /*TODO*/ },
                    modifier = Modifier
                        .height(50.dp)
                        .fillMaxWidth(),


                    shape = RoundedCornerShape(15.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFC490DA)
                    )){
                    Row {
                        Text(text = "CREAT ACCOUNT ",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.offset())
                        Icon(imageVector = Icons.Filled.ArrowForward,
                            contentDescription = "")

                    }
                }



            }
            Card(modifier = Modifier
                .height(40.dp)
                .width(150.dp)
                .offset(x = -20.dp, y = 160.dp),
                colors = CardDefaults.cardColors(Color(0xFF9036A0))
            ){

            }

        }

    }

}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MytripsTheme {
        Greeting()
    }
}