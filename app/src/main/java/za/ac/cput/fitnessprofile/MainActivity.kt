package za.ac.cput.fitnessprofile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(Message("Junaid", "Fitness Profile"))
            DifferentFonts(Message("Junaid", "Fitness Profile"))
        }
    }
}

data class Message(val author: String, val body: String)

@Composable
fun MessageCard(msg: Message) {
    Column(modifier = Modifier
        .padding(all = 9.dp)
        .background(color = Color.White)){
        Row(
            modifier = Modifier
                .padding(all = 9.dp)
                .width(260.dp)
                .height(80.dp)
        )
        {
            androidx.compose.foundation.Image(painter = painterResource(R.drawable._cf10a06_aa26_4ce9_b4f8_17e1491816e9),
                contentDescription = "Profile Picture" )

            Spacer(modifier = Modifier.width(10.dp))

            Column{
                Text("Junaid",
                        fontSize = 20.sp,
                        color = Color.Red)
                Text("Cedrass",
                        fontSize = 20.sp,
                        color = Color.Red)
                Text("ID:2334342123",
                        color = Color.Red)

                Spacer(modifier = Modifier.height(10.dp))
            }
        }

        Row(
            modifier = Modifier
                .padding(all = 10.dp)
                .background(color = Color.Blue, RoundedCornerShape(5.dp))
                .width(280.dp)
                .height(50.dp)
        ) {
            Spacer(modifier = Modifier.width(20.dp))
            Spacer(modifier = Modifier.height(20.dp))

            Column{
                Text("Height",
                fontSize = 15.sp,
                color = Color.White)
            }

            Spacer(modifier = Modifier.width(20.dp))

            Column{
                Text("Glucose",
                fontSize = 15.sp,
                color = Color.White)
                Text("69.6",
                fontSize = 15.sp,
                color = Color.White)
            }

            Spacer(modifier = Modifier.width(20.dp))

            Column{
                Text("Blood Pressure",
                fontSize = 15.sp,
                color = Color.White)
            }
        }
    }
}

@Composable
fun DifferentFonts(msg: Message){

}
@Preview
@Composable
fun MessageCard() {
    MessageCard(
        msg = Message("Colleague", "Looks whats happening")
    )
    DifferentFonts(
        msg = Message("Colleague", "Looks whats happening")
    )
    }
