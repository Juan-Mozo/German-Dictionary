package com.juanimozo.germandictionary.feature_dictionary.presentation

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.juanimozo.germandictionary.feature_dictionary.domain.model.Definition
import com.juanimozo.germandictionary.feature_dictionary.domain.model.Meaning
import com.juanimozo.germandictionary.feature_dictionary.domain.model.WordInfo
import com.juanimozo.germandictionary.ui.theme.*


@Composable
fun WordInfoItem(
    wordInfo: WordInfo,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        // Word Title
        Text(
            text = wordInfo.word,
            fontSize = 30.sp,
            fontFamily = FontMontserrat,
            fontWeight = FontWeight.Bold,
            color = DarkNavy
        )
        // Phonetic Subtitle
        Text(
            text = wordInfo.phonetic,
            fontSize = 20.sp,
            fontFamily = FontMontserrat,
            fontWeight = FontWeight.Light,
            color = Color.DarkGray
        )
        Spacer(modifier = Modifier.height(16.dp))
        wordInfo.meanings.forEach { meaning ->
            // Part of Speech Title
            Text(
                text = meaning.partOfSpeech,
                fontSize = 20.sp,
                fontFamily = FontMontserrat,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(8.dp))
            meaning.definitions.forEachIndexed { i, definition ->
                Column() {
                    // Definition Body List
                    Text(
                        text = buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    fontWeight = FontWeight.Bold
                                )
                            ) {
                                append("${i + 1}. ")
                            }
                            append(definition.definition)
                        },
                        fontSize = 18.sp,
                        fontFamily = FontQuicksand,
                        fontWeight = FontWeight.Normal
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    definition.example?.let { example ->
                        // Definition Example
                        Text(
                            text = "Example: $example",
                            fontSize = 15.sp,
                            fontFamily = FontQuicksand,
                            fontWeight = FontWeight.Light
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun wordInfoLayoutPreview() {
    val list = listOf<Definition>(
        Definition(
            definition = "Grossvater",
            example = "wir fahren zum Opa",
            synonyms = emptyList(),
            antonyms = emptyList()
        ),
        Definition(
            definition = "alter, älterer Mann",
            example = "was will denn der Opa hier?",
            synonyms = emptyList(),
            antonyms = emptyList()
        ),
        Definition(
            definition = "männlicher, Erwachsener",
            example = "",
            synonyms = emptyList(),
            antonyms = emptyList()
        )
    )
    GermanDictionaryTheme {
        WordInfoItem(
            wordInfo = WordInfo(
                word = "Opa",
                phonetic = "Ópa",
                meanings = List<Meaning>(1){
                    Meaning(
                        partOfSpeech = "Substantiv, maskulin",
                        definitions = list
                    )
                }
            )
        )
    }
}
