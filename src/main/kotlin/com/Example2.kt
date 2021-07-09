package com

import kotlinx.serialization.json.Json

fun main() {

    // Serializing
    val person = Person("Mark", "Ng")
    val string = Json.encodeToString(Person.serializer(), person)
    println(string)

    // Deserializing
    val obj = Json.decodeFromString(Person.serializer(), string)
    println(obj)
}
