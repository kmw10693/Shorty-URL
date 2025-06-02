package backend.shortyurl.shortner.domain.model

import lombok.`val`

@JvmInline
value class UrlValue(val value: String) {
    init { require(Regex("^https://.+").matches(value))
    }
}