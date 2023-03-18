package com.nfragiskatos.bluetoothchat.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.nfragiskatos.bluetoothchat.ui.theme.BluetoothChatTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BluetoothChatTheme {

            }
        }
    }
}