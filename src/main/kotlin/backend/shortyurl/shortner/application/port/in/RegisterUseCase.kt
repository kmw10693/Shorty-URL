package backend.shortyurl.shortner.application.port.`in`

interface RegisterUseCase {
    fun handle(cmd: Command): Result
    data class Command(val raw: String)
    data class Result(val id: Long, val raw: String)
}