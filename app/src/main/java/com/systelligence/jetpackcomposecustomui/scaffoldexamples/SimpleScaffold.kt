package com.systelligence.jetpackcomposecustomui.scaffoldexamples

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Place

import androidx.compose.material3.ExperimentalMaterial3Api

import androidx.compose.material3.*

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.systelligence.jetpackcomposecustomui.Greeting

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleScaffold() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            // TopBar
             TopAppBar(
                 title = {
                     Box(modifier = Modifier.fillMaxSize(),
                         contentAlignment = Alignment.Center) {
                         Text(text = "Jetpack Compose")
                     }
                 },
             )
        },

        bottomBar = {
            // BottomBar
             BottomAppBar {
                 Box(
                     modifier = Modifier.fillMaxSize(),
                     contentAlignment = Alignment.Center
                 ) {
                     Text(text = "Android")
                 }
             }
        },
        floatingActionButtonPosition = FabPosition.Center,
        floatingActionButton = {
            // Floating Action Button
            Row(
                modifier = Modifier.fillMaxWidth().padding(16.dp),
                horizontalArrangement = Arrangement.Start
            ) {
                Column {
                    FloatingActionButton(
                        onClick = { /*TODO*/ },
                        content = {
                            Icon(Icons.Default.Place, contentDescription = "Map")
                        }
                    )
                    Spacer(modifier = Modifier.height(18.dp))  // Space between buttons
                    FloatingActionButton(
                        onClick = { /*TODO*/ },
                        content = {
                            Icon(Icons.Filled.Add, contentDescription = "Add")
                        }
                    )
                }
            }
        },
    ) { innerPadding ->
        Box(modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize(),
            contentAlignment = Alignment.Center
            ){
            Greeting(
                name = "Android",
                modifier = Modifier.padding(innerPadding)
            )
        }

    }
}


