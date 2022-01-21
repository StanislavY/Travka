package com.example.travka

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.semantics.SemanticsProperties.Text

@Composable
fun MainComposable () {

      /*  Column {
            for (num in 1..13) {
                Button(onClick = {  }) {
                    Text("Ячейка $num")

                }
                Text("нажата кнопка $num")
            }
        }*/



    Column {

        Button(onClick = {    }) {
            Text("Ячейка 1")
                    }
        Button(onClick = {    }) {
            Text("Ячейка 2")
        }
        Button(onClick = {    }) {
            Text("Ячейка 3")
        }
        Button(onClick = {    }) {
            Text("Ячейка 4")
        }
        Button(onClick = {    }) {
            Text("Ячейка 5")
        }
        Button(onClick = {    }) {
            Text("Ячейка 6")
        }
        Button(onClick = {    }) {
            Text("Ячейка 7")
        }
        Button(onClick = {    }) {
            Text("Ячейка 8")
        }
        Button(onClick = {    }) {
            Text("Ячейка 9")
        }
    }

}






