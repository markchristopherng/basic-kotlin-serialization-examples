package com

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

fun main() {

    val jsonString = """
        
        {"firstName":Joe,"lastName":"Smith", age : 10}

    """.trimIndent()

    val jsonParser = Json { isLenient = true; ignoreUnknownKeys = true; }

    val data = jsonParser.decodeFromString<Person>(jsonString)
    println(data)
}
