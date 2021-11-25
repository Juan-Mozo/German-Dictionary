package com.juanimozo.germandictionary.feature_dictionary.data.local

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.google.gson.reflect.TypeToken
import com.juanimozo.germandictionary.feature_dictionary.data.util.GsonParser
import com.juanimozo.germandictionary.feature_dictionary.domain.model.Meaning

// To avoid creating multiple tables to save WordInfo data in room, Meaning is converted to Json
@ProvidedTypeConverter
class Converters(
    private val jsonParser: GsonParser
) {

    // Json to List<Meaning>
    @TypeConverter
    fun fromMeaningsJson(json: String): List<Meaning> {
        return jsonParser.fromJson<ArrayList<Meaning>>(
            json,
            object: TypeToken<ArrayList<Meaning>>(){}.type
        ) ?: emptyList()
    }

    // List<Meaning> to Json
    @TypeConverter
    fun toMeaningsJson(meanings: List<Meaning>): String {
        return jsonParser.toJson(
            meanings,
            object: TypeToken<ArrayList<Meaning>>(){}.type
        ) ?: "[]"
    }

}