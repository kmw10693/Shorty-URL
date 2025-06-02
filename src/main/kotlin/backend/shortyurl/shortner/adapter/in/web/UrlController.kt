package backend.shortyurl.shortner.adapter.`in`.web

import backend.shortyurl.shortner.application.port.`in`.RegisterUseCase
import backend.shortyurl.shortner.application.service.RegisterUrlService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/urls")
class UrlController(
    private val register: RegisterUrlService

) {
    @PostMapping
    fun create(@RequestBody dto: Req) =
        register.handle(RegisterUseCase.Command(dto.url))

    data class Req(val url: String)
}