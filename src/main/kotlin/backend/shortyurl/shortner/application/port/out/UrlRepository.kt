package backend.shortyurl.shortner.application.port.out

import backend.shortyurl.shortner.domain.model.Url

interface UrlRepository {
    fun save(url: Url): Url
}