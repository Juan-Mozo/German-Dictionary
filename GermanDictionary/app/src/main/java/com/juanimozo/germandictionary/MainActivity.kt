package com.juanimozo.germandictionary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.juanimozo.germandictionary.feature_dictionary.presentation.WordInfoItem
import com.juanimozo.germandictionary.feature_dictionary.presentation.WordInfoViewModel
import com.juanimozo.germandictionary.ui.theme.*
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GermanDictionaryTheme {
                val viewModel: WordInfoViewModel = hiltViewModel()
                val state = viewModel.state.value
                val scaffoldState = rememberScaffoldState()

                LaunchedEffect(key1 = true) {
                    viewModel.eventFlow.collectLatest { event ->
                        when (event) {
                            is WordInfoViewModel.UIEvent.ShowSnackBar -> {
                                scaffoldState.snackbarHostState.showSnackbar(
                                    message = event.message
                                )
                            }
                        }
                    }
                }

                Scaffold(
                    scaffoldState = scaffoldState
                ) {
                    Box(
                        modifier = Modifier
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(16.dp)
                        ) {
                            TextField(
                                value = viewModel.searchQuery.value,
                                onValueChange = viewModel::onSearch,
                                modifier = Modifier.fillMaxWidth().background(Color.Transparent),
                                shape = RoundedCornerShape(topStart = 4.dp, topEnd = 4.dp),
                                colors = TextFieldDefaults.textFieldColors(
                                    backgroundColor = Beige100,
                                    cursorColor = Color.Red
                                ),
                                keyboardOptions = KeyboardOptions(
                                    capitalization = KeyboardCapitalization.Words,
                                    keyboardType = KeyboardType.Text
                                ),
                                singleLine = true,
                                leadingIcon = {
                                              Icon(Icons.Default.Search, contentDescription = "Search")
                                },
                                placeholder = {
                                    Text(
                                        text = "Search",
                                        fontFamily = FontMontserrat,
                                        fontWeight = FontWeight.Light
                                    )
                                }
                            )
                            Spacer(modifier = Modifier.height(16.dp))
                            LazyColumn(modifier = Modifier.fillMaxSize()) {
                                items(state.wordInfoItems.size) { i ->
                                    val wordInfo = state.wordInfoItems[i]
                                    if (i > 0) {
                                        Spacer(modifier = Modifier.height(8.dp))
                                    }
                                    WordInfoItem(wordInfo = wordInfo)
                                    if (i < state.wordInfoItems.size - 1) {
                                        Spacer(modifier = Modifier.height(6.dp))
                                    }
                                }
                            }

                        }
                    }
                }
            }
        }
    }
}