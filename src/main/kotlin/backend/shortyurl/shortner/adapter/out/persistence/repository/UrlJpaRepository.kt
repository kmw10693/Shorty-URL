package backend.shortyurl.shortner.adapter.out.persistence.repository

import backend.shortyurl.shortner.adapter.out.persistence.entity.UrlJpaEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UrlJpaRepository : JpaRepository<UrlJpaEntity, Long> {
}