package com.recepgemalmaz.pazarama_bootcamp_jackpack_compose

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.recepgemalmaz.pazarama_bootcamp_jackpack_compose.ui.theme.Pazarama_Bootcamp_Jackpack_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {

            GUI()

        }
    }

    @Composable
    @Preview()
    fun GUI() {

        Row(modifier = Modifier.fillMaxSize(), Arrangement.Center, Alignment.CenterVertically){
            Text(
                text = "Recep", color = Color.Yellow,
                fontSize = 20.sp, fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                    .background(color = Color.Blue)
                    .padding(10.dp)
                    .rotate(20f)
            )
            Spacer(modifier = Modifier.width(20.dp).height(50.dp).background(Color.Yellow))
            Text(
                text = "Gemalmaz", color = Color.Yellow,
                fontSize = 20.sp, fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                    .background(color = Color.Blue)
                    .padding(10.dp)
            )

        }

    }


}


/*
override fun onBackPressed() {
    //super.onBackPressed()
    var msg = AlertDialog.Builder(this)
    msg.setTitle("Uyarı")
    msg.setMessage("Çıkmak istediğinize emin misiniz?")
    msg.setPositiveButton("Evet") { dialog, which ->
        this.finish()
    }
    msg.show()


    @Composable
fun Greeting(name: String,modifier: Modifier= Modifier) {
    Text(text = "Hello $name!",
        modifier = modifier
        )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Pazarama_Bootcamp_Jackpack_ComposeTheme {
        Greeting("Android")
    }
}
 */



