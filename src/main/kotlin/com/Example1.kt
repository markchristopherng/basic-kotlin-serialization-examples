package com

import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Serializable
data class Person(val firstName: String, val lastName: String)

data class Address(val line1: String, val line2: String, val suburb: String, val state: String, val postcode: Int)

fun main() {

    // Serializing
    val person = Person("Mark", "Ng")
    val string = Json.encodeToString(person)
    println(string)

    // Deserializing
    val obj = Json.decodeFromString<Person>(string)
    println(obj)
}
