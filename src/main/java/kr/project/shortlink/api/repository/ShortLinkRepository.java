package kr.project.shortlink.api.repository;

import kr.project.shortlink.api.domain.entity.ShortLinkEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.net.URL;
import java.util.Optional;

public interface ShortLinkRepository extends JpaRepository<ShortLinkEntity, Long> {

    Optional<ShortLinkEntity> findByUri(URL uri);
}