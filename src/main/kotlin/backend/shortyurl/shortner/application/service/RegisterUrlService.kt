package backend.shortyurl.shortner.application.service

import backend.shortyurl.shortner.application.port.`in`.RegisterUseCase
import backend.shortyurl.shortner.application.port.out.UrlRepository
import backend.shortyurl.shortner.domain.model.Url
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service @Transactional
class RegisterUrlService(
    private val repo: UrlRepository
) : RegisterUseCase {
    override fun handle(cmd: RegisterUseCase.Command): Result =
        repo.save(Url.of(cmd.raw))
            .let { RegisterUseCase.Result(it.id!!, it.value.value) }

}