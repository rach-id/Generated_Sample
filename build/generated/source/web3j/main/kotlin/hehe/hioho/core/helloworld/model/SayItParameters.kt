package hehe.hioho.core.helloworld.model

import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.String

data class SayItParameters(
    @JsonProperty(value = "greeting")
    val greeting: String
)
