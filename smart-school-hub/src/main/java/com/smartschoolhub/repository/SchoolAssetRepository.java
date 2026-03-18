package com.smartschoolhub.repository;

import com.smartschoolhub.domain.SchoolAsset;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SchoolAssetRepository extends JpaRepository<SchoolAsset, Long> {
    Optional<SchoolAsset> findByAssetTag(String assetTag);
}
