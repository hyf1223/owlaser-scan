package com.owlaser.scan.DAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HoleRepository extends JpaRepository<Hole,Long> {
    List<Hole> findByGroupIdAndArtifactIdAndVersion(@Param("groupId") String groupId, @Param("artifactId") String artifactId, @Param("version") String version);
}
