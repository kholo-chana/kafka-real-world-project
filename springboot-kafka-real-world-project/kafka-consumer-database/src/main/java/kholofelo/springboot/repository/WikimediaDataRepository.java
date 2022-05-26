package kholofelo.springboot.repository;

import kholofelo.springboot.entity.WikiMediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaDataRepository extends JpaRepository<WikiMediaData,Long> {
}
