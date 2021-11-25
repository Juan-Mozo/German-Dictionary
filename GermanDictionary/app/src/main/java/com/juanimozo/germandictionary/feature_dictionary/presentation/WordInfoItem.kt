package com.juanimozo.germandictionary.feature_dictionary.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.juanimozo.germandictionary.feature_dictionary.domain.model.Definition
import com.juanimozo.germandictionary.feature_dictionary.domain.model.Meaning
import com.juanimozo.germandictionary.feature_dictionary.domain.model.WordInfo
import com.juanimozo.germandictionary.ui.theme.DarkNavy
import com.juanimozo.germandictionary.ui.theme.GermanDictionaryTheme


@Composable
fun WordInfoItem(
    wordInfo: WordInfo,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(
            text = wordInfo.word,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = DarkNavy
        )
        Text(
            text = wordInfo.phonetic,
            fontWeight = FontWeight.Light,
            color = Color.DarkGray
        )
        Spacer(modifier = Modifier.height(16.dp))
        wordInfo.meanings.forEach { meaning ->
            Text(
                text = meaning.partOfSpeech,
                fontWeight = FontWeight.Bold
            )
            meaning.definitions.forEachIndexed { i, definition ->
                Text(text = "${i + 1}. ${definition.definition}")
                Spacer(modifier = Modifier.height(8.dp))
                definition.example?.let { example ->
                    Text(text = "Example: $example")
                }
                Spacer(modifier = Modifier.height(8.dp))
            }

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun wordInfoLayoutPreview() {
    GermanDictionaryTheme {
        WordInfoItem(
            wordInfo = WordInfo(
                word = "Opa",
                phonetic = "Ópa",
                meanings = List<Meaning>(3){
                    Meaning(
                        partOfSpeech = "Substantiv, maskulin",
                        definitions = List<Definition>(3) {
                            Definition(
                                definition = "Grossvater",
                                example = "wir fahren zum Opa",
                                synonyms = emptyList(),
                                antonyms = emptyList()
                            )
                            Definition(
                                definition = "alter, älterer Mann",
                                example = "was will denn der Opa hier?",
                                synonyms = emptyList(),
                                antonyms = emptyList()
                            )
                            Definition(
                                definition = "männlicher, Erwachsener",
                                example = "",
                                synonyms = emptyList(),
                                antonyms = emptyList()
                            )
                        }
                    )
                }
            ))
    }
}
