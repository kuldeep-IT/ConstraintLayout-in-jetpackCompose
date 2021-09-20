package com.peerbitskuldeep.jetpackcompose.constraintlayoutinjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension

import com.peerbitskuldeep.jetpackcompose.constraintlayoutinjetpackcompose.ui.theme.ConstraintLayoutInJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val constraints = ConstraintSet {

                val redBox = createRefFor("redBox")
                val greenBox = createRefFor("greenBox")
                val redBox1 = createRefFor("redBox1")
                val greenBox1 = createRefFor("greenBox1")
                val greenBox2 = createRefFor("greenBox2")
                val redBox2 = createRefFor("redBox2")
                val redBox3 = createRefFor("redBox3")
                val redBox4 = createRefFor("redBox4")
                val redBox5 = createRefFor("redBox5")
                val greenBox3 = createRefFor("greenBox3")
                val greenBox4 = createRefFor("greenBox4")
                val greenBox5 = createRefFor("greenBox5")
                val greenBox6 = createRefFor("greenBox6")
                val guideline = createGuidelineFromTop(100.dp)
                val guideline2 = createGuidelineFromStart(0.485f)
                val guideline3 = createGuidelineFromStart(300.dp)
                val guideline4 = createGuidelineFromTop(0.dp)
//                val guideline3 = createGuidelineFromAbsoluteRight(0.dp)

                constrain(redBox){
                    top.linkTo(guideline)
//                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    width = Dimension.value(100.dp)
                    height = Dimension.value(100.dp)
                }
                
                constrain(greenBox){
                    top.linkTo(parent.top)
                    start.linkTo(redBox.end)
//                    end.linkTo(parent.end)
                    width = Dimension.value(100.dp)
                    height = Dimension.value(100.dp)
                }

                constrain(greenBox1){
                    top.linkTo(redBox.bottom)
                    start.linkTo(redBox.end)
//                    end.linkTo(parent.end)
                    width = Dimension.value(100.dp)
                    height = Dimension.value(100.dp)
                }

                constrain(redBox1)
                {
                    top.linkTo(greenBox1.bottom)
                    start.linkTo(parent.start)
                    width = Dimension.value(100.dp)
                    height = Dimension.value(100.dp)
                }

                constrain(greenBox2)
                {
                    top.linkTo(redBox1.bottom)
                    start.linkTo(redBox.end)
                    width = Dimension.value(100.dp)
                    height = Dimension.value(100.dp)

                }

                constrain(redBox2)
                {
                    top.linkTo(greenBox2.bottom)
                    start.linkTo(parent.start)
                    width = Dimension.value(100.dp)
                    height = Dimension.value(100.dp)
                }

                constrain(redBox3)
                {
                    top.linkTo(greenBox.bottom)
                    start.linkTo(guideline2)
                    width = Dimension.value(100.dp)
                    height = Dimension.value(100.dp)
                }

                constrain(redBox4)
                {
                    top.linkTo(greenBox1.bottom)
                    start.linkTo(guideline2)
                    width = Dimension.value(100.dp)
                    height = Dimension.value(100.dp)
                }

                constrain(redBox5)
                {
                    top.linkTo(greenBox2.bottom)
                    start.linkTo(guideline2)
                    width = Dimension.value(100.dp)
                    height = Dimension.value(100.dp)
                }

                constrain(greenBox3)
                {
                    top.linkTo(parent.top)
                    start.linkTo(guideline3)
                    width = Dimension.value(100.dp)
                    height = Dimension.value(100.dp)

                }

                constrain(greenBox4)
                {
                    top.linkTo(redBox3.bottom)
                    start.linkTo(guideline3)
                    width = Dimension.value(100.dp)
                    height = Dimension.value(100.dp)

                }

                constrain(greenBox5)
                {
                    top.linkTo(redBox4.bottom)
                    start.linkTo(guideline3)
                    width = Dimension.value(100.dp)
                    height = Dimension.value(100.dp)

                }




//                createHorizontalChain(redBox,greenBox)
            }
            
         ConstraintLayout(constraintSet = constraints, modifier = Modifier.fillMaxSize()) {


                    Box(modifier = Modifier
                        .background(Color.Red)
                        .layoutId("redBox"))

                    Box(modifier = Modifier
                        .layoutId("greenBox")
                        .background(Color.Green))

             Box(modifier = Modifier
                 .background(Color.Green)
                 .layoutId("greenBox1"))

             Box(modifier = Modifier
                 .background(Color.Red)
                 .layoutId("redBox1"))

             Box(modifier = Modifier
                 .background(Color.Green)
                 .layoutId("greenBox2"))

             Box(modifier = Modifier
                 .background(Color.Red)
                 .layoutId("redBox2"))

             Box(modifier = Modifier
                 .background(Color.Red)
                 .layoutId("redBox3"))

             Box(modifier = Modifier
                 .background(Color.Red)
                 .layoutId("redBox4"))

             Box(modifier = Modifier
                 .background(Color.Red)
                 .layoutId("redBox5"))

             Box(modifier = Modifier
                 .background(Color.Green)
                 .layoutId("greenBox3"))


             Box(modifier = Modifier
                 .background(Color.Green)
                 .layoutId("greenBox4"))

    Box(modifier = Modifier
                 .background(Color.Green)
                 .layoutId("greenBox5"))




//                 Box(modifier = Modifier
//                     .background(Color.Red)
//                     .layoutId("redBox"))
//
//                 Box(modifier = Modifier
//                     .layoutId("greenBox")
//                     .background(Color.Green))
//
//                 Box(modifier = Modifier
//                     .background(Color.Red)
//                     .layoutId("redBox"))
//
//                 Box(modifier = Modifier
//                     .layoutId("greenBox")
//                     .background(Color.Green))
//
//                 Box(modifier = Modifier
//                     .background(Color.Red)
//                     .layoutId("redBox"))
//
//                 Box(modifier = Modifier
//                     .layoutId("greenBox")
//                     .background(Color.Green))


//
//                Box(modifier = Modifier
//                    .background(Color.Red)
//                    .layoutId("redBox"))
//
//                Box(modifier = Modifier
//                    .layoutId("greenBox")
//                    .background(Color.Green))
                
            }

        }
    }
}

