package com.example.owldemo.SC;
import javax.persistence.*;
@Entity
@Table(name = "packageScan")
public class safetyScan {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String packageName;

    private String ErrorID;
    private String Tags;
    private String Description;
    private String BaseScore;
    private String BaseSeverity;
    private String URL;

    public String getBaseSCore() {
        return BaseScore;
    }

    public String getBaseSeverity() {
        return BaseSeverity;
    }

    public String getDescription() {
        return Description;
    }

    public String getErrorID() {
        return ErrorID;
    }

    public String getPackageName() {
        return packageName;
    }

    public String getTags() {
        return Tags;
    }

    public String getURL() {
        return URL;
    }

    public void setBaseSCore(String  baseScore) {
        BaseScore = baseScore;
    }

    public void setBaseSeverity(String baseSeverity) {
        BaseSeverity = baseSeverity;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setErrorID(String errorID) {
        ErrorID = errorID;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public void setTags(String tags) {
        Tags = tags;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
