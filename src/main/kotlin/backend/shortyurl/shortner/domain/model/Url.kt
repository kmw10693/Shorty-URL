package backend.shortyurl.shortner.domain.model

import java.time.Instant

class Url private constructor(
    val id: Long? = null,
    val value: UrlValue
) {
    companion object {
        fun of(raw: String) = Url(value = UrlValue(raw))
        fun rehydrate(id: Long, raw: String) = Url(id, UrlValue(raw))
    }
}