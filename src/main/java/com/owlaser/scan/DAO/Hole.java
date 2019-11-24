package com.owlaser.scan.DAO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String groupId;
    private String artifactId;
    private String version;
    private String Tags;
    private String Description;
    private String BaseScore;
    private String BaseSeverity;
    private String URL;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTags() {
        return Tags;
    }

    public void setTags(String tags) {
        Tags = tags;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getBaseScore() {
        return BaseScore;
    }

    public void setBaseScore(String baseScore) {
        BaseScore = baseScore;
    }

    public String getBaseSeverity() {
        return BaseSeverity;
    }

    public void setBaseSeverity(String baseSeverity) {
        BaseSeverity = baseSeverity;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
