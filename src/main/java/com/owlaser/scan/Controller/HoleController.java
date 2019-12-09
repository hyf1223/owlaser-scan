package com.owlaser.scan.Controller;

import com.owlaser.scan.DAO.Hole;
import com.owlaser.scan.DAO.HoleRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class HoleController {
    private final HoleRepository hole;

    public HoleController(HoleRepository hole) {
        this.hole = hole;
    }
    @GetMapping(value = "/hole")
    @ResponseBody
    List<Hole> findByGroupIdAndArtifactId(@RequestParam String groupId, @RequestParam String artifactId, @RequestParam String version) {
        return hole.findByGroupIdAndArtifactIdAndVersion(groupId,artifactId,version);
    }
}
