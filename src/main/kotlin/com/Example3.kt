package com

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

val jsonString = """
 [
   {
      "firstName":"Mark",
      "lastName":"Ng"
   },
   {
      "firstName":"Murray",
      "lastName":"Brandon"
   },
   {
      "firstName":"Chris",
      "lastName":"Robertson"
   }
]
""".trimIndent()

fun main() {

    val data = Json.decodeFromString<List<Person>>(jsonString)
    println(data)
}
