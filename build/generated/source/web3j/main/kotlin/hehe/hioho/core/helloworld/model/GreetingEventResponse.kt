package hehe.hioho.core.helloworld.model

import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.String

data class GreetingEventResponse(
    @JsonProperty(value = "greet")
    val greet: String
)
