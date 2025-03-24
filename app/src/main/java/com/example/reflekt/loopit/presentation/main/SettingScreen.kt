package com.exa.android.reflekt.loopit.presentation.main

import androidx.compose.material3.OutlinedTextField
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.exa.android.reflekt.loopit.data.remote.main.ViewModel.ChatViewModel
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun SettingScreen(
    viewModel: ChatViewModel
) {
    // val viewModel: ChatViewModel = hiltViewModel()
    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var role by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // First Name Text Field
        OutlinedTextField(
            value = firstName,
            onValueChange = { newValue -> firstName = newValue },
            label = { Text("First Name") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Last Name Text Field
        OutlinedTextField(
            value = lastName,
            onValueChange = { newValue -> lastName = newValue },
            label = { Text("Last Name") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Role Text Field
        OutlinedTextField(
            value = role,
            onValueChange = { newValue -> role = newValue },
            label = { Text("Role") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Email Text Field
        OutlinedTextField(
            value = email,
            onValueChange = { newValue -> email = newValue },
            label = { Text("Email") },
            singleLine = true,
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Email),
            modifier = Modifier.fillMaxWidth()
        )


        Spacer(modifier = Modifier.height(24.dp))

        // Save Button
        Button(
            onClick = {
                // Call the ViewModel function to save the user data
                viewModel.insertUser(firstName, lastName, role, email)
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text(text = "Save")
        }
    }
}
//
//@Preview(showBackground = true)
//@Composable
//fun ShowPreview() {
//    val viewModel
//    SettingScreen()
//}